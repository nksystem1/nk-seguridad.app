package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, String> {

	

}
