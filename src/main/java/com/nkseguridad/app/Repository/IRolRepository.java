package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Rol;

@Repository
public interface IRolRepository extends CrudRepository<Rol, Long>{

	
}
