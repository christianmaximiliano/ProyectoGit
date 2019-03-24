/**
 * 
 */
package com.qdishemax.sysfacturacion.control;

import java.util.Iterator;
import java.util.List;

import com.qdishemax.sysfacturacion.modelo.MemoriaBdd;
import com.qdishemax.sysfacturacion.modelo.Producto;

/**
 * @author User Maximiliano
 * 2019
 *
 */
public class ProductoTrs implements ICrudC {

	@Override
	public String guardar(Object registro) {
		
		if (registro != null) {
			/*
			 * Verificar la posición del registro
			 */
			int pos = MemoriaBdd.productos.indexOf(registro);
			if (pos >= 0) {
				return "Registro duplicado";
			} else {
				MemoriaBdd.productos.add((Producto) registro);
				return "Registro guardado correctamente";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public String actualizar(Object registro)  throws Exception{
		if (registro != null) {
			/*
			 * Encontrar la posición basada en el objeto, no interesa el id xq viene
			 * incluido
			 */
			int pos = MemoriaBdd.productos.lastIndexOf(registro);
			/*
			 * Si es que le encontró el valor es mayor o igual a 0 caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posición; es decir se reemplaza
				MemoriaBdd.productos.set(pos, (Producto) registro);
				return "Registro actualizado correctamente";
			} else {
				return "No se encontró el registro";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public String eliminar(Object registro) {

		if (registro != null) {
			/*
			 * Encontrar la posición basada en el objeto, no interesa el id xq viene
			 * incluido
			 */
			int pos = MemoriaBdd.productos.lastIndexOf(registro);
			/*
			 * Si es que le encontró el valor es mayor o igual a 0 caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posición; es decir se reemplaza
				MemoriaBdd.productos.remove(pos);
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
		return MemoriaBdd.productos;
	}

	/**
	 * Método para consultar por id
	 * @param idProEli
	 * @return
	 */
	public Producto consultarPorId(int idProEli)  throws Exception {
		Producto proEnc = null;
		// Error provocado en base a una condición
		if (idProEli == 0) {
			// Negocio o vista
			throw new Exception("Código incorrecto!!");
		}
		try {
			for (Producto proTmp : MemoriaBdd.productos) {
				if (proTmp.getIdPro() == idProEli) {
					proEnc = proTmp;
				}
			}
		} catch (Exception e) {
			throw new Exception("No se puede consultar revisar la inicialización de la tabla productos");
		}
		return proEnc;
	}

}
