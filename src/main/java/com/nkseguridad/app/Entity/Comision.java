package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "comisiones", schema = "public")
public class Comision implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8338513290564968869L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double porcentajeinferior;
    private Double porcentajesuperior;
    private Double porcentajecomisionvendedor;
    private String codvendedor; 
    
    @PrePersist
    public void Prepersist() {
    	if (porcentajeinferior==null) porcentajeinferior=0.0;
    	if (porcentajesuperior==null) porcentajesuperior=0.0;
    	if (porcentajecomisionvendedor==null) porcentajecomisionvendedor=0.0;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPorcentajeinferior() {
		return porcentajeinferior;
	}

	public void setPorcentajeinferior(Double porcentajeinferior) {
		this.porcentajeinferior = porcentajeinferior;
	}

	public Double getPorcentajesuperior() {
		return porcentajesuperior;
	}

	public void setPorcentajesuperior(Double porcentajesuperior) {
		this.porcentajesuperior = porcentajesuperior;
	}

	public Double getPorcentajecomisionvendedor() {
		return porcentajecomisionvendedor;
	}

	public void setPorcentajecomisionvendedor(Double porcentajecomisionvendedor) {
		this.porcentajecomisionvendedor = porcentajecomisionvendedor;
	}

	public String getCodvendedor() {
		return codvendedor;
	}

	public void setCodvendedor(String codvendedor) {
		this.codvendedor = codvendedor;
	}
    
    
}
