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

import com.nkseguridad.app.Entity.Negocio;
import com.nkseguridad.app.Service.INegocioService;

@RestController
@RequestMapping("api")
public class NegocioController {

	@Autowired
	private INegocioService NegocioService;
	
	@GetMapping("negocio")
	public ResponseEntity<?> ListarNegocios(){		
		List<Negocio> LstNegocios = NegocioService.findAll();
		if (LstNegocios!=null) {
			if (LstNegocios.size()!=0) {
				return new ResponseEntity<>(LstNegocios,HttpStatus.OK);
			}
			else
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("negocio/{codigo}")
	public ResponseEntity<?> ObtenerNegocioCodigo(@PathVariable(name = "codigo") String codigo){
		
		Negocio ObjNegocio = NegocioService.findByCodigo(codigo);
		if (ObjNegocio!=null) {
			return new ResponseEntity<>(ObjNegocio, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("negocio")
	public ResponseEntity<?> GuardarNegocio(@RequestBody Negocio negocio){
		if (!NegocioService.findByExisteCodigo(negocio)) {
			Negocio negocioObj = NegocioService.save(negocio);
			return new ResponseEntity<>(negocioObj,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping("negocio")
	public ResponseEntity<?> ActualizarNegocio(@RequestBody Negocio negocio){
		if (!NegocioService.findByExisteCodigo(negocio)) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		else {
			Negocio negocioObj = NegocioService.updaNegocio(negocio);
			return new ResponseEntity<>(negocioObj, HttpStatus.OK);
		}
		
	}
}
