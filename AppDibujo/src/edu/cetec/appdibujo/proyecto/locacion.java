package edu.cetec.appdibujo.proyecto;

public class locacion extends usuario{
	private String pais;
	private String estado;
	private String idioma;
	
	public locacion()
	{
		System.out.println("cual es tu locacion?");
	}
	public void buscarPais()
	{
		System.out.println("has encontrado tu pais?");
	}
	public void buscarEstado()
	{
		System.out.println("Has encontrado tu estado?");
	}
	public void seleccionIdioma()
	{
		System.out.println("que buen idioma");
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	

}
