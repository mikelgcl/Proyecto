package proyecto;

import java.util.Arrays;

public class Pista {

	//Atributos
	private String nombre;
	private String ocho;
	private String nueve;
	private String diez;
	private String once;
	private String doce;
	private String cuatro;
	private String seis;
	
	//Constructor
	public Pista(String nombre, String ocho, String nueve, String diez, String once, String doce, String cuatro,
			String seis) {
		super();
		this.nombre = nombre;
		this.ocho = ocho;
		this.nueve = nueve;
		this.diez = diez;
		this.once = once;
		this.doce = doce;
		this.cuatro = cuatro;
		this.seis = seis;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOcho() {
		return ocho;
	}

	public void setOcho(String ocho) {
		this.ocho = ocho;
	}

	public String getNueve() {
		return nueve;
	}

	public void setNueve(String nueve) {
		this.nueve = nueve;
	}

	public String getDiez() {
		return diez;
	}

	public void setDiez(String diez) {
		this.diez = diez;
	}

	public String getOnce() {
		return once;
	}

	public void setOnce(String once) {
		this.once = once;
	}

	public String getDoce() {
		return doce;
	}

	public void setDoce(String doce) {
		this.doce = doce;
	}

	public String getCuatro() {
		return cuatro;
	}

	public void setCuatro(String cuatro) {
		this.cuatro = cuatro;
	}

	public String getSeis() {
		return seis;
	}

	public void setSeis(String seis) {
		this.seis = seis;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Pista nombre=" + nombre + ", ocho=" + ocho + ", nueve=" + nueve + ", diez=" + diez + ", once=" + once
				+ ", doce=" + doce + ", cuatro=" + cuatro + ", seis=" + seis;
	}
	
	
	
	
	
	
	
	
}
