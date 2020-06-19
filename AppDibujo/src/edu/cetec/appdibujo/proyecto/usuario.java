package edu.cetec.appdibujo.proyecto;

public class usuario 
{
	private String nombreUsuario;
	private int contraseña;

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
	public int getContraseña() {
		return contraseña;
	}
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}	
}
