package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Ruta;
import com.nkseguridad.app.Repository.IRutaRepository;
import com.nkseguridad.app.Service.IRutaService;

@Service
public class RutaService implements IRutaService {

	@Autowired
	private IRutaRepository RutaRepository;
	@Override
	public List<Ruta> findAll() {
		// TODO Auto-generated method stub
		return (List<Ruta>)RutaRepository.findAll();
	}
	@Override
	public Ruta findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return RutaRepository.findById(codigo).orElse(null);
	}
	@Override
	public boolean existebyCodigo(String codigo) {
		// TODO Auto-generated method stub
		return RutaRepository.existsById(codigo);
	}
	@Override
	public Ruta save(Ruta ruta) {
		// TODO Auto-generated method stub
		return RutaRepository.save(ruta);
	}

}
