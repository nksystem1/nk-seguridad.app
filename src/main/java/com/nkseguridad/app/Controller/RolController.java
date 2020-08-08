package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Rol;
import com.nkseguridad.app.Service.IRolService;



@RestController
@RequestMapping("/api")
public class RolController {
	
	@Autowired
	private IRolService rolservice;
	
	@GetMapping("/rol")
	public ResponseEntity<?> ListarRoles(){
		List<Rol> LstRoles = rolservice.findAll();
		if (LstRoles!=null) {
			if (LstRoles.size()!=0) {
				return new ResponseEntity<>(LstRoles,HttpStatus.OK);
			}
			else
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		else
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/rol/{id}")
	public ResponseEntity<?> ObtenerRol(@PathVariable(name = "id") Long Id){
		Rol Roles = rolservice.findbyRol(Id);
		if (Roles!=null) {
			return new ResponseEntity<>(Roles, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("rol/{id}")
	public ResponseEntity<?> EliminarRol(@PathVariable(name="id") Long id){
		Rol Roles = rolservice.findbyRol(id);
		if (Roles!=null) {
			rolservice.deleteById(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("rol")
	public ResponseEntity<?> Guardar(){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
