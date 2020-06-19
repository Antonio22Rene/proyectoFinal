package edu.cetec.appdibujo.proyecto;

public class camara {
	private String frontal;
	private String trasera;
	private int calidad;
	
	public camara()
	{
		System.out.println("bienvenido a la camara");
	}
	public void encenderCamara()
	{
		System.out.println("encendida");
	}
	public void apagarCamara()
	{
		System.out.println("apagada");
	}
	public String getFrontal() {
		return frontal;
	}
	public void setFrontal(String frontal) {
		this.frontal = frontal;
	}
	public String getTrasera() {
		return trasera;
	}
	public void setTrasera(String trasera) {
		this.trasera = trasera;
	}
	public int getCalidad() {
		return calidad;
	}
	public void setCalidad(int calidad) {
		this.calidad = calidad;
	}

	
}
