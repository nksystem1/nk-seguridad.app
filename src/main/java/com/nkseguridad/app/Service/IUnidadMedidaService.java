package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Unidadmedida;

public interface IUnidadMedidaService {
	public List<Unidadmedida> findAll();
	public Unidadmedida findByCodigo(String abreviatura);
	public Unidadmedida Save(Unidadmedida unidadmedida);
	public Unidadmedida Update(Unidadmedida unidadmedida);
}
