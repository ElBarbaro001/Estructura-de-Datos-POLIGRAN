package pruebas;
import javax.swing.*;

import codigo_tutor.VEDArrayList;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public VEDArbin(E pVal, VEDArbin<E> pIzq, VEDArbin<E> pDer) {
	
		
		//Arbol vacio
		VEDArbin<Integer> vacio=new VEDArbin<Integer>();

		//Rama derecha
		VEDArbin<Integer> der_der_der_der=new VEDArbin<Integer>(20,vacio,vacio);
		VEDArbin<Integer> der_der_der_izq=new VEDArbin<Integer>(17,vacio,vacio);
		VEDArbin<Integer> der_der_der=new VEDArbin<Integer>(18,der_der_der_izq,der_der_der_der);
		VEDArbin<Integer> der_der=new VEDArbin<Integer>(16,vacio,vacio);
		VEDArbin<Integer> der_izq=new VEDArbin<Integer>(12,vacio,vacio);
		VEDArbin<Integer> der=new VEDArbin<Integer>(15,der_izq,vacio);
		
		//Rama izquierda
		VEDArbin<Integer> izq_der_der_izq=new VEDArbin<Integer>(7,vacio,vacio);
		VEDArbin<Integer> izq_der_der=new VEDArbin<Integer>(8,izq_der_der_izq,vacio);
		VEDArbin<Integer> izq_der_izq=new VEDArbin<Integer>(5,vacio,vacio);
		VEDArbin<Integer> izq__der=new VEDArbin<Integer>(6,izq_der_izq,izq_der_der);
		VEDArbin<Integer> izq_izq=new VEDArbin<Integer>(1,vacio,vacio);
		VEDArbin<Integer> izq=new VEDArbin<Integer>(3,izq_izq,izq__der);
		
		//Raiz
		VEDArbin<Integer> raiz=new VEDArbin<Integer>(10,izq,der);
		
		
		VEDArrayList<Integer> lista = new VEDArrayList<Integer>();//Crear lista apartir de la clase VEDArrayList, se crea lista vacia
		lista=(VEDArrayList<Integer>) raiz.preorden();//A la lista le cargamos el arbol
		System.out.println("Imprimir Arbol en Preorden");
		System.out.println("");
		for(int i=0; i < lista.gettam(); i++) {
			  System.out.println(lista.get(i));  //Imprimimos el arbol con el metodo preorden
		  }
		
		/*
		
		System.out.println(raiz.getVal());//Se imprime el valor del nodo 1 del arbol
		System.out.println(izq.getVal());//Se imprime el valor del nodo 2 del arbol	
		System.out.println(der.getVal());//Se imprime el valor del nodo 3 del arbol	
		System.out.println(izq_izq.getVal());//Se imprime el valor del nodo 4 del arbol	
		System.out.println(izq__der.getVal());//Se imprime el valor del nodo 5 del arbol	
		System.out.println(izq_der_izq.getVal());//Se imprime el valor del nodo 6 del arbol
		System.out.println(izq_der_der.getVal());//Se imprime el valor del nodo 7 del arbol
		System.out.println(izq_der_der_izq.getVal());//Se imprime el valor del nodo 8 del arbol
		System.out.println(der_izq.getVal());//Se imprime el valor del nodo 9 del arbol
		System.out.println(der_der.getVal());//Se imprime el valor del nodo 10 del arbol
		System.out.println(der_der_der.getVal());//Se imprime el valor del nodo 11 del arbol
		System.out.println(der_der_der_izq.getVal());//Se imprime el valor del nodo 12 del arbol
		System.out.println(der_der_der_der.getVal());//Se imprime el valor del nodo 13 del arbol
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
    	//Se le asigna nombre y valor a cada variable que corresponden a un NODO del arbol
    	VEDArbin<Integer> raiz=new VEDArbin<Integer>();
		raiz.agregar(10);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izq=new VEDArbin<Integer>();
		izq.agregar(3);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> der=new VEDArbin<Integer> ();
		der.agregar(15);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqhijo1=new VEDArbin<Integer> ();
		izqhijo1.agregar(1);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqhijo2=new VEDArbin<Integer>();
		izqhijo2.agregar(6);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqnieto1=new VEDArbin<Integer>();
		izqnieto1.agregar(5);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqnieto2=new VEDArbin<Integer>();
		izqnieto2.agregar(8);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqbisnieto1=new VEDArbin<Integer>();
		izqbisnieto1.agregar(7);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> derhijo1=new VEDArbin<Integer>();
		derhijo1.agregar(12);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> derhijo2=new VEDArbin<Integer>();
		derhijo2.agregar(16);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> dernieto1=new VEDArbin<Integer>();
		dernieto1.agregar(18);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> derbisnieto1=new VEDArbin<Integer>();
		derbisnieto1.agregar(17);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> derbisnieto2=new VEDArbin<Integer>();
		derbisnieto2.agregar(20);//Se invoca el método agregar para asignarle un valor entero al nodo
		*/
		/*
		
		//Crear copia de la clase VEDArrayList en la variable lista
		VEDArrayList<Integer> lista = new VEDArrayList<Integer>();//Crear lista apartir de la clase VEDArrayList, se crea lista vacia
		lista=(VEDArrayList<String>) raiz.preorden();//A la lista le cargamos el arbol
*/
		
		
		
		
		
	
	
		
		

	
		/*
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nodo que desea buscar"));//Se crea la variable para preguntar un numero y buscarlo dentro del arbol
		VEDArbin<Integer> buscar=new VEDArbin<Integer>();//Se crea una copia de la clase VEDArbin vacia
		System.out.println(buscar.Buscar(derbisnieto2, numero));//Se invoca el método buscar con el numero ingresado por el usuario a traves de la pantalla con el fin de saber si este numero se encuentra o no en el arbol, el resultado es true en caso que sí se encuentre y false si no se encuentra el numero en el arbol
		
		System.out.println("El peso de la raiz es:"+raiz.peso());//Se invoca el método peso para obtener el peso del nodo raiz del arbol
		System.out.println("El peso de los hijos de la raiz es:"+(izq.peso()+der.peso()));//Se invoca el método peso para obtener el peso del segundo nivel del arbol
		System.out.println("El peso de los nietos de la raiz es:"+(izqhijo1.peso()+izqhijo2.peso()+derhijo1.peso()+derhijo2.peso()));//Se invoca el método peso para obtener el peso del tercer nivel del arbol
		System.out.println("El peso de los bisnietos de la raiz es:"+(izqnieto1.peso()+izqnieto2.peso()+dernieto1.peso()));//Se invoca el método peso para obtener el peso del cuarto nivel del arbol
		System.out.println("El peso de los tataranietos de la raiz es:"+(izqbisnieto1.peso()+derbisnieto1.peso()+derbisnieto2.peso())); //Se invoca el método peso para obtener el peso del quinto nivel del arbol
		System.out.println("El peso total del arbol es:"+(raiz.peso()+izq.peso()+der.peso()+izqhijo1.peso()+izqhijo2.peso()+derhijo1.peso()+derhijo2.peso()+izqnieto1.peso()+izqnieto2.peso()+dernieto1.peso()+izqbisnieto1.peso()+derbisnieto1.peso()+derbisnieto2.peso()));//Se invoca el método peso para obtener el peso del sexto nivel del arbol
		System.out.println("La altura hacia la derecha del arbol es:"+(raiz.altura()+izq.altura()+izqhijo1.altura()+izqhijo2.altura()+izqnieto1.altura()+izqnieto2.altura()+izqbisnieto1.altura()));//Se invoca el método altura para obtener la altura del hacia el lado derecho del arbol
		System.out.println("La altura hacia la izquierda del arbol es:"+(raiz.altura()+der.altura()+derhijo1.altura()+derhijo2.altura()+dernieto1.altura()+derbisnieto1.altura()+derbisnieto2.altura()));//Se invoca el método altura para obtener la altura del hacia el lado izquierdo del arbol
		System.out.println("El recorrido del arbol en preorden es: <"+raiz.preorden()+izq.preorden()+izqhijo1.preorden()+izqhijo2.preorden()+izqnieto1.preorden()+izqnieto2.preorden()+izqbisnieto1.preorden()+der.preorden()+derhijo1.preorden()+derhijo2.preorden()+dernieto1.preorden()+derbisnieto1.preorden()+derbisnieto2.preorden()+">");//Se invoca el metodo preorden para obtener los nodos del arbol en preorden
		System.out.println("El recorrido del arbol en inorden es: <"+izqhijo1.inorden(izqhijo1)+izq.inorden(izq)+izqnieto1.inorden(izqnieto1)+izqhijo2.inorden(izqhijo2)+izqbisnieto1.inorden(izqbisnieto1)+izqnieto2.inorden(izqnieto2)+raiz.inorden(raiz)+derhijo1.inorden(derhijo1)+der.inorden(der)+derhijo2.inorden(derhijo2)+derbisnieto1.inorden(derbisnieto1)+dernieto1.inorden(dernieto1)+derbisnieto2.inorden(derbisnieto2)+">");//Se invoca el metodo preorden para obtener los nodos del arbol en inorden
		System.out.println("El recorrido del arbol en postorden es:<"+izqhijo1.postorden()+izqnieto1.postorden()+izqbisnieto1.postorden()+izqnieto2.postorden()+izqhijo2.postorden()+izq.postorden()+derhijo1.postorden()+derbisnieto1.postorden()+derbisnieto2.postorden()+dernieto1.postorden()+derhijo2.postorden()+der.postorden()+raiz.postorden()+">");//Se invoca el metodo preorden para obtener los nodos del arbol en postorden
		*/

	}

}
