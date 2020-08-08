package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Zona;
import com.nkseguridad.app.Repository.IZonaRepository;
import com.nkseguridad.app.Service.IZonaService;

@Service
public class ZonaService implements IZonaService {

	@Autowired
	private IZonaRepository ZonaRepository;
	@Override
	
	public List<Zona> findAll() {
		// TODO Auto-generated method stub
		return (List<Zona>)ZonaRepository.findAll();
	}

	@Override
	public Zona findByCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return ZonaRepository.findById(codigo).orElse(null);
	}

	@Override
	public Zona save(Zona zona) {
		// TODO Auto-generated method stub
		return ZonaRepository.save(zona);
	}

	@Override
	public Zona updaZona(Zona zona) {
		// TODO Auto-generated method stub
		return ZonaRepository.save(zona);
	}

}
