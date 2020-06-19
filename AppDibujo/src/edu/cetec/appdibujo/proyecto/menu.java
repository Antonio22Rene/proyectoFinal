package edu.cetec.appdibujo.proyecto;

public class menu {
	private String inicio;
	
	public menu()
	{
		System.out.println("bienvenido al menu");
	}
	
	public void regresarCurso()
	{
		System.out.println("regresemos a la calse:");
	}
	public void salirCurso()
	{
		System.out.println("Vamos a salir");
	}
	public void salirApp()
	{
		System.out.println("nos vemos");
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	

}
