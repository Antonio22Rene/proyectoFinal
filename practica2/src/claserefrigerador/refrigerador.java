package claserefrigerador;

public class refrigerador 
{
	private String congelar;
	private int espacios;
	private int peso;
	private String tama�o;
	private boolean hielos;
	
	public refrigerador()
	{}
	
	public String getCongelar()
	{
		return this.congelar;
	}
	public void setCongelar(String c)
	{
		this.congelar="si congela";
	}
	public int getEspacios()
	{
		return this.espacios;
	}
	public void setEspacios(int e)
	{
		this.espacios=6;
	}
	public int getPeso()
	{
		return this.peso;
	}
	public void setPeso(int s)
	{
		this.peso=50;		
	}
	public String getTama�o()
	{
		return this.tama�o;
	}
	public void setTama�o(String t)
	{
		this.tama�o="grande";
	}
	public boolean getHielos()
	{
		return this.hielos;
	}
	public void setHielos(boolean h)
	{
		this.hielos=true;
	}
	

}
