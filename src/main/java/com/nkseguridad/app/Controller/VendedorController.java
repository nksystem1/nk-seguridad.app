package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Vendedor;
import com.nkseguridad.app.Service.IVendedorService;

@RestController
@RequestMapping("api")
public class VendedorController {

	@Autowired
	private IVendedorService VendedorService;

	@GetMapping("vendedor")
	public ResponseEntity<?> ListarVendedores() {
		List<Vendedor> LstVendedor = VendedorService.findAll();
		if (LstVendedor != null) {
			if (LstVendedor.size() != 0) {
				return new ResponseEntity<>(LstVendedor, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("vendedor/{codigo}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "codigo") String codigo) {
		Vendedor Vendedor = VendedorService.findByCodigo(codigo);
		if (Vendedor != null) {
			return new ResponseEntity<>(Vendedor, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("vendedor")
	public ResponseEntity<?> GuardarVendedor(@RequestBody Vendedor vendedor) {
		if (!VendedorService.findByExisteCodigo(vendedor.getCodigo())) {
			Vendedor VendedorObj = VendedorService.save(vendedor);
			return new ResponseEntity<>(VendedorObj, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}

	@PutMapping("vendedor")
	public ResponseEntity<?> ModificarVendedor(@RequestBody Vendedor Vendedor) {
		Vendedor VendedorUpdate = VendedorService.findByCodigo(Vendedor.getCodigo());
		if (VendedorUpdate != null) {
			VendedorUpdate.setNombre(Vendedor.getNombre());
			VendedorUpdate.setCobrador(Vendedor.getCobrador());
			VendedorUpdate.setCodnegocio(Vendedor.getCodnegocio());
			VendedorUpdate.setCodusuario(Vendedor.getCodusuario());
			VendedorUpdate.setCodzona(Vendedor.getCodzona());
			VendedorUpdate.setCorreoe(Vendedor.getCorreoe());
			VendedorUpdate.setDireccionfiscal(Vendedor.getDireccionfiscal());
			VendedorUpdate.setInterno(Vendedor.getInterno());
			VendedorUpdate.setMontometa(Vendedor.getMontometa());
			VendedorUpdate.setLstComisiones(Vendedor.getLstComisiones());
			Vendedor VendedorResult = VendedorService.updaVendedor(VendedorUpdate);
			if (VendedorResult != null) {
				return new ResponseEntity<>(VendedorResult, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
