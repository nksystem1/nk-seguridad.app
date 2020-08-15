package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Unidadmedida implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String abrevunidadmedida;
	private String nomunidadmedida;
	private String codnegocio;
	
	public Unidadmedida() {
		
	}
	
	public Unidadmedida(String abrevunidadmedida, String nomunidadmedida, String codnegocio) {
		super();
		this.abrevunidadmedida = abrevunidadmedida;
		this.nomunidadmedida = nomunidadmedida;
		this.codnegocio = codnegocio;
	}
	
	public String getAbrevunidadmedida() {
		return abrevunidadmedida;
	}
	public void setAbrevunidadmedida(String abrevunidadmedida) {
		this.abrevunidadmedida = abrevunidadmedida;
	}
	public String getNomunidadmedida() {
		return nomunidadmedida;
	}
	public void setNomunidadmedida(String nomunidadmedida) {
		this.nomunidadmedida = nomunidadmedida;
	}
	public String getCodnegocio() {
		return codnegocio;
	} 
	public void setCodnegoco(String codnegocio) {
		this.codnegocio=codnegocio;
		
	}
	
	
	@Override
	public String toString() {
		return "Unidadmedida [abrevunidadmedida=" + abrevunidadmedida + ", nomunidadmedida=" + nomunidadmedida
				+ ", codnegocio=" + codnegocio + "]";
	}

}
