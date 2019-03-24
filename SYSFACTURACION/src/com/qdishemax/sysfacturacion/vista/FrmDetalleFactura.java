/**
 * 
 */
package com.qdishemax.sysfacturacion.vista;

import java.math.BigDecimal;
import java.util.Date;

import com.qdishemax.sysfacturacion.control.ProductoTrs;
import com.qdishemax.sysfacturacion.control.FacturaTrs;
import com.qdishemax.sysfacturacion.control.util.UtilLectura;
import com.qdishemax.sysfacturacion.modelo.DetalleFactura;
import com.qdishemax.sysfacturacion.modelo.Factura;
import com.qdishemax.sysfacturacion.modelo.Producto;

/**
 * @author christian.gonzalez Maximiliano
 * 2019
 *
 */
public class FrmDetalleFactura {
	public FrmDetalleFactura() {
		crearMenuDetalleFactura();
	}

	/**
	 * Método para crear el menú de factura
	 */
	private void crearMenuDetalleFactura() {
		int opcion = 0;
		FacturaTrs adminFac = new FacturaTrs();
		ProductoTrs adminProducto = new ProductoTrs();
		
		String mensaje = null;

		DetalleFactura detalleFactura = null;
				
		int cantidadDetFac = 0;
		BigDecimal total = null;
		
		
		int idPro = 0;
		int idFactura = 0;

		do {
			System.out.println("\n\n*********************************************");
			System.out.println("* E-COMMERCE V 1.0 -> DETALLE FACTURA       *");
			System.out.println("*********************************************");
			System.out.println("1. Listar");
			System.out.println("2. Ingresar - y - Guardar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar");
			System.out.print("... Seleccione una opción:");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			switch (opcion) {
			case 1:
				try {
					/*
					 * En el bloque try va todo el bloque de código que puede ocasionar error, solo
					 * existe un solo bloque try
					 */
					for (Object tipPro : adminFac.consultarTodos()) {
						System.out.println(tipPro);
					}
				} catch (Exception e) {
					/*
					 * Se puede tener más de un bloque catch y sirve para controlar el error.
					 */
					// Solo ocuparse en desarrollo, imprime la pila de error
					// e.printStackTrace();
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				// 1.Recuperando los valores
				System.out.println("Ingresar los datos:");
				int id = 0;
				
				Factura factura = null;
				Producto producto = null;

				try {
					System.out.print("Id: ");
					id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("cantidad: ");
					cantidadDetFac = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("total: ");
					total = new BigDecimal(UtilLectura.leerDesdeTeclado());
					
					/******************************************************
					 * Bloque para relacionar el objeto
					 ********************************************************/
					System.out.print("Factura:");
					System.out.println(adminFac.consultarTodos());
					System.out.print("Ingreso la Factura:");
					idFactura = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					factura = (Factura) adminFac.consultarPorId(idFactura);
					System.out.print("Producto:");
					System.out.println(adminProducto.consultarTodos());
					System.out.print("Ingreso el Producto:");
					idPro = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					producto = (Producto) adminProducto.consultarPorId(idPro);
					/*******************************************************************************/
					
					// 2.Crear un registro (objeto de DetalleFactura)
					detalleFactura = new DetalleFactura(idFactura, cantidadDetFac, total, factura, producto);
					
					
					// 3. Llamar al controlador (el tiene las operaciones)
					try {
						mensaje = adminFac.guardar(factura);
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
				int idDetFAc = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				try {
					// 2.Recuperando los valores menos su id
					System.out.print("cantidad: ");
					cantidadDetFac = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("total: ");
					total = new BigDecimal(UtilLectura.leerDesdeTeclado());
					
					/******************************************************
					 * Bloque para relacionar el objeto
					 ********************************************************/
					System.out.print("Factura:");
					System.out.println(adminFac.consultarTodos());
					System.out.print("Ingreso la Factura:");
					idFactura = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					factura = (Factura) adminFac.consultarPorId(idFactura);
					System.out.print("Producto:");
					System.out.println(adminProducto.consultarTodos());
					System.out.print("Ingreso el Producto:");
					idPro = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					producto = (Producto) adminProducto.consultarPorId(idPro);
					/*******************************************************************************/

					// 3.Crear un registro para actualizar (objeto de ModoPago)
					detalleFactura = new DetalleFactura(idFactura, cantidadDetFac, total, factura, producto);

					// 4. Llamar al controlador (el tiene las operaciones)
					try {
						mensaje = adminFac.actualizar(factura);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					// 5. Procesar la información
					System.out.println(mensaje);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 4:
				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");
				try {
					for (Object pro : adminFac.consultarTodos()) {
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
				// 2.Recuperamos el identificador del tipo de factura a eliminar
				System.out.print("Ingrese el id:");
				int idProEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				try {
					Factura proEli = adminFac.consultarPorId(idProEli);

					// 3.Llamar al controlar para eliminar
					mensaje = adminFac.eliminar(proEli);
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
