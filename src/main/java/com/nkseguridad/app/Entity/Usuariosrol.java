package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rolesxusuarios", schema = "seguridad")
public class Usuariosrol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1371553251646298055L;
	
	@Id
	@GeneratedValue	
	@Column(name = "rolesid")
	private Long userRolId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "login", nullable = false)
	private Usuario user;
	
	@Column(name = "rolid", nullable = false)
	private Long rolid;
	
	@Column(name = "nombrerol", nullable = false)
	private String rol;
	
	
	public Long getUserRolId() {
		return userRolId;
	}
	public void setUserRolId(Long userRolId) {
		this.userRolId = userRolId;
	}
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public Long getRolid() {
		return rolid;
	}
	public void setRolid(Long rolid) {
		this.rolid = rolid;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}

}
