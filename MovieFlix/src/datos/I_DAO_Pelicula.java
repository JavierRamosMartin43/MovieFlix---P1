package datos;

import models.Pelicula;

public interface I_DAO_Pelicula {
	
	public void Alta_Pelicula(Pelicula p);
	public void Baja_Pelicula(int idP);
	public void Listar_Pelicula(int idP);
	public void Modificar_Pelicula (Pelicula p);
	
}
