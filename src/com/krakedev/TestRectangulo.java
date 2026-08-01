package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(4, 5);

		System.out.println("--- r1 creado con constructor(base, altura) ---");
		System.out.println("Base: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());

		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado área r1: " + resultadoArea);

		double resultadoPerimetro;
		resultadoPerimetro = r1.calcularPerimetro();
		System.out.println("Resultado perímetro r1: " + resultadoPerimetro);

		// Demostramos que el setter sigue funcionando para modificar después de creado
		r1.setBase(10);
		System.out.println("--- r1 después de modificar base con setBase(10) ---");
		System.out.println("Base: " + r1.getBase());
		System.out.println("Nueva área r1: " + r1.calcularArea());

		Rectangulo r2 = new Rectangulo(2, 8);

		System.out.println("\n--- r2 creado con constructor(base, altura) ---");
		System.out.println("Base: " + r2.getBase());
		System.out.println("Altura: " + r2.getAltura());

		int resultadoArea2;
		resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado área r2: " + resultadoArea2);

		double resultadoPerimetro2;
		resultadoPerimetro2 = r2.calcularPerimetro();
		System.out.println("Resultado perímetro r2: " + resultadoPerimetro2);

	}
}