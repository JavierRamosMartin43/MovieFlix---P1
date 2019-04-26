package control;

import gui.Menu;
import utils.LecturaDatos;

public class PMenuEM {
	
	PMenuCategoria mc = new PMenuCategoria();
	PMenuPelicula mp = new PMenuPelicula();
	PMenuCliente mcl = new PMenuCliente();
	PMenuOtrasOpciones mop = new PMenuOtrasOpciones();

	/** Método que se utiliza para acceder a la selecion de los Menús */
    public void abrirMenuMovieFlix() {
        boolean seguir = true;
        do {
            Menu.mostrarMenu();
            seguir = this.seleccioarnMenusdeOpciones();
        } while (seguir);
        System.out.println("   --- Fin de la sesion ---");
    }

    
    /** Método booleano que se utiliza para seleccionar el Menu de Categoría, de Película, de Cliente */
    public boolean seleccioarnMenusdeOpciones() {

        boolean continuar = true;

        try {
            switch (LecturaDatos.leerInt()) {
                case 1:
                    //MENU CATEGORIA
                	System.out.println("Has seleccionado: Menu de Categoría");
                    mc.abrirMenuMovieFlixdeCategoria();
                    break;

                case 2:
                    //MENU PELICULA
                	System.out.println("Has seleccionado: Menu de Pelicula");
                	mp.abrirVideoStreamingPelicula();
                    break;
                    
                case 3:
                    //MENU CLIENTE
                	System.out.println("Has seleccionado: Menu de Cliente");
                    mcl.abrirMenuMovieFlixdeCliente();
                    break;
                    
                case 4:
                    //MENU OTRAS OPCIONES
                	System.out.println("Has seleccionado: Menu de Cliente");
                    mop.abrirMenuMovieFlixdeOtrasOpciones();
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
