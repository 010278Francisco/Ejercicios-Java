package com.generation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setAlto(10);
		cuadrado1.setLargo(10);
		System.out.println("El area del " + cuadrado1.getNombre() + "es "+ cuadrado1.calcularArea());
		//cuadrado1.setNombre = "Cuadrado";
		//System.out.println(cuadrado1.getNombre());
		
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(15);
		triangulo1.setLargo(10);
		System.out.println("El area del " + triangulo1.getNombre() + "es "+ triangulo1.calcularArea());

		//triangulo1.setNombre = "Triangulo";
		//System.out.println(triangulo1.getNombre());
			
		

	}

}
