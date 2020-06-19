package claserefrigerador;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		refrigerador Refrigerador = new refrigerador();
		
		congelar();
		System.out.println("su refrigerador :" + congelar());
		
		compartimientos();
		System.out.println("su refrigerador cuenta con :" + compartimientos() + "compartimientos");
		
		guardar();
		System.out.println("tiene buen :" + guardar());
		
		Refrigerador.setCongelar("simon");
		System.out.println("su refrigerador : " + Refrigerador.getCongelar());
		
		Refrigerador.setEspacios(6);
		System.out.println("tiene: " + Refrigerador.getEspacios() + " espacios");
		
		Refrigerador.setHielos(true);
		System.out.println("produce hielo : " + Refrigerador.getHielos());
		
		Refrigerador.setPeso(50);
		System.out.println("su refirgerador pesa :" + Refrigerador.getPeso() + "kilogramos");
		
		Refrigerador.setTamaño("grande");
		System.out.println("su refrigerador esta: " + Refrigerador.getTamaño());

		
	}
	static String congelar()
	{
		String congelar=" esta congelado";
		return congelar;
	}
	static int compartimientos()
	{
		int compartimientos=2;
		return compartimientos;
	}
	static String guardar()
	{
		String guardar="buen espacio";
		return guardar;
		
		
		
	}
	
	

}
