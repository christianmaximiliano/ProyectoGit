/**
 * 
 */
package com.qdishemax.sysfacturacion.modelo;

import java.util.List;

/**
 * Clase que representa la tabla de Categoria (TipoProducto)
 * 
 * @author User Maximiliano
 * 2019
 *
 */
public class Categoria {
	private int idCategoria;
	private String nombreCategoria;
	private String descripcionCategoria;
	// Relación de Muchos - N  (Producto N -> 1 Categoria)
	private List<Producto> productos;

	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @param idCategoria
	 * @param nombreCategoria
	 * @param descripcionCategoria
	 */
	public Categoria(int idCategoria, String nombreCategoria, String descripcionCategoria) {
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
		this.descripcionCategoria = descripcionCategoria;
	}



	/**
	 * @return the idCategoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}


	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}


	/**
	 * @return the nombreCategoria
	 */
	public String getNombreCategoria() {
		return nombreCategoria;
	}


	/**
	 * @param nombreCategoria the nombreCategoria to set
	 */
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}


	/**
	 * @return the descripcionCategoria
	 */
	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}


	/**
	 * @param descripcionCategoria the descripcionCategoria to set
	 */
	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}


	
	
	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}


	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categoria [idCategoria = " + idCategoria + ", nombreCategoria = "
				+ nombreCategoria + ", descripcionCategoria = "
				+ descripcionCategoria + "]";
	}
	
	

}
