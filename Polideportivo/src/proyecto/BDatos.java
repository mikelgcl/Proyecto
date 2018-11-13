package proyecto;

import java.sql.*;
import java.util.ArrayList;

public class BDatos {

	//Login funcional 
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

		try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario")) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Usuario e = new Usuario(rs.getString("nombre"), rs.getString("contrasenya"), rs.getString("dni"), rs.getString("correo"), rs.getLong("num_tarjeta"), rs.getInt("con_tarjeta"), rs.getLong("fecha_tarjeta"));
				usu.add(e);

			}

		} catch (SQLException sqle) {
			System.out.println("Error en la ejecución:" + sqle.getErrorCode() + " " + sqle.getMessage());
		}
		return usu;

	}
	
	
	//Nuevo usuario


}
