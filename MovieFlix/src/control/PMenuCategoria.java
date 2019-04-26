package control;

import gui.MenuCategoria;
import models.Categoria;
import services.S_Categoria;
import utils.LecturaDatos;
//import servicios.S_Categoria;

public class PMenuCategoria {
	
	 private Categoria c = new Categoria();
	 
	 /** M�todo que se utiliza para acceder al Men� de Categor�a */
	    public void abrirMenuMovieFlixdeCategoria() {
	        boolean seguir = true;
	        do {
	            MenuCategoria.mostrarMenu();
	            seguir = this.seleccionOpcionesdeCategoria();
	        } while (seguir);
	        System.out.println("   --- Fin de la sesion ---");
	    }

	    /** M�todo que sirve para seleccionar la opci�n deseada de la Tabla Categor�a*/
	    public boolean seleccionOpcionesdeCategoria() {

	        boolean continuar = true;

	        try {
	            switch (LecturaDatos.leerInt()) {
	                case 1:
	                	/** ALTA DE UNA CATEGORIA */
	                	System.out.println("Has seleccionado: Crear una Categor�a");
	                	System.out.println("Introduce el id del Categor�a a dar de alta");
	                    S_Categoria.Alta_Categoria(c);
	                    break;

	                case 2:
	                	/** DAR DE BAJA UNA CATEGORIA */
	                	System.out.println("Has seleccionado: Dar de baja una Categor�a");
	                	System.out.println("Introduce el id del Categor�a a dar de baja");
	                	int idC = LecturaDatos.leerInt();
	                    S_Categoria.Baja_Categoria(idC);
	                    break;

	                case 3:
	                	/** LISTAR CATEGORIAS */ 
	                	System.out.println("Has seleccionado: Listar datos de Categor�as");
	                	S_Categoria.Listar_Categor�a();
	                    break;

	                case 4:
	                	/** MODIFICAR UNA CATEGORIA */
	                	System.out.println("Has seleccionado: Modificar Categor�as");
	                	System.out.println("Introduce el id de la Categor�a a modificar");
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
	        String sino = LecturaDatos.leerString("�Est� seguro?(S/N)");
	        return (sino.toUpperCase().charAt(0) != 'S');
	    }
}


