package models;

public class Categoria {
	
	private int idCategoria;
	private Pelicula idPelicula;
	private String categoria;
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(int idCategoria, Pelicula idPelicula, String categoria) {
		super();
		this.idCategoria = idCategoria;
		this.idPelicula = idPelicula;
		this.categoria = categoria;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Pelicula getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Pelicula idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", idPelicula=" + idPelicula + ", categoria=" + categoria
				+ "]";
	}
}
