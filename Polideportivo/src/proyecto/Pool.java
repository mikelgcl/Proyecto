package proyecto;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class Pool {
	
	public DataSource datasource;
	
	public String db = "polideportivo";
	public String url = "jdbc:mysql://localhost/"+db;
	public String user = "root";
	public String pass = "Olatz123gc";
	
	private void inicilizaDataSource() {
		
		BasicDataSource basicDataSource = new BasicDataSource();
		
		basicDataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
		basicDataSource.setUsername(user);
		basicDataSource.setPassword(pass);
		basicDataSource.setUrl(url);
		basicDataSource.setMaxActive(50);
	}

}
