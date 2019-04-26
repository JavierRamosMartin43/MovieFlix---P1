package models;

public class Pelicula {
	
	private int idPelicula;
	private String nombrePelicula;
	private int anioEstreno;
	private String categoria;
	private int visualizacion;
	private int valoracion;
	
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(int idPelicula, String nombrePelicula, int anioEstreno, String categoria, int visualizacion,
			int valoracion) {
		super();
		this.idPelicula = idPelicula;
		this.nombrePelicula = nombrePelicula;
		this.anioEstreno = anioEstreno;
		this.categoria = categoria;
		this.visualizacion = visualizacion;
		this.valoracion = valoracion;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getVisualizacion() {
		return visualizacion;
	}

	public void setVisualizacion(int visualizacion) {
		this.visualizacion = visualizacion;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + ", nombrePelicula=" + nombrePelicula + ", anioEstreno="
				+ anioEstreno + ", categoria=" + categoria + ", visualizacion=" + visualizacion + ", valoracion="
				+ valoracion + "]";
	}

}
