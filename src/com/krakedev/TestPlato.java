package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {

		Plato platoA = new Plato("Ceviche Mixto", "Entrada", 8.50f, true);
		Plato platoB = new Plato("Lomo Saltado", "Plato fuerte", 12.75f, true);
		Plato platoC = new Plato("Cheesecake", "Postre", 5.25f, false);

		System.out.println("PLATOS CREADOS CON CONSTRUCTOR\n");

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

		// Demostramos que el setter sigue funcionando
		platoC.setDisponible(true);
		System.out.println("\n--- Plato C después de setDisponible(true) ---");
		System.out.println("Disponible: " + platoC.isDisponible());

	}

}