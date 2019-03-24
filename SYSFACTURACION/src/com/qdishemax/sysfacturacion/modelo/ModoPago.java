/**
 * 
 */
package com.qdishemax.sysfacturacion.modelo;

import java.util.List;

/**
 * @author User Maximiliano 2019
 *
 */
public class ModoPago {

	private int idModPag;
	private String nombreModPag;
	private String descripcionModPag;
	// Relación de Muchos - N
	private List<Factura> facturas;

	/**
	 * 
	 */
	public ModoPago() {
	}

	

	/**
	 * @param idModPag
	 * @param nombreModPag
	 * @param descripcionModPag
	 */
	public ModoPago(int idModPag, String nombreModPag, String descripcionModPag) {
		super();
		this.idModPag = idModPag;
		this.nombreModPag = nombreModPag;
		this.descripcionModPag = descripcionModPag;
	}



	/**
	 * @return the idModPag
	 */
	public int getIdModPag() {
		return idModPag;
	}



	/**
	 * @param idModPag the idModPag to set
	 */
	public void setIdModPag(int idModPag) {
		this.idModPag = idModPag;
	}



	/**
	 * @return the nombreModPag
	 */
	public String getNombreModPag() {
		return nombreModPag;
	}



	/**
	 * @param nombreModPag the nombreModPag to set
	 */
	public void setNombreModPag(String nombreModPag) {
		this.nombreModPag = nombreModPag;
	}



	/**
	 * @return the descripcionModPag
	 */
	public String getDescripcionModPag() {
		return descripcionModPag;
	}



	/**
	 * @param descripcionModPag the descripcionModPag to set
	 */
	public void setDescripcionModPag(String descripcionModPag) {
		this.descripcionModPag = descripcionModPag;
	}



	/**
	 * @return the facturas
	 */
	public List<Factura> getFacturas() {
		return facturas;
	}



	/**
	 * @param facturas the facturas to set
	 */
	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ModoPago [idModPag = " + idModPag + ", nombreModPag = " + nombreModPag
				+ ", descripcionModPag = "
				+ descripcionModPag + "]";
	}

}
