package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {

		Plato platoA;
		Plato platoB;
		Plato platoC;

		platoA = new Plato();
		platoB = new Plato();
		platoC = new Plato();

		System.out.println("PLATOS ANTES DE ASIGNAR VALORES\n");
		System.out.println("Plato A");
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.isDisponible());
		System.out.println();

		System.out.println("Plato B");
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.isDisponible());
		System.out.println();

		System.out.println("Plato C");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.isDisponible());

		platoA.setNombre("Ceviche Mixto");
		platoA.setTipo("Entrada");
		platoA.setPrecio(8.50f);
		platoA.setDisponible(true);

		platoB.setNombre("Lomo Saltado");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(12.75f);
		platoB.setDisponible(true);

		platoC.setNombre("Cheesecake");
		platoC.setTipo("Postre");
		platoC.setPrecio(5.25f);
		platoC.setDisponible(false);

		System.out.println("\nPLATOS CON VALORES SETEADOS\n");
		System.out.println("Plato A");
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: $" + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.isDisponible());
		System.out.println();

		System.out.println("Plato B");
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: $" + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.isDisponible());
		System.out.println();

		System.out.println("Plato C");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: $" + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.isDisponible());

	}

}