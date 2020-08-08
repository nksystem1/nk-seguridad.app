package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Rol;

public interface IRolService {
	public List<Rol> findAll();
	public Rol save(Rol rol);
	public Rol findbyRol(Long id);
	public void deleteById(Long id);
	

}
