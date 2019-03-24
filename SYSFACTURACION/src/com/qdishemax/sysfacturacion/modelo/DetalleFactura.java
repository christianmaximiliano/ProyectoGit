/**
 * 
 */
package com.qdishemax.sysfacturacion.modelo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Creacion de Clase DetalleFactura que se relaciona con Factura
 * 
 * @author christian.gonzalez Maximiliano 2019
 *
 */
public class DetalleFactura {
	/**
	 * Declaración de los atributos
	 */
	private int idDetF;
	private int cantidadDetF;
	private BigDecimal totalDetF;
	// Se asocia con un atributo (Relación 1) (Factura 1 -> N DetalleFactura)
	private Factura factura;

	// Relación de Muchos - (N DetalleFactura -> 1 Producto)
	private Producto producto;

	/**
	 * @param idDetF
	 * @param cantidadDetF
	 * @param totalDetF
	 * @param factura
	 * @param producto
	 */
	public DetalleFactura(int idDetF, int cantidadDetF, BigDecimal totalDetF, Factura factura, Producto producto) {
		super();
		this.idDetF = idDetF;
		this.cantidadDetF = cantidadDetF;
		this.totalDetF = totalDetF;
		this.factura = factura;
		this.producto = producto;
	}

	/**
	 * @return the idDetF
	 */
	public int getIdDetF() {
		return idDetF;
	}

	/**
	 * @param idDetF the idDetF to set
	 */
	public void setIdDetF(int idDetF) {
		this.idDetF = idDetF;
	}

	/**
	 * @return the cantidadDetF
	 */
	public int getCantidadDetF() {
		return cantidadDetF;
	}

	/**
	 * @param cantidadDetF the cantidadDetF to set
	 */
	public void setCantidadDetF(int cantidadDetF) {
		this.cantidadDetF = cantidadDetF;
	}

	/**
	 * @return the totalDetF
	 */
	public BigDecimal getTotalDetF() {
		return totalDetF;
	}

	/**
	 * @param totalDetF the totalDetF to set
	 */
	public void setTotalDetF(BigDecimal totalDetF) {
		this.totalDetF = totalDetF;
	}

	/**
	 * @return the factura
	 */
	public Factura getFactura() {
		return factura;
	}

	/**
	 * @param factura the factura to set
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DetalleFactura [idDetF=" + idDetF + ", cantidadDetF=" + cantidadDetF + ", totalDetF=" + totalDetF
				+ ", factura=" + factura + ", producto=" + producto + ", toString()=" + super.toString() + "]";
	}

}
