package control;

import gui.MenuPelicula;
import models.Pelicula;
import services.S_Pelicula;
import utils.LecturaDatos;
//import services.S_Pelicula;

public class PMenuPelicula {
	
	 private Pelicula p = new Pelicula();

	 /** Método que se utiliza para acceder al Menú de Película */
	    public void abrirVideoStreamingPelicula() {
	        boolean seguir = true;
	        do {
	            MenuPelicula.mostrarMenu();
	            seguir = this.seleccionOpcionesdePelicula();
	        } while (seguir);
	        System.out.println("   --- Fin de la sesion ---");
	    }

	    /** Método que sirve para seleccionar la opción deseada de la Tabla Pelicula*/ 
	    public boolean seleccionOpcionesdePelicula() {

	        boolean continuar = true;

	        try {
	            switch (LecturaDatos.leerInt()) {
	                case 1:
	                    // ALTA DE UNA PELICULA
	                	System.out.println("Has seleccionado: Crear una Pelicula");
	                    S_Pelicula.Alta_Pelicula(p);
	                    break;

	                case 2:
	                    // ELIMINAR UNA PELICULA
	                	System.out.println("Has seleccionado: Dar de baja una Pelicula");
	                	System.out.println("Introduce el id de la película a dar de baja");
	                	int idP  = LecturaDatos.leerInt();
	                	S_Pelicula.Baja_Pelicula(idP);
	                    break;

	                case 3:
	                    // LISTAR PELICULA
	                	System.out.println("Has seleccionado: Listar Datos de Peliculas");
	                    S_Pelicula.Listar_Pelicula();
	                	break;
	                case 4:
	                	// MODIFICAR PELICULA
	                	System.out.println("Has seleccionado: Modificar Pelicula");
	                    S_Pelicula.mostrarPelicula(LecturaDatos.leerInt("Introduce el id de la película a modificar"));
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


