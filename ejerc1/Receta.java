package ejerc1;

import java.util.ArrayList;

public class Receta 
{
	private int personas=4;
	String autor;
	private String nombre;
	private ArrayList <String> preparacion= new ArrayList();
	private ArrayList<Ingredientes> ingredientes = new ArrayList();
	
	public Receta(String nombre) {
		this.nombre = nombre;
	}

	public Receta(String nombre, ArrayList<Ingredientes> ingredientes, ArrayList<String> preparacion, int personas, String autor) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
		this.personas = personas;
		this.autor = autor;
	}
	
	public ArrayList<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
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
	
	public void addIngrediente (Ingredientes nuevo)
	{
		ingredientes.add(nuevo);
	}
	
	public void addPreparacion (String prepara)
	{
		preparacion.add(prepara);
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return ".Receta: " + nombre.toUpperCase() + "\n .Preparacion:\n" + recorrerPreparacion() + ",\n Ingredientes:\n" + devolverIngredientes();
	}
	
	public String recorrerPreparacion ()
	{
		String devolver=new String();
		
		for (int i=0;i<preparacion.size();i++)
		{
			devolver=devolver+"   -Paso "+(i+1)+preparacion.get(i)+"\n";
		}
		
		return devolver;
	}
	
	public String devolverIngredientes()
	{
		String devolver=new String();
		
		for (int i=0;i<ingredientes.size();i++)
		{
			devolver=devolver+"   -"+ingredientes.get(i).getCantidad()+" "+ingredientes.get(i).getUnidad()+" de "+ingredientes.get(i).getNombre()+"\n";
		}
		
		return devolver;
	}
	
	public Receta recetaPara (int personas)
	{
		float ingrePersona = ingredientes.get(0).getCantidad()/personas;
		
		float ingreTotal = ingrePersona*personas;
		
		ingredientes.get(0).setCantidad(ingreTotal);
		
		return this;
	}

	
}
