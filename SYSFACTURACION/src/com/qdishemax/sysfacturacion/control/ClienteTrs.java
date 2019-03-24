/**
 * 
 */
package com.qdishemax.sysfacturacion.control;

import java.util.List;

import com.qdishemax.sysfacturacion.modelo.Cliente;
import com.qdishemax.sysfacturacion.modelo.MemoriaBdd;

/**
 * Clase que representa las operaciones de negocio para clientes
 * 
 * @author User Maximiliano
 * 2019
 *
 */
public class ClienteTrs  implements ICrudC {

	@Override
	public String guardar(Object registro) throws Exception {
		if (registro != null) {
			/*
			 * Verificar la posición del registro
			 */
			int pos = MemoriaBdd.clientes.indexOf(registro);
			if (pos >= 0) {
				return "Registro duplicado";
			} else {
				MemoriaBdd.clientes.add((Cliente) registro);
				return "Registro guardado correctamente";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public String actualizar(Object registro) throws Exception {
		if (registro != null) {
			/*
			 * Encontrar la posición basada en el objeto, no interesa el id xq viene
			 * incluido
			 */
			int pos = MemoriaBdd.clientes.lastIndexOf(registro);
			/*
			 * Si es que le encontró el valor es mayor o igual a 0 caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posición; es decir se reemplaza
				MemoriaBdd.clientes.set(pos, (Cliente) registro);
				return "Registro actualizado correctamente";
			} else {
				return "No se encontró el registro";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public String eliminar(Object registro) throws Exception {

		if (registro != null) {
			/*
			 * Encontrar la posición basada en el objeto, no interesa el id xq viene
			 * incluido
			 */
			int pos = MemoriaBdd.clientes.lastIndexOf(registro);
			/*
			 * Si es que le encontró el valor es mayor o igual a 0 caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posición; es decir se reemplaza
				MemoriaBdd.clientes.remove(pos);
				return "Registro eliminado correctamente";
			} else {
				return "No se encontró el registro";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public List<?> consultarTodos() throws Exception {
		return MemoriaBdd.clientes;
	}

	/**
	 * Método para consultar por id
	 * 
	 * @param idProEli
	 * @return
	 */
	public Cliente consultarPorId(int idProEli) throws Exception {
		Cliente proEnc = null;
		// Error provocado en base a una condición
		if (idProEli == 0) {
			// Negocio o vista
			throw new Exception("Código incorrecto!!");
		}
		try {
			for (Cliente proTmp : MemoriaBdd.clientes) {
				if (proTmp.getIdCli() == idProEli) {
					proEnc = proTmp;
				}
			}
		} catch (Exception e) {
			throw new Exception("No se puede consultar revisar la inicialización de la tabla clientes");
		}
		return proEnc;
	}

}
