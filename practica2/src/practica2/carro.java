package practica2;

public class carro


	
	{
	private int peso;
	private String marca;
	private int modelo;
	private String color;
	private int potencia;

		
	public carro()
	{
	System.out.println("mi carro");	
	
	}
	
	//metodo get yset
	
	 public int getPeso()
	 {
	 return this.peso;
	 }			
	 public String getMarca()
	 {
	 return this.marca;	
	 }
	 public int getPotencia()
	 {
		 return this.potencia;
	 }
	 public int getModelo()
	 {
		return this.modelo;				
	 }
	 public String getColor()
	 {
		return this.color;
	 }		
	 public void setPotencia(int t)
	 {
		this.potencia=t;
	 }
	 public void setPeso(int p)
	 {		
	 this.peso=p;
	 }	
	 public void setMarca(String m)
	 {
	 this.marca=m;		
	 }			
	 public void setModelo(int o)
	 {
		this.modelo=o;
	 }
	 public void setColor(String c)
	 {
		this.color=c;			
	 }			
	 }
	
	 
	
	
	
