package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Negocio;

@Repository
public interface INegocioRepository extends CrudRepository<Negocio, String> {

	
}
