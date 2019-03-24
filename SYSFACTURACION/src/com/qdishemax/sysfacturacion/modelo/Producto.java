/**
 * 
 */
package com.qdishemax.sysfacturacion.modelo;

import java.math.BigDecimal;
import java.util.List;

/**
 * creación de la clase tabla Producto
 * 
 * @author christian.gonzalez Maximiliano 2019
 *
 */
public class Producto {
	private int idPro;
	private String nombrePro;
	private BigDecimal precioPro;
	private int cantidadPro;
	// Se asocia con un atributo (Relación 1) (Producto N -> 1 Categoria)
	private Categoria categoria;

	// Relación de Muchos - N
//	 private List<DetalleFactura> detalleFacturas; //(DetalleFactura N -> 1 Producto)

	/**
	 * @param idPro
	 * @param nombrePro
	 * @param precioPro
	 * @param cantidadPro
	 * @param categoria
	 */
	public Producto(int idPro, String nombrePro, BigDecimal precioPro, int cantidadPro, Categoria categoria) {
		super();
		this.idPro = idPro;
		this.nombrePro = nombrePro;
		this.precioPro = precioPro;
		this.cantidadPro = cantidadPro;
		this.categoria = categoria;
	}

	/**
	 * @return the idPro
	 */
	public int getIdPro() {
		return idPro;
	}

	/**
	 * @param idPro the idPro to set
	 */
	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}

	/**
	 * @return the nombrePro
	 */
	public String getNombrePro() {
		return nombrePro;
	}

	/**
	 * @param nombrePro the nombrePro to set
	 */
	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}

	/**
	 * @return the precioPro
	 */
	public BigDecimal getPrecioPro() {
		return precioPro;
	}

	/**
	 * @param precioPro the precioPro to set
	 */
	public void setPrecioPro(BigDecimal precioPro) {
		this.precioPro = precioPro;
	}

	/**
	 * @return the cantidadPro
	 */
	public int getCantidadPro() {
		return cantidadPro;
	}

	/**
	 * @param cantidadPro the cantidadPro to set
	 */
	public void setCantidadPro(int cantidadPro) {
		this.cantidadPro = cantidadPro;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPro;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (idPro != other.idPro)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[Producto [idPro = " + idPro + ", nombrePro = " + nombrePro + ", precioPro = " + precioPro
				+ ", cantidadPro = " + cantidadPro + ", Categoria = " + getCategoria().getNombreCategoria() + "]";
	}

}
