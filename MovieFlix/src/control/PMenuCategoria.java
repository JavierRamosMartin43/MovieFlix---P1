package control;

import gui.MenuCategoria;
import models.Categoria;
import services.S_Categoria;
import utils.LecturaDatos;
//import servicios.S_Categoria;

public class PMenuCategoria {
	
	 private Categoria c = new Categoria();
	 
	 /** Método que se utiliza para acceder al Menú de Categoría */
	    public void abrirMenuMovieFlixdeCategoria() {
	        boolean seguir = true;
	        do {
	            MenuCategoria.mostrarMenu();
	            seguir = this.seleccionOpcionesdeCategoria();
	        } while (seguir);
	        System.out.println("   --- Fin de la sesion ---");
	    }

	    /** Método que sirve para seleccionar la opción deseada de la Tabla Categoría*/
	    public boolean seleccionOpcionesdeCategoria() {

	        boolean continuar = true;

	        try {
	            switch (LecturaDatos.leerInt()) {
	                case 1:
	                	/** ALTA DE UNA CATEGORIA */
	                	System.out.println("Has seleccionado: Crear una Categoría");
	                	System.out.println("Introduce el id del Categoría a dar de alta");
	                    S_Categoria.Alta_Categoria(c);
	                    break;

	                case 2:
	                	/** DAR DE BAJA UNA CATEGORIA */
	                	System.out.println("Has seleccionado: Dar de baja una Categoría");
	                	System.out.println("Introduce el id del Categoría a dar de baja");
	                	int idC = LecturaDatos.leerInt();
	                    S_Categoria.Baja_Categoria(idC);
	                    break;

	                case 3:
	                	/** LISTAR CATEGORIAS */ 
	                	System.out.println("Has seleccionado: Listar datos de Categorías");
	                	S_Categoria.Listar_Categoría();
	                    break;

	                case 4:
	                	/** MODIFICAR UNA CATEGORIA */
	                	System.out.println("Has seleccionado: Modificar Categorías");
	                	System.out.println("Introduce el id de la Categoría a modificar");
	                	S_Categoria.Modificar_Categoria(c);
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


