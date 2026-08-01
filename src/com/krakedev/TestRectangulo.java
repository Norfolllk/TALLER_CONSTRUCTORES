package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();

		System.out.println("--- Valores por defecto r1 ---");
		System.out.println("Base: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());

		r1.setBase(4);
		r1.setAltura(5);

		System.out.println("--- Valores después de setear r1 ---");
		System.out.println("Base: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());

		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado área r1: " + resultadoArea);

		double resultadoPerimetro;
		resultadoPerimetro = r1.calcularPerimetro();
		System.out.println("Resultado perímetro r1: " + resultadoPerimetro);

		Rectangulo r2 = new Rectangulo();

		System.out.println("--- Valores por defecto r2 ---");
		System.out.println("Base: " + r2.getBase());
		System.out.println("Altura: " + r2.getAltura());

		r2.setBase(2);
		r2.setAltura(8);

		System.out.println("--- Valores después de setear r2 ---");
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