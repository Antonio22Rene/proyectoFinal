package clasetelevision;

public class television
{
	private int botones;
	private String forma;
	private int peso;
	private String tamaño;
	private String tipo;
	
	public television()
	{
		
	}
	
	public int getBotones()
	{
		return this.botones;
	}
	public void setBtones(int b)
	{
		this.botones=5;
	}
	public String getForma()
	{
		return this.forma;
	}
	public void setForma(String f)
	{
		this.forma="cuadrada";
	}
	public int getPeso()
	{
		return this.peso;
	}
	public void setPeso(int p)
	{
		this.peso=10;
	}
	public String getTamaño()
	{
		return this.tamaño;
	}
	public void setTamaño(String t)
	{
		this.tamaño="grande";
	}
	public String getTipo()
	{
		return this.tipo;
	}
	public void setTipo(String t)
	{
		this.tipo=t;
	}

}
