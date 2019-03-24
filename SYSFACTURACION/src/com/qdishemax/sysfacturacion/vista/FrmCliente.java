/**
 * 
 */
package com.qdishemax.sysfacturacion.vista;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.qdishemax.sysfacturacion.control.ClienteTrs;
import com.qdishemax.sysfacturacion.control.util.UtilLectura;
import com.qdishemax.sysfacturacion.modelo.Factura;
import com.qdishemax.sysfacturacion.modelo.Cliente;
import com.qdishemax.sysfacturacion.modelo.Usuario;

/**
 * Clase que representa la Patalla del cliente
 * 
 * @author User Maximiliano 2019
 *
 */
public class FrmCliente {
	private Usuario usuarioSesion;

	public FrmCliente() {
		crearMenuCliente();
	}

	/**
	 * Método para crear el menú Cliente
	 */
	private void crearMenuCliente() {

		int opcion = 0;
		ClienteTrs adminPro = new ClienteTrs();
		String mensaje = null;
		Cliente cliente = null;
		String nombre = null;
		String apellido = null;
		String identificacion = null;
		String fechaNac = null;
		String direccion = null;
		String telefono = null;
		String correo = null;
		BigDecimal cuotaVenCli = null;

		do {
			System.out.println("\n\n***********************************");
			System.out.println("* SYSFACTURACION V 1.0 -> CLIENTE *");
			System.out.println("***********************************");
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
					for (Object tipPro : adminPro.consultarTodos()) {
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
				try {
					System.out.print("Id:");
					id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("Nombre:");
					nombre = UtilLectura.leerDesdeTeclado();
					System.out.print("Apellido:");
					apellido = UtilLectura.leerDesdeTeclado();
					System.out.print("Identificacion:");
					identificacion = UtilLectura.leerDesdeTeclado();

					System.out.print("Fecha Nacimiento:");
					// SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					fechaNac = UtilLectura.leerDesdeTeclado();
					// String fechaNacimiento= formato.format(fechaNac);

					System.out.print("Dirección:");
					direccion = UtilLectura.leerDesdeTeclado();
					System.out.print("Telefono:");
					telefono = UtilLectura.leerDesdeTeclado();
					System.out.print("Correo:");
					correo = UtilLectura.leerDesdeTeclado();
					System.out.print("CuotaVenCli:");
					cuotaVenCli = new BigDecimal(UtilLectura.leerDesdeTeclado());

					// 2.Crear un registro (objeto de cliente)
					cliente = new Cliente(nombre, apellido, identificacion, fechaNac, direccion, telefono, correo, id,
							cuotaVenCli);

					// 3. Llamar al controlador (el tiene las operaciones)
					try {
						mensaje = adminPro.guardar(cliente);
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
					System.out.print("Apellido:");
					apellido = UtilLectura.leerDesdeTeclado();
					System.out.print("Identificacion:");
					identificacion = UtilLectura.leerDesdeTeclado();
					System.out.print("Fecha Nacimiento:");
					fechaNac = UtilLectura.leerDesdeTeclado();
					System.out.print("Dirección:");
					direccion = UtilLectura.leerDesdeTeclado();
					System.out.print("Telefono:");
					telefono = UtilLectura.leerDesdeTeclado();
					System.out.print("Correo:");
					correo = UtilLectura.leerDesdeTeclado();
					System.out.print("cuotaVenCli:");
					cuotaVenCli = new BigDecimal(UtilLectura.leerDesdeTeclado());

					// 3.Crear un registro para actualizar (objeto de cliente)
					cliente = new Cliente(nombre, apellido, identificacion, fechaNac, direccion, telefono, correo,
							idPro, cuotaVenCli);

					// 4. Llamar al controlador (el tiene las operaciones)
					try {
						mensaje = adminPro.actualizar(cliente);
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
				// 2.Recuperamos el identificador del tipo de cliente a eliminar
				System.out.print("Ingrese el id:");
				int idProEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				try {
					Cliente proEli = adminPro.consultarPorId(idProEli);

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
