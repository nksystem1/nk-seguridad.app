package com.nkseguridad.app.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, String> {

	public Usuario findByLoginAndContrasena(String login, String contrasena);
}
