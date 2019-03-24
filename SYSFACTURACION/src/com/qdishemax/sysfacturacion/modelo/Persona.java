/**
 * (1) - Primer elemento a considerarse en la esructura de un programa
 */
package com.qdishemax.sysfacturacion.modelo;

import java.util.Date;

//(2) Importación de librerias 

/**
 * 
 * (2) - Definicion de la Clase Padre Persona
 * 
 * @author User Maximiliano 2019
 *
 */
public class Persona {
	private String nombrePer;
	private String apellidoPer;
	private String identificacionPer;
	private String fechaNacPer;
	private String direccionPer;
	private String telefonoPer;
	private String correoPer;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombrePer
	 * @param apellidoPer
	 * @param identificacionPer
	 * @param fechaNacPer
	 * @param direccionPer
	 * @param telefonoPer
	 * @param correoPer
	 */
	public Persona(String nombrePer, String apellidoPer, String identificacionPer, String fechaNacPer,
			String direccionPer, String telefonoPer, String correoPer) {
		super();
		this.nombrePer = nombrePer;
		this.apellidoPer = apellidoPer;
		this.identificacionPer = identificacionPer;
		this.fechaNacPer = fechaNacPer;
		this.direccionPer = direccionPer;
		this.telefonoPer = telefonoPer;
		this.correoPer = correoPer;
	}

	/**
	 * @return the nombrePer (Mostrar o obtener el nombre)
	 */
	public String getNombrePer() {
		return nombrePer;
	}

	/**
	 * @param nombrePer the nombrePer to set (Establecer el nombre)
	 */
	public void setNombrePer(String nombrePer) {
		this.nombrePer = nombrePer;
	}

	/**
	 * @return the apellidoPer
	 */
	public String getApellidoPer() {
		return apellidoPer;
	}

	/**
	 * @param apellidoPer the apellidoPer to set
	 */
	public void setApellidoPer(String apellidoPer) {
		this.apellidoPer = apellidoPer;
	}

	/**
	 * Método que no se puede sobreescribir porque utiliza el modificador de
	 * compartamiento final
	 * 
	 * @return the identificacionPer
	 */
	public final String getIdentificacionPer() {
		return identificacionPer;
	}

	/**
	 * @param identificacionPer the identificacionPer to set
	 */
	public void setIdentificacionPer(String identificacionPer) {
		this.identificacionPer = identificacionPer;
	}

	/**
	 * @return the fechaNacPer
	 */
	public String getFechaNacPer() {
		return fechaNacPer;
	}

	/**
	 * @param fechaNacPer the fechaNacPer to set
	 */
	public void setFechaNacPer(String fechaNacPer) {
		this.fechaNacPer = fechaNacPer;
	}

	/**
	 * @return the direccionPer
	 */
	public String getDireccionPer() {
		return direccionPer;
	}

	/**
	 * @param direccionPer the direccionPer to set
	 */
	public void setDireccionPer(String direccionPer) {
		this.direccionPer = direccionPer;
	}

	/**
	 * @return the telefonoPer
	 */
	public String getTelefonoPer() {
		return telefonoPer;
	}

	/**
	 * @param telefonoPer the telefonoPer to set
	 */
	public void setTelefonoPer(String telefonoPer) {
		this.telefonoPer = telefonoPer;
	}

	/**
	 * @return the correoPer
	 */
	public String getCorreoPer() {
		return correoPer;
	}

	/**
	 * @param correoPer the correoPer to set
	 */
	public void setCorreoPer(String correoPer) {
		this.correoPer = correoPer;
	}

}
