package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Zona;

public interface IZonaService {

	public List<Zona> findAll();
	public Zona findByCodigo(Long codigo);
	public Zona save(Zona zona);
	public Zona updaZona(Zona zona);
}
 