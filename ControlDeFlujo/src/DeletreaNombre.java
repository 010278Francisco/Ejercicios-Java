import java.util.Scanner;

public class DeletreaNombre {
	
	public static void main (String[]args) {
		System.out.println("Dame nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(" " + nombre.charAt(i));
			
		}
	}
	

}
