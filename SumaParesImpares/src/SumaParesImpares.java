import java.util.Scanner;

public class SumaParesImpares {
	
	
	public static void main(String[]args) {
		
		
		 int[ ] numeros = {2,10,20,45, 23, 11, 9};  
		 int sumaPares =0;
		 int sumImPares = 0;
		 int sumaTotal =0;
		 for (int i = 0; i < numeros.length; i++) {
			 sumaTotal +=numeros[i];
			 if(numeros[i]%2 ==0) {
				 sumaPares = sumaPares + numeros[i];
				 
				 
			 }else {
				 sumImPares += numeros[i];
				 
				 
			 }
			 
			
		}
		 System.out.println("Suma Total = "+ sumaTotal);
		 System.out.println("Suma de Pares = "+sumaPares);
		 System.out.println("Suma Impares ="+sumImPares);
	}
	

}
