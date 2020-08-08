package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Rol;
import com.nkseguridad.app.Repository.IRolRepository;
import com.nkseguridad.app.Service.IRolService;

@Service
public class RolService implements IRolService {

	@Autowired
	private IRolRepository Rolrepository;
	@Override
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return (List<Rol>)Rolrepository.findAll();
	}

	@Override
	public Rol save(Rol rol) {
		// TODO Auto-generated method stub
		return Rolrepository.save(rol);
	}

	@Override
	public Rol findbyRol(Long id) {
		// TODO Auto-generated method stub
		return Rolrepository.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		Rolrepository.deleteById(id);
	}

}
