package clasecomputadora;

public class Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		computadora Computadora = new computadora();
		
		almacena();
		System.out.println("su almacenamiento esta bien :" + almacena());
		
		navegador();
		System.out.println("su navegador es : " + navegador());
		
		creador();
		System.out.println("es buen: " + creador() + " de aplicaciones");
		
		Computadora.setAlmacenamiento(500);
		System.out.println("almacenamiento :" + Computadora.getAlmacenamiento() + " GB");
		
		Computadora.setCpu("su cpu es");
		System.out.println( "su cpu es :" + Computadora.getCpu());
		
		Computadora.setMonitor("gamimg");
		System.out.println("su monitor es de marca :" + Computadora.getMonitor());
		
		Computadora.setPerifericos(4);
		System.out.println("usted tiene :" + Computadora.getPerifericos()+ " perifericos");
		
		Computadora.setTipo("gamimg");
		System.out.println("su pc es tipo :" + Computadora.getTipo());
		
	}
	static String almacena()
	{
		String almacena="buen espacio";
		return almacena;

	}
	static String navegador()
	{
		String navegador ="rapido";
				return navegador;
	}
	static String creador()
	{
		String creador="creador";
		return creador;
	}

}
