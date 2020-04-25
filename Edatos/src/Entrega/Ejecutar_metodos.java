package Entrega;

import javax.swing.JOptionPane;

public class Ejecutar_metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear copia de la clase VEDArbin en la variable vacio
		VEDArbin<Integer> vacio = new VEDArbin<Integer>();
		//Rama derecha sub arbol derecha
		VEDArbin<Integer> rama_der_der = new VEDArbin<Integer>(24,vacio,vacio);
		//Rama derecha sub arbol izquierdo
		VEDArbin<Integer> rama_der_izq_izq = new VEDArbin<Integer>(17,vacio,vacio);
		VEDArbin<Integer> rama_der_izq = new VEDArbin<Integer>(18,rama_der_izq_izq,vacio);
		//Subarbol derecho
		VEDArbin<Integer> rama_der = new VEDArbin<Integer>(20,rama_der_izq,rama_der_der);
		//Rama derecha sub arbol izquierdo
		VEDArbin<Integer> rama_izq_der_der = new VEDArbin<Integer>(12,vacio,vacio);
		VEDArbin<Integer> rama_izq_der_izq = new VEDArbin<Integer>(7,vacio,vacio);
		VEDArbin<Integer> rama_izq_der = new VEDArbin<Integer>(9,rama_izq_der_izq,rama_izq_der_der);
		//Rama izquierdo sub arbol izquierdo
		VEDArbin<Integer> rama_izq_izq_der = new VEDArbin<Integer>(4,vacio,vacio);
		VEDArbin<Integer> rama_izq_izq_izq = new VEDArbin<Integer>(1,vacio,vacio);
		VEDArbin<Integer> rama_izq_izq = new VEDArbin<Integer>(3,rama_izq_izq_izq,rama_izq_izq_der);
		//Subarbol izquierdo
		VEDArbin<Integer> rama_izq = new VEDArbin<Integer>(6,rama_izq_izq,rama_izq_der);
		//Raiz del Arbol
		VEDArbin<Integer> raiz= new VEDArbin<Integer>(15,rama_izq,rama_der);
       
		
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