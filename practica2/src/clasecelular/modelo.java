package clasecelular;

public class modelo extends celular {
	
	public modelo(String marca, String color, int precio) {
		super (marca,color,precio);
	}
	public void mostar() {
		System.out.println(getMarca()+ getColor()+ getPrecio());
	}

}
