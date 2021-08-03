package com.example.backend.entity;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class User {
	
	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	@Column
    private String pwd_usuario;
	@Column
	private String nombre_usuario;
	@Column
	private String pais_usuario;
	@Column
	private String ciudad_usuario;
	@Column
	private String direccion_usuario;
	@Column
	private String correo_usuario;
	@Column
	private int valoracion_usuario;
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getSpwd_usuario() {
		return pwd_usuario;
	}
	public void setSpwd_usuario(String pwd_usuario) {
		this.pwd_usuario = pwd_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getPais_usuario() {
		return pais_usuario;
	}
	public void setPais_usuario(String pais_usuario) {
		this.pais_usuario = pais_usuario;
	}
	public String getCiudad_usuario() {
		return ciudad_usuario;
	}
	public void setCiudad_usuario(String ciudad_usuario) {
		this.ciudad_usuario = ciudad_usuario;
	}
	public String getDireccion_usuario() {
		return direccion_usuario;
	}
	public void setDireccion_usuario(String direccion_usuario) {
		this.direccion_usuario = direccion_usuario;
	}
	public String getCorreo_usuario() {
		return correo_usuario;
	}
	public void setCorreo_usuario(String correo_usuario) {
		this.correo_usuario = correo_usuario;
	}
	public int getValoracion_usuario() {
		return valoracion_usuario;
	}
	public void setValoracion_usuario(int valoracion_usuario) {
		this.valoracion_usuario = valoracion_usuario;
	}
	
	

}
