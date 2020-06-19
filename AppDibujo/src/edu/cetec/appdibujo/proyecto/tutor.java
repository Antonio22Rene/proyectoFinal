package edu.cetec.appdibujo.proyecto;

public class tutor extends usuario{
	private String nombre;
	private String apellidos;
	private int edad;
	private String pais;
	private String estiloDibujo;
	
	public tutor()
	{
		System.out.println("este es tu tutor");
	}
	public void comenzarClase()
	{
		System.out.println("empecemos la clase");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstiloDibujo() {
		return estiloDibujo;
	}
	public void setEstiloDibujo(String estiloDibujo) {
		this.estiloDibujo = estiloDibujo;
	}
	

}
