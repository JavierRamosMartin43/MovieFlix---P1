package datos;

import models.Categoria;

public interface I_DAO_Categoria {
	
	public void Alta_Categoria(Categoria c);
	public void Baja_Categoria(int cod);
	public void Lista_Categoria(int cod);
	public void Modificar_Categoria(Categoria c);

}
