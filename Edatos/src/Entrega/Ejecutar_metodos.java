package Entrega;

import javax.swing.JOptionPane;

public class Ejecutar_metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear copia de la clase VEDArbin en la variable vacio
		VEDArbin<Integer> vacio = new VEDArbin<Integer>();
		
		
		
		
		//Crear copia de la clase VEDArrayList en la variable lista
		VEDArrayList<Integer> lista = new VEDArrayList<Integer>();//Crear lista apartir de la clase VEDArrayList, se crea lista vacia
		lista=raiz.preorden();//A la lista le cargamos el arbol
		System.out.println("Imprimir Arbol en Preorden");
		System.out.println("");
		for(int i=0; i < lista.gettam(); i++) {
			  System.out.println(lista.get(i));  //Imprimimos el arbol con el metodo preorden
		  }
		
		lista=raiz.inorden();//A la lista le cargamos el arbol con el metodo inorden
		System.out.println("");
		System.out.println("Imprimir Arbol en Inorden");
		System.out.println("");
		for(int i=0; i < lista.gettam(); i++) {
			  System.out.println(lista.get(i));  //Imprimimos el arbol con el metodo preorden
		  }
		
		lista=raiz.postorden();//A la lista le cargamos el arbol con el metodo inorden
		System.out.println("");
		System.out.println("Imprimir Arbol en Postorden");
		System.out.println("");
		for(int i=0; i < lista.gettam(); i++) {
			  System.out.println(lista.get(i));  //Imprimimos el arbol con el metodo preorden
		  }
		
		lista=raiz.niveles();//A la lista le cargamos el arbol con el metodo inorden
		System.out.println("");
		System.out.println("Imprimir Arbol en Niveles");
		System.out.println("");
		for(int i=0; i < lista.gettam(); i++) {
			  System.out.println(lista.get(i));  //Imprimimos el arbol con el metodo preorden
		  }
		
		VEDArrayList<Integer> listae = new VEDArrayList<Integer>();
		int buscar_numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor a buscar: "));
		VEDArbin<Integer> buscar = new VEDArbin<Integer>();//Creamos una copia de la clase VEDArbin
		System.out.println(buscar.Buscar(raiz, buscar_numero));
		
		
		
		
		
		
		
		
	}
}