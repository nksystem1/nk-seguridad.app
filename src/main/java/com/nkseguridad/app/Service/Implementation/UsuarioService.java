package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Usuario;
import com.nkseguridad.app.Repository.IUsuarioRepository;
import com.nkseguridad.app.Service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuarioRepository UsuarioRepository;
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) UsuarioRepository.findAll();
	}

	@Override
	public Usuario findByLogin(String Login) {
		// TODO Auto-generated method stub
		return UsuarioRepository.findById(Login).orElse(null);
	}
	
	@Override
	public Usuario findByUser(Usuario usuario) {
		// TODO Auto-generated method stub
		return UsuarioRepository.findByLoginAndContrasena(usuario.getLogin(),usuario.getContrasena());
	}

}
