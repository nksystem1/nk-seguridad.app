package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Carpeta;
import com.nkseguridad.app.Service.ICarpetaService;

@RestController
@RequestMapping("api")

public class CarpetaController {
	
	@Autowired
	private ICarpetaService CarpetaService;
	
	@GetMapping("carpeta")
	public ResponseEntity<?> ListarCarpetas(){
		List<Carpeta> LstCarpetas = CarpetaService.findAll();
		if (LstCarpetas!=null) {
			if (LstCarpetas.size()!=0) {
				return new ResponseEntity<>(LstCarpetas, HttpStatus.OK);
			}
			else
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		else
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("carpeta/{id}")
	public ResponseEntity<?> ObtenerCarpetaId(@PathVariable(name = "id") Long id){
		Carpeta Carpeta = CarpetaService.findById(id);
		if (Carpeta!=null) {
			return new ResponseEntity<>(Carpeta, HttpStatus.OK);
		}
		else
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

}
