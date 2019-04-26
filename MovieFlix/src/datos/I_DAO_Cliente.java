package datos;

import models.Cliente;

public interface I_DAO_Cliente {
	
	public void Alta_Cliente(Cliente p);
	public void Baja_Cliente(int idP);
	public void Listar_Cliente(int idP);
	public void Modificar_Cliente (Cliente p);

}
