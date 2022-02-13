package com.generation;

public abstract class FiguraGeometrica {
	
	//CLASES ABSTRACTAS.
	//CLASES QUE PUEDEN O NO COONTENER METODOS ABSTRACTOS
	//Metodo ABSTRACTO ES UN METODO QUE TE DICE QUE HACER PERO NO TE DICE COMO HACERO
	
	private String nombre;
	protected float alto;
	protected float largo;
	
	/*
	//	constructor vacio
	public FiguraGeometrica() {	
	}*/
	
	//CONSTRUCTOS CON UN PARAMETRO
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
		
	}
	
	
	
	///////////////////////////////////
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	

	
//metodo*******************************
	public abstract float calcularArea();
	
	public abstract float perimetro();
	
	

	

	
}
