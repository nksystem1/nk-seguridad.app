package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "usuario", schema = "seguridad")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5536417225533826957L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login")
	private String username;
	
	private String contrasena;
	
	private String nombrecompleto;
	
	private String descripcion;
	
	private Boolean desistema;
	
	private Boolean concorreo;
	
	private String direccioncorreo;
	
	private String estado;
	
	private String foto;		
	
	/*@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinTable(name="rolesxusuarios",
		joinColumns = @JoinColumn(name="login", referencedColumnName = "login"),
		inverseJoinColumns = @JoinColumn(name="rolid", referencedColumnName = "id"))*/
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	@JsonBackReference
	private Set<Usuariosrol> Lstroles= new HashSet<Usuariosrol>();
	
	@Column(name = "fechacreacion")
	@Temporal(TemporalType.DATE)
	private Date creadoel;
	
	@PrePersist
	public void Prepersist() {
		creadoel = new Date();
	}

	public String getLogin() {
		return username;
	}
	
	public void setLogin(String login) {
		this.username = login;
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
	
	public Set<Usuariosrol> getLstroles() {
		return Lstroles;
	}

	public void setLstroles(Set<Usuariosrol> lstroles) {
		Lstroles = lstroles;
	}

	public boolean isEnabled() {
		if (this.estado.equals("1"))
			return true;
		
		return false;
	}
	
}
