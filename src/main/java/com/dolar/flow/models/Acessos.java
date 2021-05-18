package com.dolar.flow.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "TAB_DOLAR_ACESSOS")
public class Acessos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_access;
	@NotNull
	private int identificador;
	@NotNull
	private Date data_hora;
	
	
	public int getId_access() {
		return id_access;
	}
	public void setId_access(int id_access) {
		this.id_access = id_access;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public Date getData_hora() {
		return data_hora;
	}
	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	
	
}
