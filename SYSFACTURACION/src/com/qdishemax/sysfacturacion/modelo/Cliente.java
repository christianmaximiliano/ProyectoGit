/**
 * (1) Primer elemento a considerarse en la esructura de un programa
 */
package com.qdishemax.sysfacturacion.modelo;

import java.math.BigDecimal;
import java.util.List;

// (2) Importación de librerias 

/**
 * Definición de la clase Cliente y aplicamos la Herencia de la clase Padre
 * Persona Se incluye la palabra reservada extends
 * 
 * @author User Maximiliano 2019
 *
 */
public class Cliente extends Persona {

	private int idCli;
	private BigDecimal cuotaVenCli;

	// Relación de Muchos - N
	private List<Factura> factura;

	public Cliente() {

	}

	/**
	 * @param nombrePer
	 * @param apellidoPer
	 * @param identificacionPer
	 * @param fechaNacPer
	 * @param direccionPer
	 * @param telefonoPer
	 * @param correoPer
	 * @param idCli
	 * @param cuotaVenCli
	 */
	public Cliente(String nombrePer, String apellidoPer, String identificacionPer, String fechaNacPer,
			String direccionPer, String telefonoPer, String correoPer, int idCli, BigDecimal cuotaVenCli) {
		super(nombrePer, apellidoPer, identificacionPer, fechaNacPer, direccionPer, telefonoPer, correoPer);
		this.idCli = idCli;
		this.cuotaVenCli = cuotaVenCli;
	}

	/**
	 * @return the idCli
	 */
	public int getIdCli() {
		return idCli;
	}

	/**
	 * @param idCli the idCli to set
	 */
	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}

	/**
	 * @return the cuotaVenCli
	 */
	public BigDecimal getCuotaVenCli() {
		return cuotaVenCli;
	}

	/**
	 * @param cuotaVenCli the cuotaVenCli to set
	 */
	public void setCuotaVenCli(BigDecimal cuotaVenCli) {
		this.cuotaVenCli = cuotaVenCli;
	}

	/**
	 * @return the factura
	 */
	public List<Factura> getFactura() {
		return factura;
	}

	/**
	 * @param factura the factura to set
	 */
	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [idCli = " + idCli + " Nombre : " + getNombrePer() + " Apellido: " + getNombrePer()
				+ " Identificacion: " + getIdentificacionPer() + " Fecha Nacimiento: " + getFechaNacPer()
				+ " Dirección : " + getDireccionPer() + " Telefono : " + getTelefonoPer()
				+ " Correo : " + getCorreoPer() + " cuotaVenCli = " + cuotaVenCli + "]";
	}

}
