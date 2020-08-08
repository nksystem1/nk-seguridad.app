package com.nkseguridad.app.Controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nkseguridad.app.Entity.Ruta;
import com.nkseguridad.app.Service.IRutaService;
import com.nkseguridad.app.Service.Implementation.VendedorService;

@Controller
@RequestMapping("api")
public class RutaController {

	@Autowired
	private IRutaService RutaService;

	@GetMapping("ruta")
	public ResponseEntity<?> ListarRutas() {
		List<Ruta> LstRutas = RutaService.findAll();
		if (LstRutas != null) {
			if (LstRutas.size() != 0) {
				return new ResponseEntity<>(LstRutas, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("ruta/{codigo}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "codigo") String codigo) {

		Ruta Ruta = RutaService.findByCodigo(codigo);
		if (Ruta != null) {
			return new ResponseEntity<>(Ruta, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("ruta")
	public ResponseEntity<?> ModificarRuta(@RequestBody Ruta Ruta) {
		try {
			Ruta RutaUpdate = RutaService.findByCodigo(Ruta.getCodigo());
			if (RutaUpdate!=null) {
				RutaUpdate.setCodigovendedor(Ruta.getCodigovendedor());
				RutaUpdate.setCodigozona(Ruta.getCodigozona());
				RutaUpdate.setCodigozona(Ruta.getCodigozona());
				RutaUpdate.setCodnegocio(Ruta.getCodnegocio());
				RutaUpdate.setDesdedos(Ruta.getDesdedos());
				RutaUpdate.setDesdeuno(Ruta.getDesdeuno());
				RutaUpdate.setHastados(Ruta.getHastados());
				RutaUpdate.setHastauno(Ruta.getHastauno());
				RutaUpdate.setNombre(Ruta.getNombre());
				RutaUpdate.setVendedor(Ruta.getVendedor());
				RutaUpdate.setZona(Ruta.getZona());
				Ruta RutaOut= RutaService.save(RutaUpdate);
				if (RutaOut!=null) {
					return new ResponseEntity<>(RutaOut, HttpStatus.OK);
				}
				else {
					return new ResponseEntity<Void>(HttpStatus.CONFLICT);
				}
			} 
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} 
		catch (Exception m) {
			System.out.print("Error guardando "+m);
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
}
