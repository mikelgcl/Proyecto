package proyecto;

/*import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class MetodosLogin {
	
	Pool metodosPool = new Pool();

	public int validarIngreso () {
		int resultado = 0;
		
		String usuario = VentanaInicio.textUsuario.getText();
		String clave = String.valueOf(VentanaInicio.textContrase�a.getPassword());
		
		String SSQL = "SELECT * FROM usuarios WHERE nusuario'"+usuario+"' AND ucontrase�a=sha1('"+clave+"')";
		
		Connection conect= null;
		
		
		
		try {
			conect = metodosPool.dataSource.getConnection();
			Statement st = conect.createStatement();
			ResultSet rs = st.executeQuery(SSQL);
			
			if(rs.next()) {
				
				resultado=1;
			}
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex, "Error de conexi�n",JOptionPane.ERROR_MESSAGE);
		} finally {
			
			try {
				conect.close();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex, "Error de desconexi�n",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		
		return resultado;
	}
	
	
}*/
