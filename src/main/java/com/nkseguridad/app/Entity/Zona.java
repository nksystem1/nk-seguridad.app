package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zonas", schema = "public")
public class Zona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2771219205999752823L;		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codzona;
	private String nomzona;
	
	@Column(name = "codnegocio")
	private String negocioId;
	
	public Long getCodzona() {
		return codzona;
	}
	public void setCodzona(Long codzona) {
		this.codzona = codzona;
	}
	public String getNomzona() {
		return nomzona;
	}
	public void setNomzona(String nomzona) {
		this.nomzona = nomzona;
	}
	public String getNegocioId() {
		return negocioId;
	}
	public void setEmpresaId(String negocioId) {
		this.negocioId = negocioId;
	}

}
