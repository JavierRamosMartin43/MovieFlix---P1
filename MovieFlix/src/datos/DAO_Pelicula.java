package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Pelicula;
import utils.LecturaDatos;

public class DAO_Pelicula implements I_DAO_Pelicula{

	public DAO_Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**M�todo para dar de alta a una pel�cul */
	public void Alta_Pelicula(Pelicula p) {
		Statement st = null;
		int valorDefecto = 0;

		try {
			/** Conexi�n con la base de datos  */
			ConexionBD con = new ConexionBD();
			con.ConexionDB();
			st = con.getConnection().createStatement();

			/** Se piden datos a usuario para rellenar la tabla "Pelicula" de la base de datos,
			 en visualizaci�n y valoraci�n se indican valores nulos por defecto */
			p.setNombrePelicula(LecturaDatos.leerString("Introduce el nombre de la Pelicula"));
			p.setAnioEstreno(LecturaDatos.leerInt("Introduce el a�o de estreno de la Pelicula"));
			p.setCategoria(LecturaDatos.leerString("Introduce la categoria:"));
			p.setVisualizacion(valorDefecto);
			p.setValoracion(valorDefecto);

			/**	Sentencia SQL para insertar los datos en la BD */
			String sql = "INSERT INTO pelicula (nombrePelicula, anioEstreno, categoria, visualizacion, valoracion) VALUES ('"
					+ p.getNombrePelicula() + "','" + p.getAnioEstreno() + "','" + p.getCategoria() + "','"
					+ p.getVisualizacion() + "','" + p.getValoracion() + "')";

			System.out.println("" + sql);
			st.executeUpdate(sql);
			
		/** Catch que captura los posibles errores */
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("---" + ex.getSQLState());
			System.out.println("---" + ex.getErrorCode());
			System.out.println("---" + ex.getMessage());

			Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


	/** M�todo para dar de baja a una pel�cula */
	public void Baja_Pelicula(int idP) {
		Statement st = null;
		try {
			/** Se pide un id de pel�cula por teclado */
			System.out.println("C�digo a dar de baja: " + idP);
			
			/** Conexi�n con la base de datos */
			ConexionBD con = new ConexionBD();
			con.ConexionDB();
			st = con.getConnection().createStatement();
			
			/** Sentencia SQL para borrar la pel�cula en la base de datos */
			String s = "delete from pelicula where idPelicula =" + idP;

			int i = st.executeUpdate(s);
			System.out.println(s + i);
			
			/** Terminar la conexi�n */
			con.getConnection().close();

		}

		/** Catch que captura los posibles errores */
		catch (Exception ex) {
			Logger.getLogger(DAO_Pelicula.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	/** M�todo que muestra los datos de una pel�cua al introducir su id */
	public void Listar_Pelicula(int idP) {
		Statement st = null;
		ResultSet rs = null;
		try {
			
			/** Conexi�n con la base de datos */
			ConexionBD con = new ConexionBD();
			con.ConexionDB();
			st = con.getConnection().createStatement();

			/** Sentencia SQL que permite seleccionar la pel�cula a borrar a trav�s de su id */
			rs = st.executeQuery("SELECT * FROM pelicula where idPelicula =" + idP);

			while (rs.next()) {

				/** Se rellena un objeto Pel�cula con datos de la
				base de datos para mostrarlo por pantalla */
				Pelicula p = new Pelicula();
				p.setIdPelicula(rs.getInt("idPelicula"));
				p.setNombrePelicula(rs.getString("nombrePelicula"));
				p.setAnioEstreno(rs.getInt("anioEstreno"));
				p.setCategoria(rs.getString("categoria"));
				p.setVisualizacion(rs.getInt("visualizacion"));
				p.setValoracion(rs.getInt("valoracion"));

				System.out.println(p);
			}

			/** Cierre de conexi�n */
			con.getConnection().close();

		/** Catch que captura los posibles errores */
		} catch (SQLException ex) {
			Logger.getLogger(DAO_Pelicula.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
	
	/**	M�todo para modificar una pel�cula a partir de un id de pel�cula */
	public void Modificar_Pelicula (Pelicula p) {
		/**crear sentencia */
		Statement st1 = null;
		Logger.getLogger("Creando variable sentencia");
		int valorDefecto = 0;
		
		try {
			
			System.out.println("Modificaci�n datos de la pel�cula.");
			
			/** C�digo de la pel�cula que se desea modificar */
			int idp = LecturaDatos.leerInt("Codigo de la pel�cula a modificar:");
			
			/** Pedir los datos nuevos de la pel�cula existente */
			p.setIdPelicula(idp);
			p.setNombrePelicula(LecturaDatos.leerN("Pel�cula: "));
			p.setAnioEstreno(LecturaDatos.leerInt("A�o de extreno: "));
			p.setCategoria(LecturaDatos.leerN("Categor�a: "));
			p.setVisualizacion(valorDefecto);
			p.setValoracion(valorDefecto);
			
			/** Conexi�n a base de datos */
			ConexionBD con = new ConexionBD();
			con.ConexionDB();
			st1 = con.getConnection ().createStatement ();
			
			/** Concatenado de sentencias SQL y variables */
			String q = "UPDATE PELICULA SET idPelicula = '" + p.getIdPelicula() + "', nombrePelicula= '" + p.getNombrePelicula() +
					 "', anioEstreno = '" + p.getAnioEstreno() +"', categoria = '" + p.getCategoria() + "', visualizacion= '" + p.getVisualizacion() 
					 + "', valoracion= '" + p.getValoracion()+ "' WHERE idPelicula= " + p.getIdPelicula();
			
			System.out.println("Sentencia: " + q);
			
			/** Ejecutar los cambios */
			st1.executeUpdate(q);
			
			/** Cierre de conexi�n */
			con.getConnection ().close();
			
		/** Catch que captura los posibles errores */
		}catch(SQLException ex) {
			Logger.getLogger("Error con el SQL");
		}
		
	}	

}
