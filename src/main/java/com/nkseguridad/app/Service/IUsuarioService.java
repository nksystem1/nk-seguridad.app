package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	public Usuario findByLogin(String username);
}
