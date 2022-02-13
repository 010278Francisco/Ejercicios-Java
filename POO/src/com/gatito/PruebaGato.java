package com.gatito;

public class PruebaGato {
	public static void main(String[] args) {
		Gato g = new Gato("fufu", 2, true);
		
		//g.nombre = "Taco";
		//g.patas = 3;
		
		
		
		g.setNombre("Taco");
		g.setPatas(3);
		g.setAdoptado(false);
		
		System.out.println("El nombre es "+g.getNombre());
		
		
		//Excepciones
		
		/*
		 * // int num1 = 5, nume2 = 0; // int resultado = num1/nume2; //
		 * System.out.println(resultado);
		 */		
	}

}
