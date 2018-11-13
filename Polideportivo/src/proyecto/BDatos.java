package proyecto;

import java.sql.*;
import java.util.ArrayList;

public class BDatos {

	public static  ArrayList<Usuario> cargar() {
		Connection con = null;
		String sURL = "jdbc:mysql://localhost:3306/bdpolideportivo";
		ArrayList<Usuario> usu = new ArrayList<>();
		try {
			con = DriverManager.getConnection(sURL, "root", "Olatz123gc");
			System.out.println("Conexión establecida");
		} catch (SQLException e) {
			System.out.println("Conexión no establecida, error");

		}

		try (PreparedStatement stmt = con.prepareStatement("SELECT n_usuario, c_usuario FROM usuarios")) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Usuario e = new Usuario(rs.getString("n_usuario"), rs.getString("c_usuario"));
				usu.add(e);

			}

		} catch (SQLException sqle) {
			System.out.println("Error en la ejecución:" + sqle.getErrorCode() + " " + sqle.getMessage());
		}
		return usu;

	}


}
