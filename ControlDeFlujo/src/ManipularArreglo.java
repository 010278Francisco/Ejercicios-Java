
public class ManipularArreglo {
	/*Crea una clase llamara ManipularArreglo
crea un array con los siguientes n�meros enteros: 1, 6, 45, 53, 80, 102, 145, 326, 450, 892



Crea un programa que use un ciclo que tome los n�meros de arreglo y devuelva 
la suma total, la suma de los n�meros pares y la suma de los n�meros impares.

*/
	
	public static void main(String[]args) {
		
		int [] numeros = new int[] {

				1, 6, 45, 53, 80, 102, 145, 326, 450, 892	
				
				
					
		};
		int sumaTotal =0;
		int sumPar = 0;
		int impar =0;
		
		for (int i = 0; i < numeros.length; i++) {
			sumaTotal = sumaTotal+numeros[i];//devuelbe la suma del arreglo
			
			if (numeros[i]%2==0) {//hacemos condicion de si es numero par los sume
				
				 sumPar = sumPar+numeros[i];//hace la suma de los numeros pares
			}
			else {// else en caso de que no sean pares hacemos la suma de los numeros impares
				impar = impar + numeros[i];//se hace la suma de los numeros impares
			}	
		}
		
		//Regresamos los valores de cada resultado
		System.out.println("La suma total es " + sumaTotal);
		System.out.println("Numeros Pares " +sumPar);
		System.out.println("Numeros Impares " + impar);
		
	}
	
}
