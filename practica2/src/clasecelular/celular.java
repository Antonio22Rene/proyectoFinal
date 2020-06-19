package clasecelular;

public class celular 
{
	private String marca;
	private int Almacenamiento;
	private String color;
	private int precio;
	private String modelo;
	
	public celular()
	{}
	
	public celular(String marca2, String color2, int precio2) {
		// TODO Auto-generated constructor stub
	}

	public String getMarca()
	{
		return this.marca;
	}
	public void setMarca(String m)
	{
		this.marca="samsung";
	}
	public int getAlmacenamiento()
	{
		return this.Almacenamiento;
	}
	public void setAlmacenamiento(int a)
	{
		this.Almacenamiento=500;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String c)
	{
		this.color="blanco";
	}
	public int getPrecio()
	{
		return this.precio;
	}
	public void setPrecio(int p)
	{
		this.precio=5000;
	}
	public String getModelo()
	{
		return this.modelo;
	}
	public void setModelo(String m)
	{
		this.modelo="touch";
	}

}
