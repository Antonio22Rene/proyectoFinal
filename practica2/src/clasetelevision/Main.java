package clasetelevision;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		television Television = new television();
		
		reproductorVideo();
		System.out.println("selecciona canal :" +reproductorVideo());
		
		encender();
		System.out.println("television :" + encender());
		
		apagar();
		System.out.println("la television esta :" + apagar());
		
		Television.setBtones(5);
		System.out.println("la television tiene :" + Television.getBotones() + " botones");
		
		Television.setForma("cuadrada");
		System.out.println("su forma es :" + Television.getForma());
		
		Television.setPeso(10);
		System.out.println("su peso es :" + Television.getPeso() + " kilogramos");
		
		Television.setTamaño("grande");
		System.out.println("el tamaño de la television es :" + Television.getTamaño());
		
		Television.setTipo("decada anterior");
		System.out.println("la television es tipo :" + Television.getTipo());

	}	
	static String reproductorVideo()
	{
		String reproductorVideo = "canal";
		return reproductorVideo;
	}
	static String encender()
	{
		String encender="encendida";
		return encender;
	}
	static String apagar()
	{
		String apagar="apagada";
		return apagar;
	}

}
