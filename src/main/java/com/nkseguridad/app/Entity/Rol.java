package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.GenerationType;

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
	
	@OneToMany(cascade = CascadeType.ALL)
	//@JsonBackReference
	@JoinColumn(name = "rolid", referencedColumnName = "id")
	private List<Usuario> Lstusuarios= new ArrayList<>();
	
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

	public List<Usuario> getLstaUsuarios() {
		return Lstusuarios;
	}

	public void setLstaUsuarios(List<Usuario> Lstusuarios) {
		this.Lstusuarios = Lstusuarios;
	}
	

}
