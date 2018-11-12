package proyecto;


import java.sql.*;


public class ConcexionPrueba {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/polideportivo";
		String username = "root";
		String password = "Olatz123gc";
		ResultSet r = null;
		Statement s = null;

		System.out.println("Connecting database...");

		
		try (Connection c = DriverManager.getConnection(url, username, password)) {
			
			
			s = c.createStatement();
			r = s.executeQuery("SELECT * FROM polideportivo.usuario;");
			System.out.println(r.getString("unombre"));
		    
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}

	}

}
