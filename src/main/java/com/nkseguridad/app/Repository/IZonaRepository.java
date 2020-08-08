package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Zona;

@Repository
public interface IZonaRepository extends CrudRepository<Zona, Long> {

}
