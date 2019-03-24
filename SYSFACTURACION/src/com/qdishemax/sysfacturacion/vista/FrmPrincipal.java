/**
 * 
 */
package com.qdishemax.sysfacturacion.vista;

import com.qdishemax.sysfacturacion.control.util.UtilLectura;

/**
 * Clase que representa el formulario principal
 * @author User Maximiliano
 * 2019
 *
 */
public class FrmPrincipal {
	public FrmPrincipal() {
		creaMenuPrincipal();
	}

	/**
	 *  Método para crear la pantalla principal
	 */
	private void creaMenuPrincipal() {

		int opcion = 0;
		System.out.println("\n\n****************************************");
		System.out.println("*       SYSFACTURACION  V 1.0          *");
		System.out.println("****************************************");
		System.out.println("1. CATEGORIA (TIPO PRODUCTO)");
		System.out.println("2. PRODUCTO");
		System.out.println("3. CLIENTE");
		System.out.println("4. MODO DE PAGO");
		System.out.println("5. FACTURA");
		System.out.println("6. DETALLE FACTURA");
		System.out.println("7. SALIR");
		System.out.print("... Seleccione una opción:");
		opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
		//Sentencias de Decisión - switch
		switch (opcion) { //Entero o Cadena
		case 1:
			FrmCategoria frmCatalago = new FrmCategoria();
			break;
		case 2:
			FrmProducto frmProducto = new FrmProducto();
			break;
		case 3:
			FrmCliente frmCliente = new FrmCliente();
			break;
		case 4:
			FrmModoPago frmModoPago = new FrmModoPago();
			break;
		case 5:
			FrmFactura frmFactura = new FrmFactura();
			break;
		case 6:
			FrmDetalleFactura frmDetalleFactura = new FrmDetalleFactura();
			break;
		case 7:
			System.exit(0); //Acabar el programa
		default:
			System.err.println("Opción Incorrecta!!!");
			break;
		}
		
	}


}
