package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Carpeta;

@Repository
public interface ICarpetaRepository  extends CrudRepository<Carpeta, Long>{

}
