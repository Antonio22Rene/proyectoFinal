package practica2;

public class Main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		carro coche  = new carro();
		
		
		//mis metodos
		
		correr();
		System.out.println("el carro corre ha: " + correr() + " kilometros por hora" );
		
		moverse();
		System.out.println("el carro es: " + moverse() );
		
		estacionarse();
		System.out.println("se estaciona solo?: " + estacionarse() );
		
						
		
		
		//metodos get y set
		
		coche.setMarca("Marca chevy");
		System.out.println(coche.getMarca() );
		
		coche.setPeso(1000);
		System.out.println("el peso del auto es: " + coche.getPeso() + " kilogramos" );
		
		coche.setModelo(2006);
		System.out.println("el modelo del coche es: " + coche.getModelo() );
		
		coche.setColor("rojo");
		System.out.println("el color del carro es: " + coche.getColor() );
		
		coche.setPotencia(500);
		System.out.println("la potencia son: "+ coche.getPotencia() + " caballos de fuerza");
		
	}	
	
	//mis metodos.
	
		 static int correr()
		 {
			 int Correr = 100;
			 return Correr;				 		 				 			 			 			 	
         }
		 
	     static String moverse()
		 {
			 String Moverse = " automatico";
			 return Moverse;
		 }
		 static boolean estacionarse()
		 {
			 boolean Estacionarse= false;
			 return Estacionarse;
		 }		 		 
}
