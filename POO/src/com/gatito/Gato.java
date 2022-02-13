package com.gatito;

public class Gato {
	
	//atributos
	
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//CONSTRUCTOR
	public Gato(String nombre, int patas, boolean adoptado) {
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}
	
	
	
	//GETTERS Y SETTERS Y DEBEN SER PUBLIC
	public String getNombre() {
		return this.nombre;
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		if(patas>=0 && patas<5) {
			this.patas = patas;
			
		}else {
			throw new IllegalArgumentException("El numero de patas no es valido");
			
		}
		
		
	}
	
	public boolean isAdoptado() {//Is porque se hace una pegunta
		return this.adoptado;
	}
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
	
	
	//METODO TOSTRING
	
	
	
	

}
