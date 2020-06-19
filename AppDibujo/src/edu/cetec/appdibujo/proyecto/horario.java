package edu.cetec.appdibujo.proyecto;

public class horario extends locacion
{
	private String vespertino;
	private String matutino;
	
	public horario() {
		System.out.println();
	}
	
	public void seleccionHorario()
	{
		System.out.println("selecciona tu horrario :");
	}

	public String getVespertino() {
		return vespertino;
	}

	public void setVespertino(String vespertino) {
		this.vespertino = vespertino;
	}

	public String getMatutino() {
		return matutino;
	}

	public void setMatutino(String matutino) {
		this.matutino = matutino;
	}
	
	
}
