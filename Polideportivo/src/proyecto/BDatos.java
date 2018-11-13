package proyecto;

import java.sql.*;

public class BDatos {
	
public static void main(String[] args) {
	
	/*//Driver se inicializa y registra
	try
	{
	   Class.forName("com.mysql.jdbc.Driver");
	} catch (Exception e) {
	   e.printStackTrace();
	}
	
	//Conectamos
	try {
		Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/bdpolideportivo","root", "Olatz123gc");
		// Preparamos la consulta 
		Statement s = conexion.createStatement(); 
		ResultSet rs = s.executeQuery ("select * from usuarios");
		// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla. 
		while (rs.next()) 
		{ 
		    System.out.println (rs.getString (1) + " " + rs.getString (2)); 
		}
		
		// Cerramos la conexion a la base de datos. 
		conexion.close();
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}*/
	
	
	
	
	
	//Conecto con la base 
	Connection con = null;
	String sURL = "jdbc:mysql://localhost:3306/bdpolideportivo";
	try {
		con = DriverManager.getConnection(sURL,"root","Olatz123gc");
		System.out.println("Conexión establecida");
	} catch (SQLException e) {
		System.out.println("Conexión no establecida, error");
		
	}
	
	//Hago un statement y lo saco en pantalla 
	/*try (PreparedStatement stmt = con.prepareStatement("SELECT n_usuario, c_usuario FROM usuarios")) {
		  ResultSet rs = stmt.executeQuery();
		 
		  while (rs.next()) {
		    System.out.println (rs.getString("n_usuario") + " " + rs.getString("c_usuario"));
		    
		  }
		  
		} catch (SQLException sqle) { 
		  System.out.println("Error en la ejecución:" 
		    + sqle.getErrorCode() + " " + sqle.getMessage());    
		}*/
		

	
	
}

}
