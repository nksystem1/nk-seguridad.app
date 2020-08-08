package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca", schema = "public")
public class Marca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5233708009259466908L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codmarca;
	private String nommarca;
	private String codnegocio;
	
	public Long getCodmarca() {
		return codmarca;
	}
	public void setCodmarca(Long codmarca) {
		this.codmarca = codmarca;
	}
	public String getNommarca() {
		return nommarca;
	}
	public void setNommarca(String nommarca) {
		this.nommarca = nommarca;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	public Marca(Long codmarca, String nommarca, String codnegocio) {
		super();
		this.codmarca = codmarca;
		this.nommarca = nommarca;
		this.codnegocio = codnegocio;
	}
	@Override
	public String toString() {
		return "Marca [codmarca=" + codmarca + ", nommarca=" + nommarca + ", codnegocio=" + codnegocio + "]";
	}
	

}
