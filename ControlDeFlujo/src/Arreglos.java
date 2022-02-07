
public class Arreglos {
	
	public static void main(String[]args) {
		//solo un tipo de dato
		//especificar el tamaño o la cantidad de elementos que va a contener
		
		//1er manera
		int numeros[];// creamos la variable
		numeros = new int [4];//creando el arreglo
		
		
		//2da manera
		String[] nombres = new String[4];//basado en posiciones y son [0,1,2,3]
		
		//3er Manera
		// array literal
		String [] nombreFrutas = new String[] {
				"Manzana",
				"Platano",
				"Uva",
				"Pera"		
		
		};
		
		
		
		
		numeros[0] = 10;
		numeros[1]= 8;
		numeros[2] = 100;
		numeros[3] = 200;
		
		
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";
		
		
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("elementos de numeros "+numeros[i]);
			System.out.println("elementos de nombres "+nombres[i]);
			System.out.println("elementos de nombres "+nombreFrutas[i]);
			System.out.println("-------------------------------");
		}
	}

}
