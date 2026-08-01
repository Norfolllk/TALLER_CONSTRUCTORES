package com.krakedev;

public class Vehiculo {

	// pilar de creación de atributo
	// modificador de acceso - tipo de dato - valor
	private String marca;
	private String modelo;
	private String anio;
	private String precio;
	private boolean estado;
	private float iva;
	private int numero;

	// constructor sin parámetros
	public Vehiculo() {

	}

	// constructor con parámetros
	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	// regla de oro: el orden/tipo de los parámetros define el constructor
	public Vehiculo(int numero, String modelo) {
		this.numero = numero;
		this.modelo = modelo;
	}

	public Vehiculo(String modelo, int numero) {
		this.numero = numero;
		this.modelo = modelo;
	}

	// getters y setters
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
