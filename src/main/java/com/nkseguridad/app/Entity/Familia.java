package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "familia", schema = "public")
public class Familia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8340543287616596516L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codfamilia")
	private Long codfamilia;
	
	@Column(name = "nomfamilia")
	private String nomfamilia;
	
	@Column(name = "codnegocio")
	private String negocioId;
	
	@Column(name = "imagen")
	private Byte[] imagen;

	public Long getCodfamilia() {
		return codfamilia;
	}

	public void setCodfamilia(Long codfamilia) {
		this.codfamilia = codfamilia;
	}

	public String getNomfamilia() {
		return nomfamilia;
	}

	public void setNomfamilia(String nomfamilia) {
		this.nomfamilia = nomfamilia;
	}

	public String getNegocioId() {
		return negocioId;
	}

	public void setNegocioId(String negocioId) {
		this.negocioId = negocioId;
	}

	public Byte[] getImagen() {
		return imagen;
	}

	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}

	public Familia(Long codfamilia, String nomfamilia, String negocioId, Byte[] imagen) {
		super();
		this.codfamilia = codfamilia;
		this.nomfamilia = nomfamilia;
		this.negocioId = negocioId;
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Familia [codfamilia=" + codfamilia + ", nomfamilia=" + nomfamilia + ", negocioId=" + negocioId
				+ ", imagen=" + Arrays.toString(imagen) + "]";
	}
	

}
