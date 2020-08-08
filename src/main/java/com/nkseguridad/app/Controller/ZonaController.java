package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Zona;
import com.nkseguridad.app.Service.IZonaService;

@RestController
@RequestMapping("api")
public class ZonaController {

	@Autowired
	private IZonaService ZonaService;
	
	@GetMapping("zona")
	public ResponseEntity<?> ListarZonas(){
		List<Zona> LstZonas = ZonaService.findAll();
		if (LstZonas!=null) {
			if (LstZonas.size()!=0) {
				return new ResponseEntity<>(LstZonas, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}
