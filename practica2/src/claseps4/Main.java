package claseps4;

public class Main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ps4 Ps4 = new ps4();
		
		encender();
		System.out.println("la ps4 :" + encender());
		
		apagar();
		System.out.println("la ps4 esta :" + apagar());
		
		correrJuego();
		System.out.println(" la ps4 : " + correrJuego());
		
		Ps4.setAlmacenamiento(500);
		System.out.println("su ps4 tiene  : " + Ps4.almacenamiento()+ "GB de almacenamiento");
		
		Ps4.setColor("negro");
		System.out.println("el ps4 es de color :" + Ps4.getColor());
		
		Ps4.setCompania("sony");
		System.out.println("es de la compania :" + Ps4.getCompania());
		
		Ps4.setModelo("fat");
		System.out.println("el modelo es : " + Ps4.getModelo());
		
		Ps4.setPeso(1);
		System.out.println("la consola pesa : " + Ps4.getPeso());

	}
	
	static String encender()
	{
		String encender="encendido";
		return encender;
	}
	static String apagar()
	{
		String apagar="apagado";
		return apagar;
	}
	static String correrJuego()
	{
		String correrJuego="corriendo";
		return correrJuego;
	}

}
