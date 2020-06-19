package clasecelular;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		celular Celular = new celular();
		
		encender();
		System.out.println("el celular esta ." + encender());
		
		almacenar();
		System.out.println("el celular tiene de almacenamiento :" + almacenar());
		
		llamadas();
		System.out.println("el celular hace llamadas :" + llamadas());
		
		
		Celular.setAlmacenamiento(500);
		System.out.println("el almacenamiento del celular es :" + Celular.getAlmacenamiento());
		
		Celular.setColor("negro");
		System.out.println("el color del celular es :" + Celular.getColor());
		
		Celular.setMarca("samsung");
		System.out.println("la marca del celular es :" + Celular.getMarca());
		
		Celular.setModelo("touch");
		System.out.println("es modelo :" + Celular.getModelo());
		
		Celular.setPrecio(5000);
		System.out.println("el precio del celular es : " + Celular.getPrecio());

	}
	
	static String encender()
	{
		String encender="encendido";
		return encender;
	}
	static String almacenar()
	{
		String almacenar="almacenado";
		return almacenar;
	}
	static String llamadas()
	{
		String llamadas="si";
		return llamadas;
	}

}
