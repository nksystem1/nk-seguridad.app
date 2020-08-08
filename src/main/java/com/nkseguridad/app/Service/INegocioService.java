package com.nkseguridad.app.Service;

import java.util.*;
import com.nkseguridad.app.Entity.Negocio;

public interface INegocioService {

	public List<Negocio> findAll();
	public Negocio findByCodigo(String codnegocio);
	public Negocio save(Negocio negocio);
	public boolean findByExisteCodigo(Negocio negocio);
	public Negocio updaNegocio(Negocio negocio);
}
