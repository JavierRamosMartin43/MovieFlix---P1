package control;

import gui.MenuOtrasOpciones;
import models.Pelicula;
import utils.LecturaDatos;
//import services.S_Opciones;

public class PMenuOtrasOpciones {
	
	 Pelicula p = new Pelicula();

	 /** Método para acceder al menú de Película */
	    public void abrirMenuMovieFlixdeOtrasOpciones() {
	        boolean seguir = true;
	        do {
	            MenuOtrasOpciones.mostrarMenu();
	            seguir = this.selecciondeOtrasOpciones();
	        } while (seguir);
	        System.out.println("   --- Fin de la sesion ---");
	    }


	    public boolean selecciondeOtrasOpciones() {

	        boolean continuar = true;

	        try {
	            switch (LecturaDatos.leerInt()) {
	                    
	                case 1:
	                	/** LISTAR PELICULA POR MAS VALORADAS */
	                	System.out.println("Has seleccionado: Listar Peliculas por mas valoradas.");
	                //	S_Opciones.lista_mas_Valorada();
	                    break;

	                case 2:
	                    /** LISTAR PELICULA POR MAS VISTAS */
	                	System.out.println("Has seleccionado: Listar Peliculas por mas vistas.");
	                //	S_Opciones.listaMasVistas();
	                    break;
	                    
	                case 3:
	                	/** LISTAR PELICULA POR CATEGORIA */
	                	System.out.println("Has seleccionado: Listar Pelicula por categoria.");
	                //	S_Opciones.Listar_x_Categoria();
	                    break;
	                    
	                case 4:
	                    /** MOSTRAR PELICULAS QUE PUEDE VER */
	                	System.out.println("Has seleccionado: Ingresa un usuario, para indicar que peliculas puede ver.");
	                //    S_Opciones.DUser_Mostar(LecturaDatos.leerInt("Introduce el id del usuario y asi indicar que peliculas puede ver"));
	                	break;
	                case 5:
	                    /** MOSTRAR PELICULAS QUE AUN */
	                	System.out.println("Has seleccionado: Ingresa un usuario, para indicar que peliculas no ha visto aun.");
	                //  S_Opciones.DUser_Mostrar(LecturaDatos.leerInt("Introduce el id del usuario y asi indicar que peliculas no vio aun"));
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


