package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente", schema = "public")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5790987669513731602L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codcliente")
	private String codcliente;
	
    private String codgrupo;
    private String codvendedor;
    private String cedula;
    private String rif;
    private String telefonofijo1;
    private String telefonofijo2;
    private String telefonomovil;
    private String telefonofax;
    private String direccionfiscal;
    private String correoe;
    private String paginaweb;
    private String tipopersona;
    private Long plazocredito;
    private Double montocredito;
    private String tipocredito;
    private String unidadplazocredito;
    private String status;
    private String nombre;
    private String regimeniva;
    private String razonsocial;
    private Date fecharegistro;
    private String tarifa;
    private String codnegocio;
    private String contribuyente;
    private String codcontable;
    private String codigoruta;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codvendedor",  insertable = false, updatable = false)
    private Vendedor vendedor;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codnegocio", insertable = false, updatable = false)
    private Negocio negocio;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigoruta", insertable = false, updatable = false)
    private Ruta ruta;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codgrupo", insertable = false, updatable = false)
    private Grupocliente grupocliente;
	public String getCodcliente() {
		return codcliente;
	}
	public void setCodcliente(String codcliente) {
		this.codcliente = codcliente;
	}
	public String getCodgrupo() {
		return codgrupo;
	}
	public void setCodgrupo(String codgrupo) {
		this.codgrupo = codgrupo;
	}
	public String getCodvendedor() {
		return codvendedor;
	}
	public void setCodvendedor(String codvendedor) {
		this.codvendedor = codvendedor;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getRif() {
		return rif;
	}
	public void setRif(String rif) {
		this.rif = rif;
	}
	public String getTelefonofijo1() {
		return telefonofijo1;
	}
	public void setTelefonofijo1(String telefonofijo1) {
		this.telefonofijo1 = telefonofijo1;
	}
	public String getTelefonofijo2() {
		return telefonofijo2;
	}
	public void setTelefonofijo2(String telefonofijo2) {
		this.telefonofijo2 = telefonofijo2;
	}
	public String getTelefonomovil() {
		return telefonomovil;
	}
	public void setTelefonomovil(String telefonomovil) {
		this.telefonomovil = telefonomovil;
	}
	public String getTelefonofax() {
		return telefonofax;
	}
	public void setTelefonofax(String telefonofax) {
		this.telefonofax = telefonofax;
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
	public String getPaginaweb() {
		return paginaweb;
	}
	public void setPaginaweb(String paginaweb) {
		this.paginaweb = paginaweb;
	}
	public String getTipopersona() {
		return tipopersona;
	}
	public void setTipopersona(String tipopersona) {
		this.tipopersona = tipopersona;
	}
	public Long getPlazocredito() {
		return plazocredito;
	}
	public void setPlazocredito(Long plazocredito) {
		this.plazocredito = plazocredito;
	}
	public Double getMontocredito() {
		return montocredito;
	}
	public void setMontocredito(Double montocredito) {
		this.montocredito = montocredito;
	}
	public String getTipocredito() {
		return tipocredito;
	}
	public void setTipocredito(String tipocredito) {
		this.tipocredito = tipocredito;
	}
	public String getUnidadplazocredito() {
		return unidadplazocredito;
	}
	public void setUnidadplazocredito(String unidadplazocredito) {
		this.unidadplazocredito = unidadplazocredito;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRegimeniva() {
		return regimeniva;
	}
	public void setRegimeniva(String regimeniva) {
		this.regimeniva = regimeniva;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public Date getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public String getTarifa() {
		return tarifa;
	}
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getContribuyente() {
		return contribuyente;
	}
	public void setContribuyente(String contribuyente) {
		this.contribuyente = contribuyente;
	}
	public String getCodcontable() {
		return codcontable;
	}
	public void setCodcontable(String codcontable) {
		this.codcontable = codcontable;
	}
	public String getCodigoruta() {
		return codigoruta;
	}
	public void setCodigoruta(String codigoruta) {
		this.codigoruta = codigoruta;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Negocio getNegocio() {
		return negocio;
	}
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	public Grupocliente getGrupocliente() {
		return grupocliente;
	}
	public void setGrupocliente(Grupocliente grupocliente) {
		this.grupocliente = grupocliente;
	}
    
    
}
