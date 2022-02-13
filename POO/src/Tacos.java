
public class Tacos {
	
	String tipoDeTortilla;
	String tipoDeGuisado;
	private int numeroDeTortilla;
	String tamanioDeTortilla;
	float precio = 0.0f;
	
	
	//setters y getters
	
	public int getNumeroDeTortilla() {
		return this.numeroDeTortilla;
	}
	
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if(numeroDeTortilla == 2) {
			this.numeroDeTortilla = numeroDeTortilla;
			
		}else {
			throw new IllegalArgumentException("Solo tengo 2 tortillas");
		}
		
	}
	
	
	//el constructor nos ayuda a inicializar objetos
	public Tacos() {
		
	}
	
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
		
	}
	
	
	public Tacos(String tipoDeTortilla,
			String tipoDeGuisado,int numeroDeTortilla,
			String tamanioDeTortilla, float precio) {
		this.tipoDeTortilla = tipoDeTortilla;//Lapalabra this hace mencion al llamado de la misma clase
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
		
		
	}
	
	
	
	void preparar() {
		System.out.println("Preparando taco rico");
		
	}
	
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
		
	}
	
	void subirPrecio(float aumento){
		precio = precio + aumento;
		
		
	}


	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamañoDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	
	

}
