package ejerc1;

public class Ingredientes 
{
	private float cantidad;
	private String unidad;
	private String nombre;
	
	public Ingredientes(float cantidad, String nombre, String unidad) {
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.unidad = unidad;
	}

	public Ingredientes() {
		
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}