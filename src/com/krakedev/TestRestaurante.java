package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {

		Restaurante rest1;
		Restaurante rest2;

		rest1 = new Restaurante();
		rest2 = new Restaurante();

		System.out.println("Restaurantes antes de asignar valores");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion() + "\n");

		System.out.println("Restaurantes antes de asignar valores");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());

		rest1.setNombre("VacoYVaca");
		rest1.setDireccion("El Bosque");
		rest1.setCalificacion(4.5f);

		System.out.println("Restaurantes con valores seteados");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion());

		rest2.setNombre("Menestras del Negro");
		rest2.setDireccion("Av Real Audiencia");
		rest2.setCalificacion(3.8f);

		System.out.println("Restaurantes con valores seteados");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());

	}

}

//rest1.calificacion=Float.parseFloat("4.5");
//rest1.calificacion=4.5f;