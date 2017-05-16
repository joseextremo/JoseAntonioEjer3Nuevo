package ejerc1;

public class Receta 
{
	private String nombre;
	private String ingredientes;
	private String preparacion;
	
	public Receta(String nombre) {
		this.nombre = nombre;
	}

	public Receta(String nombre, String ingredientes, String preparacion) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
	}
	
}
