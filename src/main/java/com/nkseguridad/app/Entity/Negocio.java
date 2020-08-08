package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "negocio", schema = "public")
public class Negocio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 28965007218210964L;
	@Id
	private String codnegocio;
	
	private String nombre;
	
	private String direccion;
	
	private String telefono;
	
	private String email;
	
	@Column(name = "telefono2")
	private String telefonomovil;
	
	private String web;
	
	private Byte[] imagen;
	
	private String mascaracontable;
	
	private String contribuyente;
	
	private String activa;

	public String getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonomovil() {
		return telefonomovil;
	}

	public void setTelefonomovil(String telefonomovil) {
		this.telefonomovil = telefonomovil;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public Byte[] getImagen() {
		return imagen;
	}

	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}

	public String getMascaracontable() {
		return mascaracontable;
	}

	public void setMascaracontable(String mascaracontable) {
		this.mascaracontable = mascaracontable;
	}

	public String getContribuyente() {
		return contribuyente;
	}

	public void setContribuyente(String contribuyente) {
		this.contribuyente = contribuyente;
	}

	public String getActiva() {
		return activa;
	}

	public void setActiva(String activa) {
		this.activa = activa;
	}
	
	

}
