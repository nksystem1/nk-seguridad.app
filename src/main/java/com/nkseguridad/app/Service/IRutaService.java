package com.nkseguridad.app.Service;
import java.util.List;

import com.nkseguridad.app.Entity.Ruta;

public interface IRutaService {

	public List<Ruta> findAll();
	public Ruta findByCodigo(String codigo);
	public boolean existebyCodigo(String codigo);
	public Ruta save(Ruta ruta);
}
