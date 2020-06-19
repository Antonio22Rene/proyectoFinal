package edu.cetec.appdibujo.proyecto;

public class cursoGrabado {

	private String estiloDibujo;
	private String tutor;
	private String nombreAlumno;
	
	public cursoGrabado()
	{
		System.out.println("este es tu curso pre-grabado");
	}
	public void comenzarVideo()
	{
		System.out.println("comenzemos");
	}
	public String getEstiloDibujo() {
		return estiloDibujo;
	}
	public void setEstiloDibujo(String estiloDibujo) {
		this.estiloDibujo = estiloDibujo;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	
}
