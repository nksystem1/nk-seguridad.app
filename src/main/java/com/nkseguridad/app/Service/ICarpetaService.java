package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Carpeta;

public interface ICarpetaService {
	
	public List<Carpeta> findAll();
	public Carpeta save(Carpeta carpeta);
	public Carpeta findById(Long id);

}
