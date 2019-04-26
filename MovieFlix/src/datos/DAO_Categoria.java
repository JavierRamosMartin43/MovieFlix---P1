package datos;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Categoria;

public class DAO_Categoria implements I_DAO_Categoria {

	public DAO_Categoria() {
		
	}

	@Override
	public void Alta_Categoria(Categoria c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Baja_Categoria(int cod) {
		// TODO Auto-generated method stub
		Statement st = null;
        try {
            ConexionBD con = new ConexionBD();
            st = con.getConnection().createStatement();
            String q = "Delete from categoria where id=" + cod;
            System.out.println(q);
            int i = st.executeUpdate(q);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void Lista_Categoria(int cod) {
		// TODO Auto-generated method stub
		Statement st = null;
        try {
            ConexionBD con = new ConexionBD();
            st = con.getConnection().createStatement();
            String q = "SELECT * FROM categoria";
            System.out.println(q);
            int i = st.executeUpdate(q);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void Modificar_Categoria(Categoria c) {
		// TODO Auto-generated method stub
		
	}


	

}
