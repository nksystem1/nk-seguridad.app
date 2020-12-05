package com.nkseguridad.app.Service.Implementation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Usuario;
import com.nkseguridad.app.Entity.Usuariosrol;
import com.nkseguridad.app.Repository.IUsuarioRepository;
import com.nkseguridad.app.Service.IUsuarioService;

@Service
public class UsuarioService implements UserDetailsService,IUsuarioService {

	@Autowired
	private IUsuarioRepository UsuarioRepository;
	
	@Transactional
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) UsuarioRepository.findAll();
	}

	@Override
	public Usuario findByLogin(String username) {
		// TODO Auto-generated method stub
		return UsuarioRepository.findById(username).orElse(null);
	}	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario user = findByLogin(username);
		System.out.println("El usuario es "+user);
		//System.out.println("El rol lista "+user.getLstroles());
		List<GrantedAuthority> lstauthorities = builderAuthorities(user.getLstroles());
		return buildUser(user,lstauthorities);
	}
	
	private User buildUser(Usuario user, List<GrantedAuthority> authorities) {
		
		return new User(user.getLogin(),user.getContrasena(), user.isEnabled(), true, true, true,authorities);
	} 
	
	private List<GrantedAuthority> builderAuthorities(Set<Usuariosrol> lstUserRoles){
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		for (Usuariosrol rolesusua : lstUserRoles) {
			authorities.add(new SimpleGrantedAuthority(rolesusua.getRol()));
		}
		return new ArrayList<GrantedAuthority>(authorities);
	}

}
