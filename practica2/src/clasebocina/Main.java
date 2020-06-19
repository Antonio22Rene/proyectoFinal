package clasebocina;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		bocina Bocina = new bocina();
		
		reproductorMusica();
		System.out.println("aleatoria :" + reproductorMusica());
		
		encender();
		System.out.println("la bocina esta :" + encender());
		
		apagar();
		System.out.println("la bocina esta :" + apagar());
		
		Bocina.setBluetooh("conectado");
		System.out.println("la bocina esta :" + Bocina.getBluetooh());
		
		Bocina.setColor("negra");
		System.out.println("es de color :" + Bocina.getColor());
		
		Bocina.setMarca("LG");
		System.out.println("la marca de la bocina es :" + Bocina.getMarac());
		
		Bocina.setPeso(3);
		System.out.println("el peso de la bocina es ." + Bocina.getPeso()+ "kilogramos");
		
		Bocina.setTamaño("grande");
		System.out.println("su tamaño es :" + Bocina.getTamaño());
		
			
	}
			static String reproductorMusica()
			{
			String reproductorMusica = "aleatorio";
			return reproductorMusica;
			}
			static String encender()
			{
				String encender = "encendidad";
				return encender;
			}
			static String apagar()
			{
				String apagar = "apagada";
				return apagar;
			}

	}



