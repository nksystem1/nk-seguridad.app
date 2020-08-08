package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "rutas", schema = "public")
public class Ruta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8834059398404021573L;
	
	@Id
	@Column(name = "codigo")
	private String codigo;
	private String nombre;
	private Long codigozona;
	private String desdeuno;
	private String hastauno;
	private String desdedos;
	private String hastados;
	private String codigovendedor;
	private String codnegocio;	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codigozona", insertable = false, updatable = false)
	private Zona zona;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codigovendedor", insertable = false, updatable = false)
	private Vendedor vendedor;
	
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
	public Long getCodigozona() {
		return codigozona;
	}
	public void setCodigozona(Long codigozona) {
		this.codigozona = codigozona;
	}
	public String getDesdeuno() {
		return desdeuno;
	}
	public void setDesdeuno(String desdeuno) {
		this.desdeuno = desdeuno;
	}
	public String getHastauno() {
		return hastauno;
	}
	public void setHastauno(String hastauno) {
		this.hastauno = hastauno;
	}
	public String getDesdedos() {
		return desdedos;
	}
	public void setDesdedos(String desdedos) {
		this.desdedos = desdedos;
	}
	public String getHastados() {
		return hastados;
	}
	public void setHastados(String hastados) {
		this.hastados = hastados;
	}
	public String getCodigovendedor() {
		return codigovendedor;
	}
	public void setCodigovendedor(String codigovendedor) {
		this.codigovendedor = codigovendedor;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	

}
