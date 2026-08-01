package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {

		Restaurante rest1 = new Restaurante("VacoYVaca", "El Bosque", 4.5f);
		Restaurante rest2 = new Restaurante("Menestras del Negro", "Av Real Audiencia", 3.8f);

		System.out.println("--- rest1 creado con constructor ---");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion());

		System.out.println("\n--- rest2 creado con constructor ---");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());

		// Demostramos que el setter sigue funcionando
		rest1.setCalificacion(5.0f);
		System.out.println("\n--- rest1 después de modificar calificación con setCalificacion(5.0) ---");
		System.out.println("Calificación: " + rest1.getCalificacion());

	}

}

//rest1.calificacion=Float.parseFloat("4.5");
//rest1.calificacion=4.5f;