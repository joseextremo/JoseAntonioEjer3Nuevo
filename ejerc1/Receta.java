package ejerc1;

import java.util.ArrayList;

public class Receta 
{
	private String nombre;
	private ArrayList<String> ingredientes = new ArrayList();
	private String preparacion;
	
	public Receta(String nombre) {
		this.nombre = nombre;
	}

	public Receta(String nombre, ArrayList<String> ingredientes, String preparacion) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
	}
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}
	
}
