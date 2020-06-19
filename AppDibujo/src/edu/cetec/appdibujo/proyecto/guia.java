package edu.cetec.appdibujo.proyecto;

public class guia
{
	private String respuestas;
	private String tutorial;
	
	public guia()
	{
		System.out.println("bienvenido a tu guia");
	}
	public void guiaAyuda()
	{
		System.out.println();
	}
	
	public String getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(String respuestas) {
		this.respuestas = respuestas;
	}
	public String getTutorial() {
		return tutorial;
	}
	public void setTutorial(String tutorial) {
		this.tutorial = tutorial;
	}
}
