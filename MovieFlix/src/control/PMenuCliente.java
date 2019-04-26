package control;

import gui.MenuCliente;
import models.Cliente;
import services.S_Cliente;
import utils.LecturaDatos;
//import servicios.S_Cliente;

public class PMenuCliente {
	
	 private Cliente c = new Cliente();
	 
	 /** Método para acceder al menú de Cliente */
	    public void abrirMenuMovieFlixdeCliente() {
	        boolean seguir = true;
	        do {
	            MenuCliente.mostrarMenu();
	            seguir = this.seleccionOpcionesCliente();
	        } while (seguir);
	        System.out.println("   --- Fin de la sesion ---");
	    }

	    /** Método que sirve para seleccionar la opción deseada de la Tabla Cliente*/
	    public boolean seleccionOpcionesCliente() {

	        boolean continuar = true;

	        try {
	            switch (LecturaDatos.leerInt()) {
	                case 1:
	                	/** ALTA DE UN CLIENTE */
	                	System.out.println("Has seleccionado: Crear un Cliente");
	                	System.out.println("Introduce el id del cliente a dar de alta");
	                    S_Cliente.Alta_Cliente(c);
	                    break;

	                case 2:
	                	/** DAR DE BAJA UN CLIENTE */
	                	System.out.println("Has seleccionado: Dar de baja cliente");
	                	System.out.println("Introduce el id del cliente a dar de baja");
	                	int idC = LecturaDatos.leerInt();
	                    S_Cliente.Baja_Cliente(idC);
	                    break;

	                case 3:
	                	/** LISTAR CLIENTE */
	                	System.out.println("Has seleccionado: Listar los datos de clientes");
	                	S_Cliente.Listar_Cliente();
	                    break;

	                case 4:
	                	/** MODIFICAR CLIENTE */
	                	System.out.println("Has seleccionado: Modificar un cliente");
	                	System.out.println("Introduce el id del cliente a modificar");
	                	S_Cliente.Modificar_Cliente(c);
	                	break;

	                case 0:
	                    continuar = salir();
	                    break;
	            }
	            
	        } catch (Exception e) {
	            System.out.println("error: " + e.toString());
	        }
	        return continuar;
	    }

	    private boolean salir() throws Exception {
	        String sino = LecturaDatos.leerString("¿Está seguro?(S/N)");
	        return (sino.toUpperCase().charAt(0) != 'S');
	    }
}


