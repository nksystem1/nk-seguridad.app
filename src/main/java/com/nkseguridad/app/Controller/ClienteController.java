package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Service.IClienteService;

@RestController
@RequestMapping("api")
public class ClienteController {
	
	@Autowired
	private IClienteService ClienteService;
	
	@GetMapping("cliente")
	public ResponseEntity<?> ListarClientes(){
		List<Cliente> LstClientes = ClienteService.findAll();
		if (LstClientes!=null) {
			if (LstClientes.size()!=0) {
				return new ResponseEntity<>(LstClientes,HttpStatus.OK);
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
