/**
 * 
 */
package com.qdishemax.sysfacturacion.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que representa la base de datos en memoria Base de datos - Estructura
 * de datos o información (estáticas o dinámicas) - Varias tablas (contenedores
 * de información de un cierto tipo) - Relaciones Tablas (Forma se articula esos
 * contenedores) - Lenguaje para consultar esa información - SQL - Operaciones
 * CRUD se realizan sobre una o varias tablas - C (Create o insertar o guardar),
 * R (Retrieve - consultar), U(Update - actualizar o modificar), D(Delete o
 * eliminar o remover)
 * 
 * @author User Maximiliano 2019
 *
 */
public class MemoriaBdd {
	/*
	 * Cuando se coloca a una variable como static solamente se crea un espacio en
	 * memoria independientemente, si crean n objetos. Ejm. Contador de pagina
	 */
	public static Usuario[] usuarios;
	/************************************************/
	// 1. Se utilizó un arreglo
	public static Categoria[] categorias;
	
	// 2. Se utilizó una colección de tipo Lista
	public static ArrayList<Producto> productos;
	public static ArrayList<Cliente> clientes;
	public static ArrayList<Factura> facturas;
	public static ArrayList<DetalleFactura> detalleFacturas;
	public static ArrayList<ModoPago> modoPagos;

	/*************************************************/
	public static int contadorCategoria = 0;
	/*
	 * Bloque static es un bloque automático que solo soporta temas static
	 */
	static {
		usuarios = new Usuario[3];
		categorias = new Categoria[6];

		clientes = new ArrayList<Cliente>();
		productos = new ArrayList<Producto>();
		facturas = new ArrayList<Factura>();
		detalleFacturas = new ArrayList<DetalleFactura>();
		modoPagos = new ArrayList<ModoPago>();

		inicializar(); // Solo se acepta métodos static
	}

	private static void inicializar() {

		usuarios[0] = new Usuario("mgonzalez", "1234", new Date());
		usuarios[1] = new Usuario("fgonzalez", "1234", new Date());
		usuarios[2] = new Usuario("agonzalez", "1234", new Date());

		categorias[0] = new Categoria(1, "Camisas", "Camisas");
		categorias[1] = new Categoria(2, "Pantalones", "Pantalones");
		categorias[2] = new Categoria(3, "Chompas", "Chompas");
		categorias[3] = new Categoria(4, "Zapatos", "Camisas");
		categorias[4] = new Categoria(5, "Goras", "Goras");
		categorias[5] = new Categoria(6, "Camisetas", "Camisetas");

	}

	/**
	 * Método para imprimir la información de la bdd, el cual marcado como static
	 * porque es un método que se utiliza con mucha frecuencia y seria desgastante
	 * en recursos instanciar un objeto para utilizar el método
	 */
	public static void imprimirInfoBdd() {
		System.out.println("MemoriaBdd V 1.0 - Maximiliano González - Curso Java");
	}

	public static void main(String[] args) {
		// 1)Se debe crear un objeto para utilizar el método
		MemoriaBdd bddDes = new MemoriaBdd();
		bddDes.imprimirInfoBdd();

		// 2)Utilizar el método directamente
		MemoriaBdd.imprimirInfoBdd();

		MemoriaBdd bddTes = new MemoriaBdd();

	}

}
