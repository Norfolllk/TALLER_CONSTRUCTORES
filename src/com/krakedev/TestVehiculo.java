package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {

		Vehiculo v = new Vehiculo();

		System.out.println("*********** Vehiculo v - valores por defecto ***********");
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		System.out.println("Año: " + v.getAnio());
		System.out.println("Precio: " + v.getPrecio());
		System.out.println("Estado: " + v.isEstado());
		System.out.println("Iva: " + v.getIva());
		System.out.println("Numero: " + v.getNumero());

		v.setAnio("2020");
		v.setMarca("Mazda");
		v.setModelo("3");
		v.setPrecio("500,000");
		v.setEstado(true);
		v.setIva(295f);

		System.out.println("\n*********** Vehiculo v - después de asignar/setear ***********");
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		System.out.println("Año: " + v.getAnio());
		System.out.println("Precio: " + v.getPrecio());
		System.out.println("Estado: " + v.isEstado());
		System.out.println("Iva: " + v.getIva());

		Vehiculo v1 = new Vehiculo("Hola", "Juan");

		System.out.println("\n*********** Vehiculo v1 - creado con constructor (marca, modelo) ***********");
		System.out.println("Marca: " + v1.getMarca());
		System.out.println("Modelo: " + v1.getModelo());
		System.out.println("Año: " + v1.getAnio());
		System.out.println("Precio: " + v1.getPrecio());

		Vehiculo v2 = new Vehiculo(2, "Juan");

		System.out.println("\n*********** Vehiculo v2 - creado con constructor (numero, modelo) ***********");
		System.out.println("Numero: " + v2.getNumero());
		System.out.println("Modelo: " + v2.getModelo());

		Vehiculo v3 = new Vehiculo("Juan", 2);

		System.out.println("\n*********** Vehiculo v3 - creado con constructor (modelo, numero) ***********");
		System.out.println("Numero: " + v3.getNumero());
		System.out.println("Modelo: " + v3.getModelo());

	}

}