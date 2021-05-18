package com.dolar.flow.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TAB_DOLAR")
public class Dolar {
	@Id
	private Date data_id;
	@NotNull
	private int id;
	@NotNull
	private double abertura;
	@NotNull
	private double maxima;
	@NotNull
	private double minima;
	@NotNull
	private double fechamento;
	@NotNull
	private double ajuste;
	@NotNull
	private double ptax;
	@NotNull
	private double piso;
	@NotNull
	private double teto;
	@NotNull
	private int comprados;
	
	
	public Date getData_id() {
		return data_id;
	}
	public void setData_id(Date data_id) {
		this.data_id = data_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAbertura() {
		return abertura;
	}
	public void setAbertura(double abertura) {
		this.abertura = abertura;
	}
	public double getMaxima() {
		return maxima;
	}
	public void setMaxima(double maxima) {
		this.maxima = maxima;
	}
	public double getMinima() {
		return minima;
	}
	public void setMinima(double minima) {
		this.minima = minima;
	}
	public double getFechamento() {
		return fechamento;
	}
	public void setFechamento(double fechamento) {
		this.fechamento = fechamento;
	}
	public double getAjuste() {
		return ajuste;
	}
	public void setAjuste(double ajuste) {
		this.ajuste = ajuste;
	}
	public double getPtax() {
		return ptax;
	}
	public void setPtax(double ptax) {
		this.ptax = ptax;
	}
	public double getPiso() {
		return piso;
	}
	public void setPiso(double piso) {
		this.piso = piso;
	}
	public double getTeto() {
		return teto;
	}
	public void setTeto(double teto) {
		this.teto = teto;
	}
	public int getComprados() {
		return comprados;
	}
	public void setComprados(int comprados) {
		this.comprados = comprados;
	}
	public int getVendidos() {
		return vendidos;
	}
	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}
	private int vendidos;

}
