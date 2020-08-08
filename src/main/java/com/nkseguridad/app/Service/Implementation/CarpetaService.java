package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Carpeta;
import com.nkseguridad.app.Repository.ICarpetaRepository;
import com.nkseguridad.app.Service.ICarpetaService;

@Service
public class CarpetaService implements ICarpetaService {

	@Autowired
	private ICarpetaRepository CarpetaRepository;
	
	@Override
	public List<Carpeta> findAll() {
		// TODO Auto-generated method stub
		return (List<Carpeta>) CarpetaRepository.findAll();
	}

	@Override
	public Carpeta save(Carpeta carpeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carpeta findById(Long id) {
		// TODO Auto-generated method stub
		return CarpetaRepository.findById(id).orElse(null);
	}

}
