package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "grupocliente", schema = "public")
public class Grupocliente implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 6482138986133069178L;
	@Id
	private String codgrupo;
    private String nombre;
    private String codnegocio;
    
	public String getCodgrupo() {
		return codgrupo;
	}
	public void setCodgrupo(String codgrupo) {
		this.codgrupo = codgrupo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}

}
