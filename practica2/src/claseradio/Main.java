package claseradio;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		radio Radio=new radio();
		
		 sintonizar();
		 System.out.println("busca tu estacion :" + sintonizar());
		 
		 ruido();
		 System.out.println("hay una gran :" + ruido());
		 
		 informar();
		 System.out.println("tu estacion favorita :" + informar());
		
		
		Radio.setTamaño(30);
		System.out.println("el tamaño es :" + Radio.getTamaño() + " cm");
		
		Radio.setColor("blanco");
		System.out.println("el color es :" + Radio.getColor());
		
		Radio.setMarca("LG");
		System.out.println("la marca es :" + Radio.getMarca());
		
		Radio.setModelo(1996);
		System.out.println("año del modelo :" + Radio.getModelo());
		
		Radio.setTipo("vintage");
		System.out.println("el radio es tipo :" + Radio.getTipo());
	
	}
	
	 
	 
	
		static String sintonizar()
		{
			String sintonizar = "estacion";
			return sintonizar;
		}
	static String ruido()
	{
		String ruido = "interferencia";
		return ruido;
	}
	static String informar()
	{
		String informar = "buena estacion";
		return informar;
	}
	

	}



