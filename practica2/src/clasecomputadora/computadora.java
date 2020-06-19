package clasecomputadora;

public class computadora
{
	private String monitor;
	private String cpu;
	private String tipo;
	private int perifericos;
	private int almacenamiento;
	
	public computadora()
	{}
	
	public String getMonitor()
	{
		return this.monitor;
	}
	public void setMonitor(String m)
	{
		this.monitor="samsung";
	}
	public String getCpu()
	{
		return this.cpu;
	}
	public void setCpu(String c)
	{
		this.cpu="samsung";
	}
	public String getTipo()
	{
		return this.tipo;
	}
	public void setTipo(String t)
	{
		this.tipo="gamimg";
	}
	public int getPerifericos()
	{
		return this.perifericos;
	}
	public void setPerifericos(int p)
	{
		this.perifericos=4;
	}
	public int getAlmacenamiento()
	{
		return this.almacenamiento;
	}
	public void setAlmacenamiento(int a)
	{
		this.almacenamiento=500;
	}

}
