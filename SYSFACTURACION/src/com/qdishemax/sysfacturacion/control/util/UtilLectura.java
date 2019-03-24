/**
 * 
 */
package com.qdishemax.sysfacturacion.control.util;

import java.util.Scanner;

/**
 * Clase que contendrá las operaciones utilitarias de lectura
 * @author User Maximiliano
 * 2019
 *
 */
public class UtilLectura {
	/**
	 * Método para leer desde el teclado
	 * @return
	 */
	public static String leerDesdeTeclado() {
		String valorALeer = null;
		//Construyendo un lector que lee desde la entrada estándar
		Scanner lector = new Scanner(System.in);
		//Leyendo el valor ingresado en formato cadena
		valorALeer = lector.next();
		//TODO Cerrar el lector
		//lector.close();
		return valorALeer;
	}
}
