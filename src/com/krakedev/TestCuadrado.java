package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {

		Cuadrado c1 = new Cuadrado(4);

		System.out.println("--- c1 creado con constructor(lado) ---");
		System.out.println("Lado: " + c1.getLado());
		System.out.println("Área c1: " + c1.calcularArea());
		System.out.println("Perímetro c1: " + c1.calcularPerimetro());

		Cuadrado c2 = new Cuadrado(6);
		System.out.println("\n--- c2 creado con constructor(lado) ---");
		System.out.println("Área c2: " + c2.calcularArea());
		System.out.println("Perímetro c2: " + c2.calcularPerimetro());

		Cuadrado c3 = new Cuadrado(3);
		System.out.println("\n--- c3 creado con constructor(lado) ---");
		System.out.println("Área c3: " + c3.calcularArea());
		System.out.println("Perímetro c3: " + c3.calcularPerimetro());

	}
}