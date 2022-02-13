package paquete2;

public class ClasePrivada {
	// Atributos
	
	private String nombre;
	private int edad;
	
	//Metodo
	public void setSaludar(String nombre) {//fija o modifica un valor
		this.nombre = nombre;
		
		
	}
	public String gerSaludar() {
		return this.nombre;
	}

}
