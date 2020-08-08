package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuario", schema = "seguridad")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5536417225533826957L;
	@Id
	private String login;
	
	private String contrasena;
	
	private String nombrecompleto;
	
	private String descripcion;
	
	private Boolean desistema;
	
	private Boolean concorreo;
	
	private String direccioncorreo;
	
	@Column(name = "rol")
	private String rolid;
	
	private String estado;
	
	private String foto;
	
	@Column(name = "fechacreacion")
	@Temporal(TemporalType.DATE)
	private Date creadoel;
	
	@PrePersist
	public void Prepersist() {
		creadoel = new Date();
	}
	
	//@ManyToOne(optional=false)
    //@JoinColumn(name = "rolid", referencedColumnName = "id")
	//private Rol rol;
	
	//public Rol getRol() {
	//	return rol;
	//}
	//public void setRol(Rol rol) {
	//	this.rol = rol;
	//}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombrecompleto() {
		return nombrecompleto;
	}
	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getDesistema() {
		return desistema;
	}
	public void setDesistema(Boolean desistema) {
		this.desistema = desistema;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Boolean getConcorreo() {
		return concorreo;
	}
	public void setConcorreo(Boolean concorreo) {
		this.concorreo = concorreo;
	}
	public String getDireccioncorreo() {
		return direccioncorreo;
	}
	public void setDireccioncorreo(String direccioncorreo) {
		this.direccioncorreo = direccioncorreo;
	}
	public String getRolid() {
		return rolid;
	}
	public void setRolid(String rolid) {
		this.rolid = rolid;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getCreadoel() {
		return creadoel;
	}
	public void setCreadoel(Date creadoel) {
		this.creadoel = creadoel;
	}
	
}
