package com.ecodeup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="clientes2")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_cliente;	
	@Column
	private String nombre;	
	@Column
	private String apellido;	
	@Column
	private String direccion;	
	@Column
	private String email;	
	@Column
	private int telefono;	
	@Temporal(TemporalType.TIMESTAMP)     
	private Date fechaRegistro;	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date fechaActualizacion;
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", email=" + email + ", telefono=" + telefono + ", fechaRegistro=" + fechaRegistro
				+ ", fechaActualizacion=" + fechaActualizacion + "]";
	}
	
	

}
