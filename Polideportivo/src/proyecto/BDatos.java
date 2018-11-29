package proyecto;

import java.sql.*;
import java.util.ArrayList;

public class BDatos {

	///////////Login funcional 
	public static  ArrayList<Usuario> cargar() {
		//Conectar
		Connection con = null;
		String sURL = "jdbc:mysql://127.0.0.1:3306/bdpolideportivo?useSSL=false";
		ArrayList<Usuario> usu = new ArrayList<>();
		try {
			con = DriverManager.getConnection(sURL, "root", "Olatz123gc");
			
		} catch (SQLException e) {
			System.out.println("Conexi�n no establecida, error");

		}

		//Crear statement y login
		try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario")) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Usuario e = new Usuario(rs.getString("nombre"), rs.getString("contrasenya"), rs.getString("dni"), rs.getString("correo"), rs.getString("num_tarjeta"), rs.getString("con_tarjeta"), rs.getString("fecha_tarjeta"), rs.getString("dinero"));
				usu.add(e);

			}

		} catch (SQLException sqle) {
			System.out.println("Error en la ejecuci�n:" + sqle.getErrorCode() + " " + sqle.getMessage());
		}
		
		return usu;

	}
	
	
	//////////Nuevo usuario
	public static void nuevoUsuario(Usuario usua) {
		//Conectar
		Connection con = null;
		String sURL = "jdbc:mysql://127.0.0.1:3306/bdpolideportivo?useSSL=false";
		ArrayList<Usuario> usu = new ArrayList<>();
		try {
			con = DriverManager.getConnection(sURL, "root", "Olatz123gc");
			//System.out.println("Conexi�n establecida");
		} catch (SQLException e) {
			System.out.println("Conexi�n no establecida, error");

		}
		
		//Crear el statement y a�adir usuario a la base de datos
		
		try {
			PreparedStatement stmt = con.prepareStatement("INSERT INTO usuario VALUES (?,?,?,?,?,?,?,?)");
			String nom2 = usua.getNombre();
			String con2 = usua.getContrasenya();
			String dni2= usua.getDni();
			String cor2= usua.getCorreo();
			String numt2= usua.getNumtar();
			String ctar2= usua.getContar();
			String ftar2= usua.getCadtar();
			String dinero2 = usua.getDinero();
			 
			stmt.setString(1,nom2);
			stmt.setString(2,con2);
			stmt.setString(3,dni2);
			stmt.setString(4,cor2);
			stmt.setString(5,numt2);
			stmt.setString(6,ctar2);
			stmt.setString(7,ftar2);
			stmt.setString(8, dinero2);
			
			// execute insert SQL stetement
            stmt.executeUpdate();

            System.out.println("Se ha a�adido a la base de datos :)");
			
		} catch (Exception e) {
			System.out.println("Error al guardar usuario: "+e.getMessage());
		}
		
		
		
	}
	
	
	///////////Alquilar producto
	public static void alquilarProducto(int a) {
		//Conectar
		Connection con = null;
		String sURL = "jdbc:mysql://127.0.0.1:3306/bdpolideportivo?useSSL=false";
		ArrayList<Usuario> usu = new ArrayList<>();
		try {
			con = DriverManager.getConnection(sURL, "root", "Olatz123gc");
			//System.out.println("Conexi�n establecida");
		} catch (SQLException e) {
			System.out.println("Conexi�n no establecida, error");

		}
		
		//Restar dinero a la cuenta
	
		try {
			//System.out.println(usu.size());
			
			PreparedStatement stmt = con.prepareStatement("UPDATE usuario SET dinero = dinero - "+ a +
					" WHERE nombre = '"+ VentanaInicio.vale.getNombre() +"'");
			
			
			
			// execute insert SQL stetement
            stmt.executeUpdate();

            System.out.println("Se ha alquilado correctamente :)");
			
		} catch (Exception e) {
			System.out.println("Error al alquilar producto: "+e.getMessage());
		}
	}
	
	
	///////////Reserva instalaciones
	public static ArrayList<Pista> cargarPista() {
		//Conectar
				Connection con = null;
				String sURL = "jdbc:mysql://127.0.0.1:3306/bdpolideportivo?useSSL=false";
				ArrayList<Pista> pis = new ArrayList<>();
				try {
					con = DriverManager.getConnection(sURL, "root", "Olatz123gc");
					
				} catch (SQLException e) {
					System.out.println("Conexi�n no establecida, error");

				}
				
		//Reservar la pista
				try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM horas")) {
					ResultSet rs = stmt.executeQuery();

					while (rs.next()) {
						
						Pista e = new Pista(rs.getString("nombrePista"), rs.getString("ocho"), rs.getString("nueve"), rs.getString("diez"), rs.getString("once"), rs.getString("doce"), rs.getString("cuatro"), rs.getString("seis"));
						pis.add(e);

					}

				} catch (SQLException sqle) {
					System.out.println("Error en la ejecuci�n:" + sqle.getErrorCode() + " " + sqle.getMessage());
				}
				
				return pis;
	}
	
	///////////Reservar pista
	public static void reservarPista(String h, String n) {
		//Conectar
		Connection con = null;
		String sURL = "jdbc:mysql://127.0.0.1:3306/bdpolideportivo?useSSL=false";
		ArrayList<Usuario> usu = new ArrayList<>();
		try {
			con = DriverManager.getConnection(sURL, "root", "Olatz123gc");
			//System.out.println("Conexi�n establecida");
		} catch (SQLException e) {
			System.out.println("Conexi�n no establecida, error");

		}
	
		//Poner un 1 en la base de datos

		try {
		
			PreparedStatement stmt = con.prepareStatement("UPDATE horas SET " + h + " = 1 WHERE nombrePista = '" + n + "' ");
		
		
		
			// execute insert SQL stetement
			stmt.executeUpdate();

		
		} catch (Exception e) {
			System.out.println("Error al reservar pista: "+e.getMessage());
		}
	}

	///////////Reservar pista
	public static void resetPistas() {
		//Conectar
		Connection con = null;
		String sURL = "jdbc:mysql://127.0.0.1:3306/bdpolideportivo?useSSL=false";
		ArrayList<Usuario> usu = new ArrayList<>();
		try {
			con = DriverManager.getConnection(sURL, "root", "Olatz123gc");
			//System.out.println("Conexi�n establecida");
		} catch (SQLException e) {
			System.out.println("Conexi�n no establecida, error");

		}
	
		//Poner un 0 en las pistas

		try {
		
			PreparedStatement stmt = con.prepareStatement("UPDATE horas SET ocho = 0");
			PreparedStatement stmt2 = con.prepareStatement("UPDATE horas SET nueve = 0");
			PreparedStatement stmt3 = con.prepareStatement("UPDATE horas SET diez = 0");
			PreparedStatement stmt4 = con.prepareStatement("UPDATE horas SET once = 0");
			PreparedStatement stmt5 = con.prepareStatement("UPDATE horas SET doce = 0");
			PreparedStatement stmt6 = con.prepareStatement("UPDATE horas SET cuatro = 0");
			PreparedStatement stmt7 = con.prepareStatement("UPDATE horas SET seis = 0");
		
		
			// execute insert SQL stetement
			stmt.executeUpdate();
			stmt2.executeUpdate();
			stmt3.executeUpdate();
			stmt4.executeUpdate();
			stmt5.executeUpdate();
			stmt6.executeUpdate();
			stmt7.executeUpdate();
			
			System.out.println("Pistas reseteadas correctamente :(");
		
		} catch (Exception e) {
			System.out.println("Error al reservar pista: "+e.getMessage());
		}
	}
	
	///////////Alquilar producto
	public static void restarDinero() {
		//Conectar
		Connection con = null;
		String sURL = "jdbc:mysql://127.0.0.1:3306/bdpolideportivo?useSSL=false";
		ArrayList<Usuario> usu = new ArrayList<>();
		try {
			con = DriverManager.getConnection(sURL, "root", "Olatz123gc");
			//System.out.println("Conexi�n establecida");
		} catch (SQLException e) {
			System.out.println("Conexi�n no establecida, error");

		}
	
		//Restar dinero a la cuenta

		try {
			//System.out.println(usu.size());
		
			PreparedStatement stmt = con.prepareStatement("UPDATE usuario SET dinero = dinero - 10 "
					+ "WHERE nombre = '"+ VentanaInicio.vale.getNombre() +"'");
		
		
		
			// execute insert SQL stetement
			stmt.executeUpdate();

			System.out.println("Se ha alquilado correctamente :)");
		
		} catch (Exception e) {
			System.out.println("Error al alquilar producto: "+e.getMessage());
		}
	}



}
