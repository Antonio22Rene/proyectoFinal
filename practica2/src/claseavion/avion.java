package claseavion;

public class avion
	
	{
	private String modelo;
	private int tama�o;
	private String tipo;
	private String marca;
	private String color;
		
	public avion()
	
	{
	System.out.println("mi avion");		
	}
	
	//metodo get yset
	
	
	
	 public avion(String modelo2, String tipo2, String color2, int tama�o2) {
		// TODO Auto-generated constructor stub
	}

	public String getModelo()
	 {
	 return this.modelo;
	 }			
	 public int getTama�o()
	 {
	 return this.tama�o;	
	 }
	 public String getTipo()
	 {
		 return this.tipo;
	 }
	 public String getMarca()
	 {
		return this.marca;				
	 }
	 public String getColor()
	 {
		return this.color;
	 }		
	 
	 //set
	 
	 public void setModelo(String m)
	 {
		this.modelo=m;
	 }
	 public void setTama�o(int t)
	 {		
	 this.tama�o=t;
	 }	
	 public void setTipo(String p)
	 {
	 this.tipo=p;		
	 }			
	 public void setMarca(String a)
	 {
		this.marca=a;
	 }
	 public void setColor(String c)
	 {
		this.color=c;			
	 }			
	 }
	
	 
	
	
	
