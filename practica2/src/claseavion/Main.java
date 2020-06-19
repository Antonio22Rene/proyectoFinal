package claseavion;

public class Main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//marca Marca=new marca("mexicana");
		//marca.mostrarDatos;
		
		avion Avion  = new avion();
			
		//mis metodos
		
		volar();
		System.out.println("el avion vuela ha: " + volar() + " pies de altura" );
		
		Viajar();
		System.out.println("el avion es de: " + Viajar() );
		
		moverse();
		System.out.println("el avion se mueve : " + moverse() );
		
		
		//metodos get y set
		
		Avion.setModelo("volaris");
		System.out.println(Avion.getModelo() );
		
		Avion.setTamaño(40);
		System.out.println("el tamaño del avion es: " + Avion.getTamaño() + " metros" );
		
		Avion.setModelo("año dos mil");
		System.out.println("el modelo del avion es: " + Avion.getModelo() );
		
		Avion.setColor("blanco");
		System.out.println("el color del avion es: " + Avion.getColor() );
		
		Avion.setTipo("comercial");
		System.out.println("el avion es de tipo: "+Avion.getTipo());
		
		
		
	}	
	
	//mis metodos.
	
		 static int volar()
		 {
			 int Volar = 10000;
			 return Volar;				 		 				 			 			 			 	
         }
		 
	     static String moverse()
		 {
			 String Moverse = " piloto";
			 return Moverse;
		 }
		 static String Viajar()
		 {
			 String Viajar= "viaje comercial";
			 return Viajar;
		 }		 		 
		
}