package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Repository.IClienteRepository;
import com.nkseguridad.app.Service.IClienteService;
@Service
public class ClienteService implements IClienteService {

	@Autowired
	private IClienteRepository ClienteRepository;
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>)ClienteRepository.findAll();
	}

}
