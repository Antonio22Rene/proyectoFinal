package edu.cetec.appdibujo.proyecto;

public class usuario 
{
	private String nombreUsuario;
	private int contrase�a;

	{
		System.out.println("bienvenido a tu app de dibujo");	
	}
	public void registrarse()
	{
		System.out.println("Debes registrarte");
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public int getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(int contrase�a) {
		this.contrase�a = contrase�a;
	}	
}
