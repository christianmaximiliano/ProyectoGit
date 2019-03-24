/**
 * 
 */
package com.qdishemax.sysfacturacion.control;

/**
 * Tipo de clase que representa el contrato de negocio para las operaciones de la bdd
 * @author User Maximiliano
 * 2019
 *
 */
public interface ICrud {
	public String guardar(Object registro);
	
	public String actualizar(int id, Object registro);
	
	public String eliminar(int id);
	
	public Object[] listar();
	
	public Object consultarPorId(int id) throws Exception;
}
