package com.krakedev;

public class TestVehiculo {

	public static void main(String[] args) {

		// Antes: Vehiculo v = new Vehiculo(); + varios setters.
		// Ahora: se crea directo con el constructor completo (todos los valores de una vez)
		Vehiculo v = new Vehiculo("Mazda", "3", "2020", "500,000", true, 295f, 1);

		System.out.println("*********** Vehiculo v - creado con constructor completo ***********");
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		System.out.println("Año: " + v.getAnio());
		System.out.println("Precio: " + v.getPrecio());
		System.out.println("Estado: " + v.isEstado());
		System.out.println("Iva: " + v.getIva());
		System.out.println("Numero: " + v.getNumero());

		// Demostramos que el setter sigue funcionando después de creado
		v.setMarca("Toyota");
		System.out.println("\n*********** Vehiculo v - después de modificar marca con setMarca ***********");
		System.out.println("Marca: " + v.getMarca());

		Vehiculo v1 = new Vehiculo("Hola", "Juan");

		System.out.println("\n*********** Vehiculo v1 - creado con constructor (marca, modelo) ***********");
		System.out.println("Marca: " + v1.getMarca());
		System.out.println("Modelo: " + v1.getModelo());

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
