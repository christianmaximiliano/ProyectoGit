/**
 * 
 */
package com.qdishemax.sysfacturacion.vista;

import com.qdishemax.sysfacturacion.control.UsuarioTrs;
import com.qdishemax.sysfacturacion.control.util.UtilLectura;
import com.qdishemax.sysfacturacion.modelo.Usuario;



/**
 * Clase que representa el acceso al sistema
 * 
 * @author User Maximiliano
 * 2019
 *
 */
public class FrmLogin {
public static Usuario usuarioSesion;
	
	public static void main(String[] args) {
		
		System.out.println("**********************************");
		System.out.println("*       SYSFACTURACION           *");
		System.out.println("**********************************");
		System.out.println("\n");
		//1.Recuperar valores
		System.out.print("Usuario: ");
		String usuario = UtilLectura.leerDesdeTeclado();
		System.out.print("Clave: ");
		String clave = UtilLectura.leerDesdeTeclado();
		//2.Llamar a mi método de negocio, enviar la información para validación
		UsuarioTrs adminUsuario = new UsuarioTrs();
		usuarioSesion = adminUsuario.validarUsuario(usuario, clave);
		/*
		 * 3.Si el usuario es correcto se deberia ingresar a la aplicación
		 * y si no se encontró se debería emitir un mensaje de error
		 */
		if(usuarioSesion != null) {//Encontre
			FrmPrincipal frmPrincipal = new FrmPrincipal();
		}else {
			System.err.println("Usuario no encontrado!!!!");
		}
		
		
	}
	

}
