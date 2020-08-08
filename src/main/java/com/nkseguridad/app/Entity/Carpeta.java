package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carpeta",schema = "seguridad")
public class Carpeta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1430935653755292439L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codigocarp;
	private String nombre;
	private String imagen;
	private Boolean activado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigocarp() {
		return codigocarp;
	}
	public void setCodigocarp(String codigocarp) {
		this.codigocarp = codigocarp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Boolean getActivado() {
		return activado;
	}
	public void setActivado(Boolean activado) {
		this.activado = activado;
	}	

}
