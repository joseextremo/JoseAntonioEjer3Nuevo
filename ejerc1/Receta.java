package ejerc1;

import java.util.ArrayList;

public class Receta 
{
	private String nombre;
	private ArrayList <String> preparacion= new ArrayList();
	private ArrayList<String> ingredientes = new ArrayList();
	
	public Receta(String nombre) {
		this.nombre = nombre;
	}

	public Receta(String nombre, ArrayList<String> ingredientes, ArrayList<String> preparacion) {
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

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
