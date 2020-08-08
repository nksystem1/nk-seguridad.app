package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Vendedor;
import com.nkseguridad.app.Repository.IVendedorRepository;
import com.nkseguridad.app.Service.IVendedorService;
@Service
public class VendedorService implements IVendedorService {

	@Autowired
	private IVendedorRepository VendedorRepository;
	
	@Override
	public List<Vendedor> findAll() {
		// TODO Auto-generated method stub
		return (List<Vendedor>)VendedorRepository.findAll();
	}

	@Override
	public Vendedor findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return VendedorRepository.findById(codigo).orElse(null);
	}

	@Override
	public Vendedor save(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return VendedorRepository.save(vendedor);
	}

	@Override
	public Vendedor updaVendedor(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return VendedorRepository.save(vendedor);
	}

	@Override
	public boolean findByExisteCodigo(String codigo) {
		// TODO Auto-generated method stub
		return VendedorRepository.existsById(codigo);
	}

}
