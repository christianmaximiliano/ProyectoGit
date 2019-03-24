/**
 * 
 */
package com.qdishemax.sysfacturacion.modelo;

/**
 * Definición de la clase Empleado y aplicamos la Herencia de la clase Padre
 * Persona Se incluye la palabra reservada extends
 * @author User Maximiliano
 * 2019
 *
 */
public class Empleado extends Persona {
	private String celularEmp;


	public Empleado() {
	}


	/**
	 * @param celularEmp
	 */
	public Empleado(String celularEmp) {
		super();
		this.celularEmp = celularEmp;
	}


	/**
	 * @return the celularEmp
	 */
	public String getCelularEmp() {
		return celularEmp;
	}


	/**
	 * @param celularEmp the celularEmp to set
	 */
	public void setCelularEmp(String celularEmp) {
		this.celularEmp = celularEmp;
	}
	
	
}