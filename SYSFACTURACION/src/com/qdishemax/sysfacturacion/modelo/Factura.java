/**
 * 
 */
package com.qdishemax.sysfacturacion.modelo;

import java.util.Date;

/**
 * Creacion de la clase Factura
 * 
 * @author christian.gonzalez Maximiliano 2019
 *
 */
public class Factura {
	
	private int idFactura;
	private Date fechaFactura;
	
	// Se asocia con un atributo (Relación 1)
	private ModoPago modoPago;
			
	// Se asocia con un atributo (Relación 1)
	private Cliente cliente;
	
	// Se asocia con un atributo (Relación 1)
		private DetalleFactura detalleFactura;


	/**
	 * @param idFactura
	 * @param fechaFactura
	 * @param modoPago
	 * @param cliente
	 * @param detalleFactura
	 */
	public Factura(int idFactura, Date fechaFactura, ModoPago modoPago, Cliente cliente,
			DetalleFactura detalleFactura) {
		super();
		this.idFactura = idFactura;
		this.fechaFactura = fechaFactura;
		this.modoPago = modoPago;
		this.cliente = cliente;
		this.detalleFactura = detalleFactura;
	}

	

	/**
	 * @return the idFactura
	 */
	public int getIdFactura() {
		return idFactura;
	}



	/**
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}



	/**
	 * @return the fechaFactura
	 */
	public Date getFechaFactura() {
		return fechaFactura;
	}



	/**
	 * @param fechaFactura the fechaFactura to set
	 */
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}



	/**
	 * @return the modoPago
	 */
	public ModoPago getModoPago() {
		return modoPago;
	}



	/**
	 * @param modoPago the modoPago to set
	 */
	public void setModoPago(ModoPago modoPago) {
		this.modoPago = modoPago;
	}



	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}



	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	/**
	 * @return the detalleFactura
	 */
	public DetalleFactura getDetalleFactura() {
		return detalleFactura;
	}



	/**
	 * @param detalleFactura the detalleFactura to set
	 */
	public void setDetalleFactura(DetalleFactura detalleFactura) {
		this.detalleFactura = detalleFactura;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFactura;
		return result;
	}

	/* (non-Javadoc)
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
		Factura other = (Factura) obj;
		if (idFactura != other.idFactura)
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fechaFactura=" + fechaFactura + ", modoPago=" + modoPago
				+ ", cliente=" + cliente + ", detalleFactura=" + detalleFactura + ", toString()=" + super.toString()
				+ "]";
	}

	
	
}