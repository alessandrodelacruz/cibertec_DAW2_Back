package com.ciberbanco.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CIBERBANCO_CUENTA_USUARIO")
public class CuentaUsuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer id;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "TIPO_DE_CUENTA")
	private Integer tipo_de_cuenta;

	@Column(name = "FECHA_NAC")
	private Date fecha_nac;

	@Column(name = "SEXO")
	private Integer sexo;

	@Column(name = "DIRECCION")
	private String direccion;

	@Column(name = "ESTADO")
	private Integer estado;

	@Column(name = "ID_DISTRITO")
	private Integer id_distrito;;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "documento")
	private String documento;

	@Column(name = "numerotarjeta")
	private String numerotarjeta;

	@Column(name = "clave")
	private String clave;

	@JsonIgnore
	@OneToMany(mappedBy = "id_cliente")
	private List<CuentaBancaria> lstCuentaBancaria;

	public String getNumerotarjeta() {
		return numerotarjeta;
	}

	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTipo_de_cuenta() {
		return tipo_de_cuenta;
	}

	public void setTipo_de_cuenta(Integer tipo_de_cuenta) {
		this.tipo_de_cuenta = tipo_de_cuenta;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getId_distrito() {
		return id_distrito;
	}

	public void setId_distrito(Integer id_distrito) {
		this.id_distrito = id_distrito;
	}

	


	
	

}