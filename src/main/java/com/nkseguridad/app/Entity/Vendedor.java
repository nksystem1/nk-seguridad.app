package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "vendedor", schema = "public")
public class Vendedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5451031297828660307L;
	@Id
	private String codigo;	
	private String nombre;	
	
	@Column(name = "porcfclimp")
	private Double porcfclimp;
	
	@Column(name = "porclclimp")
	private Double porclclimp;
	
	@Column(name = "porcfclexp")
	private Double porcfclexp;
	
	@PrePersist
	public void Prepersist() {
		if (porcfclimp==null)
			porcfclimp=0.0;
		if (porclclimp==null)
			porclclimp=0.0;
		if (porcfclexp==null)
			porcfclexp=0.0;
		if (montometa==null)
			montometa=0.0;
	}
	
	private String interno;
	private String cobrador;
	private String direccionfiscal;
	private String correoe;
	private String codnegocio;
	private Long codzona;
	private String codusuario;
	private Double montometa;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "codvendedor", referencedColumnName = "codigo")
	private List<Comision> LstComisiones = new ArrayList<>();
	
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
	public Double getPorcfclimp() {
		return porcfclimp;
	}
	public void setPorcfclimp(Double porcfclimp) {
		this.porcfclimp = porcfclimp;
	}
	public Double getPorclclimp() {
		return porclclimp;
	}
	public void setPorclclimp(Double porclclimp) {
		this.porclclimp = porclclimp;
	}
	public Double getPorcfclexp() {
		return porcfclexp;
	}
	public void setPorcfclexp(Double porcfclexp) {
		this.porcfclexp = porcfclexp;
	}
	public String getInterno() {
		return interno;
	}
	public void setInterno(String interno) {
		this.interno = interno;
	}
	public String getCobrador() {
		return cobrador;
	}
	public void setCobrador(String cobrador) {
		this.cobrador = cobrador;
	}
	public String getDireccionfiscal() {
		return direccionfiscal;
	}
	public void setDireccionfiscal(String direccionfiscal) {
		this.direccionfiscal = direccionfiscal;
	}
	public String getCorreoe() {
		return correoe;
	}
	public void setCorreoe(String correoe) {
		this.correoe = correoe;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	public Long getCodzona() {
		return codzona;
	}
	public void setCodzona(Long codzona) {
		this.codzona = codzona;
	}
	public String getCodusuario() {
		return codusuario;
	}
	public void setCodusuario(String codusuario) {
		this.codusuario = codusuario;
	}
	public List<Comision> getLstComisiones() {
		return LstComisiones;
	}
	public void setLstComisiones(List<Comision> lstComisiones) {
		LstComisiones = lstComisiones;
	}
	public Double getMontometa() {
		return montometa;
	}
	public void setMontometa(Double montometa) {
		this.montometa = montometa;
	}
	
	
}
