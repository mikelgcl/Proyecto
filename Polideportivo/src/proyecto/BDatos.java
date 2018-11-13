package proyecto;

import java.sql.*;

public class BDatos {
	
public static void main(String[] args) {
	
	//Driver se inicializa y registra
	try
	{
	   Class.forName("com.mysql.jdbc.Driver");
	} catch (Exception e) {
	   e.printStackTrace();
	}
	
	//Conectamos
	try {
		Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/prueba","root", "Olatz123gc");
		// Preparamos la consulta 
		Statement s = conexion.createStatement(); 
		ResultSet rs = s.executeQuery ("select * from usuario");
		// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla. 
		while (rs.next()) 
		{ 
		    System.out.println (rs.getString (1) + " " + rs.getString (2)); 
		}
		
		// Cerramos la conexion a la base de datos. 
		conexion.close();
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
}

}
