package dal;

public class Libro {

	String Titulo;
	String Editorial;
	String Edicion;
	String añoPublicacion;
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getEditorial() {
		return Editorial;
	}
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	public String getEdicion() {
		return Edicion;
	}
	public void setEdicion(String edicion) {
		Edicion = edicion;
	}
	public String getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
}
