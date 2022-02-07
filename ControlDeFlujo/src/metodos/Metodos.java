package metodos;

public class Metodos {
	
	//Metodos es una funcion
	
	//Atributos de la clase 
	int a, b;
	//Metodo void()vacio
	
	public void sumar() {
		int resultado = a+b;
		System.out.println("El resultado de sumar " + a + "mas " + b + "es " + resultado);
		
	}
	
	//metodo con retorno de valores
	
	public int  sumaConRetorno() {
		return a+b;
		/*int resultado = a + b;
		return resultado;*/
		
	}
	
	//Argumentos que en javasript se le conocen como parametros
	//suma(argumentos)
	public double multiplicarConArgumentos(int arg1, double arg2) {
		
		int c = arg1;
		double d = arg2;
		return c * d;
		
	}
	//Metodos estaticos
	//estatico, void (no regresa dato), usa argumentos
	public static void imprimir(String nombre) {
		System.out.println("Mi nombre es: "+ nombre);
	}

}
