package claseavion;


public class marca extends avion
{
	private String empresa;
	
	public marca(String modelo,String  tipo,String color, int tama�o, String empresa)
	{
		super(modelo,tipo,color,tama�o);
		this.empresa=empresa;
		
	}
	public void mostrarDatos() {
	
	System.out.println( "la empresa :" +empresa);
	

}
}