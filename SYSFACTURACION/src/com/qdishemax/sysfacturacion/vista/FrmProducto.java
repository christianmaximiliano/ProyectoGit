/**
 * 
 */
package com.qdishemax.sysfacturacion.vista;

import java.math.BigDecimal;

import com.qdishemax.sysfacturacion.control.CategoriaTrs;
import com.qdishemax.sysfacturacion.control.ProductoTrs;
import com.qdishemax.sysfacturacion.control.util.UtilLectura;
//import com.qdishemax.sysfacturacion.control.util.UtilValidaNumero;
import com.qdishemax.sysfacturacion.modelo.Categoria;
import com.qdishemax.sysfacturacion.modelo.Producto;
import com.qdishemax.sysfacturacion.modelo.Usuario;

/**
 * @author User Maximiliano
 * 2019
 *
 */
public class FrmProducto {
	private Usuario usuarioSesion;

	public FrmProducto() {
		crearMenuProducto();
	}

	/**
	 * Método para crear el menú tipo de producto
	 */
	private void crearMenuProducto() {
		int opcion = 0;
		ProductoTrs adminPro = new ProductoTrs();
		CategoriaTrs adminTiPro = new CategoriaTrs();
		Object[] listaProductos = null;
		String mensaje = null;
		Producto producto = null;
		String nombre = null;
		String descripcion = null;
		BigDecimal precio = null;
		
		int cantidad = 0;
		
		do {
			System.out.println("\n\n**************************************");
			System.out.println("* SYSFACTURACION V 1.0 -> PRODUCTO *");
			System.out.println("************************************");
			System.out.println("1. Listar");
			System.out.println("2. Ingresar - y - Guardar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar");
			System.out.print("... Seleccione una opción:");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
//			opcion = UtilValidaNumero.leerDesdeTecladoValidaNumero();
			// Sentencias de Decisión - switch
			switch (opcion) { // Entero o Cadena
			case 1:

				
				try {
					for (Object tipPro : adminPro.consultarTodos()) {
						System.out.println(tipPro);
					}
				} catch (Exception e) {
					/*
					 * Se puede tener más de un bloque catch y sirve para controlar el error.
					 */
					// Solo ocuparse en desarrollo, imprime la pila de error e.printStackTrace();
					//e.printStackTrace();
					System.err.println(e.getMessage());
				}
				break;
				
			case 2:
			
				
				// 1.Recuperando los valores
				System.out.println("Ingresar los datos:");
				
				int id = 0;
				Categoria categoria = null;
				
				
				try {
					System.out.print("Id:");
					id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("Nombre:");
					nombre = UtilLectura.leerDesdeTeclado();
					System.out.println("Descripción:");
					descripcion = UtilLectura.leerDesdeTeclado();
					System.out.println("Precio:");
					precio = new BigDecimal(UtilLectura.leerDesdeTeclado());
					System.out.print("Cantidad:");
					cantidad = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					/******************************************************
					 * Bloque para relacionar el objeto
					 ********************************************************/
					System.out.print("Categoria Tipos de productos:");
					System.out.println(adminTiPro.imprimirListaFormateada());
					System.out.print("Ingreso de categoria de producto:");
					int idCategoria = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					categoria = (Categoria) adminTiPro.consultarPorId(idCategoria);
					/*******************************************************************************/
					
					// 2.Crear un registro (objeto de Categoria (TipoProducto))
					producto = new Producto(id, nombre, precio, cantidad, categoria);

					// 3. Llamar al controlador (el tiene las operaciones)
					try {
						mensaje = adminPro.guardar(producto);

						// 4. Procesar la información
						System.out.println(mensaje);
					} catch (Exception e) {
						System.err.println("Error al guardar:" + e.getMessage());
					}
				} catch (NumberFormatException e1) {
					System.err.println("Datos númericos incorrectos!!!");
				} catch (Exception e1) {
					System.err.println(e1.getMessage());
				}

				break;
				
			case 3:
				
				// 1. A que registro le van a actualizar
				System.out.print("Cuál registro se debe actualizar, colocar id:");
				int idPro = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				try {
					// 2.Recuperando los valores menos su id
					System.out.println("Ingresar los datos:");
					System.out.print("Nombre:");
					nombre = UtilLectura.leerDesdeTeclado();
					System.out.println("Descripción:");
					descripcion = UtilLectura.leerDesdeTeclado();
					System.out.println("Precio:");
					precio = new BigDecimal(UtilLectura.leerDesdeTeclado());
					System.out.print("Cantidad:");
					cantidad = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					
					/******************************************************
					 * Bloque para relacionar el objeto
					 ********************************************************/
					System.out.print("Categoria Tipos de productos:");
					System.out.println(adminTiPro.imprimirListaFormateada());
					System.out.print("Ingreso de categoria de producto:");
					int idCategoria = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					categoria = (Categoria) adminTiPro.consultarPorId(idCategoria);
					/*******************************************************************************/

					// 3.Crear un registro para actualizar (objeto de TipoProducto)
					producto = new Producto(idPro, nombre, precio, cantidad, categoria);

					// 4. Llamar al controlador (el tiene las operaciones)
					try {
						mensaje = adminPro.actualizar(producto);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					// 5. Procesar la información
					System.out.println(mensaje);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
				
				
			case 4:


				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");
				try {
					for (Object pro : adminPro.consultarTodos()) {
						System.out.println(pro);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					/*
					 * Existe o no existe error siempre se ejecuta, se puede utilizar para
					 * auditoria, logs, cierre de conexiones envio de alertas
					 */
				}
				// 2.Recuperamos el identificador del tipo de producto a eliminar
				System.out.print("Ingrese el id:");
				int idProEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				try {
					Producto proEli = adminPro.consultarPorId(idProEli);

					// 3.Llamar al controlar para eliminar
					mensaje = adminPro.eliminar(proEli);
				} catch (Exception e) {
					System.err.println("Eror al consultor código:" + e.getMessage());
				}
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
