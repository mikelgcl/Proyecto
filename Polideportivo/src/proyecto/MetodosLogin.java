package proyecto;

import java.sql.Connection;

Pool metodosPool = new Pool();

public class MetodosLogin {

	public int validarIngreso () {
		int resultado = 0;
		
		String usuario = VentanaInicio.textUsuario.getText();
		String clave = String.valueOf(VentanaInicio.textContraseña.getPassword());
		
		String SSQL = "SELECT * FROM usuarios WHERE nusuario'"+usuario+"' AND ucontraseña=sha1('"+clave+"')";
		
		Connection conect= null;
		
		
		return resultado;
	}
	
	
}
