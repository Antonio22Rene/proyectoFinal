package edu.cetec.appdibujo.proyecto;

public class curso {
	private String online;
	private String grabado;
	
	public curso()
	{
	 System.out.println("que tipo de curso te gustaria temner?");
	}
	public void clases()
	{
		System.out.println("selecciona tus class");
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	public String getGrabado() {
		return grabado;
	}
	public void setGrabado(String grabado) {
		this.grabado = grabado;
	}
	

}
