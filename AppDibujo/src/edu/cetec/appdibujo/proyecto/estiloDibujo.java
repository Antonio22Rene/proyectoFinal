package edu.cetec.appdibujo.proyecto;

public class estiloDibujo extends usuario
{
	private String manga;
	private String realismo;
	private String comic;
	private String caricatura;
	private String Hiperrealismo;
	

	public void seleccionEstilo()
	{
		System.out.println();
	}
		
	public String getManga() {
		return manga;
	}
	public void setManga(String manga) {
		this.manga = manga;
	}
	public String getRealismo() {
		return realismo;
	}
	public void setRealismo(String realismo) {
		this.realismo = realismo;
	}
	public String getComic() {
		return comic;
	}
	public void setComic(String comic) {
		this.comic = comic;
	}
	public String getCaricatura() {
		return caricatura;
	}
	public void setCaricatura(String caricatura) {
		this.caricatura = caricatura;
	}
	public String getHiperrealismo() {
		return Hiperrealismo;
	}
	public void setHiperrealismo(String hiperrealismo) {
		Hiperrealismo = hiperrealismo;
	}

}

