package com.krakedev;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String anio;
	private String precio;
	private boolean estado;
	private float iva;
	private int numero;

	// Constructor completo: asigna directo todos los atributos
	public Vehiculo(String marca, String modelo, String anio, String precio, boolean estado, float iva, int numero) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
		this.estado = estado;
		this.iva = iva;
		this.numero = numero;
	}

	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Vehiculo(int numero, String modelo) {
		this.numero = numero;
		this.modelo = modelo;
	}

	public Vehiculo(String modelo, int numero) {
		this.numero = numero;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
