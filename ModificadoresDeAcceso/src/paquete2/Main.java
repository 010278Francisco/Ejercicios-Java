package paquete2;
import paquete1.ClaseDefault;
import paquete1.ClaseProtected;

public class Main extends paquete1.ClaseProtected {

	public static void main(String[] args) {
		
		ClaseDefault prueba = new ClaseDefault();
	//	prueba.mostrar();
		
		ClasePrivada privada = new ClasePrivada();
		////privada.edad = 30;
		//privada.nombre = "Francisco";
		
		privada.setSaludar("Francisco");
		
		System.out.println(privada.gerSaludar());
		
		
		//Objeto de la clase Main
		Main protegido = new Main();
		protegido.setEdad(33);
		System.out.println(protegido.getEdad());
		
		

	}

}
