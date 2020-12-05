package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="rol", schema = "seguridad")
public class Rol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7250320469175966817L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codigo;
	
	private String nombre;
	
	private Byte caracteristicas;
	
	private Boolean desistema;
	
	private String estado;
	
	@ManyToMany
	@JoinTable(name = "rolesxusuarios",
		joinColumns = @JoinColumn(name= "rolid",referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name="login", referencedColumnName = "login"))
	private Set<Usuario> Lstusuarios= new HashSet<Usuario>();
	
	public Rol() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Byte getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(Byte caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public Boolean getDesistema() {
		return desistema;
	}
	public void setDesistema(Boolean desistema) {
		this.desistema = desistema;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set<Usuario> getLstusuarios() {
		return Lstusuarios;
	}

	public void setLstusuarios(Set<Usuario> lstusuarios) {
		Lstusuarios = lstusuarios;
	}

	

}
