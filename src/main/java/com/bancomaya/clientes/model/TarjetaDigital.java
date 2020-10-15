package com.bancomaya.clientes.model;

public class TarjetaDigital {
	
	public TarjetaDigital(){
		
	}
	
	private int id;
	private String banco;
	private String cliente;
	private String numero;
	private String fechaVencimiento;
	private String numeroSeguridad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getNumeroSeguridad() {
		return numeroSeguridad;
	}
	public void setNumeroSeguridad(String numeroSeguridad) {
		this.numeroSeguridad = numeroSeguridad;
	}
	
	

}
