/**
 * 
 */
package com.qdishemax.sysfacturacion.vista;

import com.qdishemax.sysfacturacion.control.CategoriaTrs;
import com.qdishemax.sysfacturacion.control.util.UtilLectura;
import com.qdishemax.sysfacturacion.modelo.Categoria;
import com.qdishemax.sysfacturacion.modelo.Usuario;

/**
 * Clase que representa la Categoria (Tipo Producto)
 * 
 * @author User Maximiliano 2019
 *
 */
public class FrmCategoria {
	private Usuario usuarioSesion;

	public FrmCategoria() {
		crearMenuCategoria();
	}

	/**
	 * Método para crear el menú Categoria (tipo de producto)
	 */
	private void crearMenuCategoria() {
		int opcion = 0;
		CategoriaTrs adminCategoria = new CategoriaTrs();
		Object[] listaCategorias = null;
		String mensaje = null;
		Categoria categoria = null;
		String nombre = null;
		String descripcion = null;

		do {
			System.out.println("\n\n*******************************************");
			System.out.println("* SYSFACTURACION V 1.0 -> CATEGORIA       *");
			System.out.println("*        (TIPO PRODUCTO)                  *");
			System.out.println("*******************************************");
			System.out.println("1. Listar");
			System.out.println("2. Ingresar --> Guardar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar");
			System.out.print("... Seleccione una opción:");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			// Sentencias de Decisión - switch
			switch (opcion) { // Entero o Cadena
			case 1:
				listaCategorias = adminCategoria.listar();
				for (Object cate : listaCategorias) {
					System.out.println(cate);
				}
				break;
			case 2:
				// 1.Recuperando los valores
				System.out.println("Ingresar los datos:");
				System.out.print("Id:");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Nombre:");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.println("Descripción:");
				descripcion = UtilLectura.leerDesdeTeclado();

				// 2.Crear un registro (objeto de Categoria igual a TipoProducto)
				categoria = new Categoria();
				categoria.setIdCategoria(id);
				categoria.setNombreCategoria(nombre);
				categoria.setDescripcionCategoria(descripcion);

				// 3. Llamar al controlador (el tiene las operaciones)
				mensaje = adminCategoria.guardar(categoria);

				// 4. Procesar la información
				System.out.println(mensaje);

				break;
			case 3:
				// 1. A que registro le van a actualizar
				System.out.print("Cuál registro se debe actualizar, colocar id:");
				int idTipProAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 2.Recuperando los valores menos su id
				System.out.println("Ingresar los datos:");
				System.out.print("Nombre:");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.println("Descripción:");
				descripcion = UtilLectura.leerDesdeTeclado();

				// 3.Crear un registro para actualizar (objeto de TipoProducto)
				categoria = new Categoria();
				categoria.setIdCategoria(idTipProAct);// No cambia es el id
				categoria.setNombreCategoria(nombre);
				categoria.setDescripcionCategoria(descripcion);

				// 4. Llamar al controlador (el tiene las operaciones)
				mensaje = adminCategoria.actualizar(idTipProAct, categoria);

				// 5. Procesar la información
				System.out.println(mensaje);
				break;
			case 4:
				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");
				listaCategorias = adminCategoria.listar();
				for (Object cate : listaCategorias) {
					System.out.println(cate);
				}
				// 2.Recuperamos el identificador del tipo de producto a eliminar
				System.out.print("Ingrese el id:");
				int idCategoriaEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 3.Llamar al controlar para eliminar
				mensaje = adminCategoria.eliminar(idCategoriaEli);
				System.out.println(mensaje);
				break;
			case 5:
				FrmPrincipal frmPrincipal = new FrmPrincipal();
			default:
				System.err.println("Opción Incorrecta!!!");
				break;

			}
		} while (opcion != 5);
	}
}
