package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Ruta;

@Repository
public interface IRutaRepository extends CrudRepository<Ruta, String> {

}
