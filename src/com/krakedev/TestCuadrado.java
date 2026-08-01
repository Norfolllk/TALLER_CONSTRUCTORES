package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {

		Cuadrado c1 = new Cuadrado();

		System.out.println("--- Valor por defecto c1 ---");
		System.out.println("Lado: " + c1.getLado());

		c1.setLado(4);

		System.out.println("--- Valor después de setear c1 ---");
		System.out.println("Lado: " + c1.getLado());
		System.out.println("Área c1: " + c1.calcularArea());
		System.out.println("Perímetro c1: " + c1.calcularPerimetro());

		Cuadrado c2 = new Cuadrado();
		c2.setLado(6);
		System.out.println("Área c2: " + c2.calcularArea());
		System.out.println("Perímetro c2: " + c2.calcularPerimetro());

		Cuadrado c3 = new Cuadrado();
		c3.setLado(3);
		System.out.println("Área c3: " + c3.calcularArea());
		System.out.println("Perímetro c3: " + c3.calcularPerimetro());

	}
}