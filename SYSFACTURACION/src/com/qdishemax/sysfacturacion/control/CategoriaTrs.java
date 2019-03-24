/**
 * 
 */
package com.qdishemax.sysfacturacion.control;

import com.qdishemax.sysfacturacion.modelo.MemoriaBdd;
import com.qdishemax.sysfacturacion.modelo.Categoria;;

/**
 * Clase que tendrá las operaciones de negocio relacionadas con Categoria (tipo de producto)
 * 
 * @author User Maximiliano
 * 2019
 *
 */
public class CategoriaTrs implements ICrud {


	@Override
	public String guardar(Object registro) {
		boolean banIng = false;
		if (registro != null) {
			for (int i = 0; i < MemoriaBdd.categorias.length; i++) {
				if (MemoriaBdd.categorias[i] == null) {
					MemoriaBdd.categorias[i] = (Categoria) registro;
					banIng = true;
					break;
				}
			}
			if (banIng) {
				return "Tipo Producto guardado correctamente";
			} else {
				return "El tamaño máximo permitido es de 5 tipos de productos para la versión demo";
			}
		} else {
			return "Debe llenar todos los datos!!!";
		}

	}

	@Override
	public String actualizar(int id, Object registro) {
		/*****************************************************
		 * BLOQUE PARA BUSCAR
		 *******************************************************/
		int posEnc = 0;
		boolean banEnc = false;
		for (Categoria tipPro : MemoriaBdd.categorias) {
			if (tipPro != null && tipPro.getIdCategoria() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}
		/************************************************************/

		if (banEnc) {
			MemoriaBdd.categorias[posEnc] = (Categoria) registro;
			return "Registro actualizado correctamente";
		} else {
			return "No se encontró registro";
		}
	}

	@Override
	public String eliminar(int id) {
		int posEnc = 0;
		boolean banEnc = false;
		for (Categoria tipPro : MemoriaBdd.categorias) {
			if (tipPro != null && tipPro.getIdCategoria() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}

		if (banEnc) {
			MemoriaBdd.categorias[posEnc] = null;
			return "Registro eliminado correctamente";
		} else {
			return "No se encontró registro";
		}
	}

	@Override
	public Object[] listar() {
		return MemoriaBdd.categorias;
	}

	@Override
	public Object consultarPorId(int id) {
		Categoria tipProEnc = null;
		for (int i = 0; i < MemoriaBdd.categorias.length; i++) {
			if (MemoriaBdd.categorias[i].getIdCategoria() == id) {
				tipProEnc = MemoriaBdd.categorias[i];
				break;
			}
		}
		return tipProEnc;
	}

	/**
	 * Método para imprimir los tipos de productos
	 * 
	 * @return
	 */
	public String imprimirListaFormateada() {
		StringBuilder tipoProLis = new StringBuilder();
		for (Categoria tipProTmp : MemoriaBdd.categorias) {
			if (tipProTmp != null) {
				tipoProLis.append(tipProTmp.getIdCategoria()).append("-").append(tipProTmp.getNombreCategoria())
						.append(" || ");
			}
		}
		return tipoProLis.toString();
	}

}
