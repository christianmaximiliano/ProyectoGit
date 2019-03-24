/**
 * 
 */
package com.qdishemax.sysfacturacion.control;


import java.util.List;

import com.qdishemax.sysfacturacion.modelo.MemoriaBdd;
import com.qdishemax.sysfacturacion.modelo.ModoPago;

/**
 * @author christian.gonzalez Maximiliano
 * 2019
 *
 */
public class ModoPagoTrs implements ICrudC {

	@Override
	public String guardar(Object registro) throws Exception {
		if (registro != null) {
			/*
			 * Verificar la posici�n del registro
			 */
			int pos = MemoriaBdd.modoPagos.indexOf(registro);
			if (pos >= 0) {
				return "Registro duplicado";
			} else {
				MemoriaBdd.modoPagos.add((ModoPago) registro);
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
			 * Encontrar la posici�n basada en el objeto, no interesa el id xq viene
			 * incluido
			 */
			int pos = MemoriaBdd.modoPagos.lastIndexOf(registro);
			/*
			 * Si es que le encontr� el valor es mayor o igual a 0 caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posici�n; es decir se reemplaza
				MemoriaBdd.modoPagos.set(pos, (ModoPago) registro);
				return "Registro actualizado correctamente";
			} else {
				return "No se encontr� el registro";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public String eliminar(Object registro) throws Exception {

		if (registro != null) {
			/*
			 * Encontrar la posici�n basada en el objeto, no interesa el id xq viene
			 * incluido
			 */
			int pos = MemoriaBdd.modoPagos.lastIndexOf(registro);
			/*
			 * Si es que le encontr� el valor es mayor o igual a 0 caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posici�n; es decir se reemplaza
				MemoriaBdd.modoPagos.remove(pos);
				return "Registro eliminado correctamente";
			} else {
				return "No se encontr� el registro";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public List<?> consultarTodos() throws Exception {
		return MemoriaBdd.modoPagos;
	}

	/**
	 * M�todo para consultar por id
	 * 
	 * @param idProEli
	 * @return
	 */
	public ModoPago consultarPorId(int idProEli) throws Exception {
		ModoPago proEnc = null;
		// Error provocado en base a una condici�n
		if (idProEli == 0) {
			// Negocio o vista
			throw new Exception("C�digo incorrecto!!");
		}
		try {
			for (ModoPago proTmp : MemoriaBdd.modoPagos) {
				if (proTmp.getIdModPag() == idProEli) {
					proEnc = proTmp;
				}
			}
		} catch (Exception e) {
			throw new Exception("No se puede consultar revisar la inicializaci�n de la tabla modoPagos");
		}
		return proEnc;
	}

}
