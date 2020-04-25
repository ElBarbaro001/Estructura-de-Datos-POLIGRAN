package codigo_tutor;
import javax.swing.*;
public class ppal {

	
	static ArrayList<Object> lista = new ArrayList<Object>();//Crear clase lista para buscar dato dentro de ella
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		VEDArbin<Integer> vacio = new VEDArbin<Integer> ();//declarar nueva variable con los metodos de la clase constructora
		VEDArbin<Integer> raiz = new VEDArbin<Integer> ("10",vacio,vacio);//Raiz
		VEDArbin<Integer> derecho = new VEDArbin<Integer> ();//Derecho
		VEDArbin<Integer> izquierdo = new VEDArbin<Integer> ();//Izquierdo
		 /*
		  * 
		  */
		
		/*
		VEDArbin<Integer> vacio = new VEDArbin<Integer>();
		
		
		//protected E val;// Se crear nodo
		//protected VEDArbin<E> der;//Se acopla arbol o nodo al lado derecho
		//protected VEDArbin<E> izq;//Se acopla arbol o nodo al lado izquierdo
		
		//public VEDArbin(E pVal, VEDArbin<E> pIzq,VEDArbin<E> pDer) 
		
		//Estamos haciendo el ejercicio (b) de la entrega
		
		VEDArbin<Integer> nodo_raiz = new VEDArbin<Integer>(34,vacio,vacio);//Nodo1
		VEDArbin<Integer> hijo_izq = new VEDArbin<Integer>(80,nodo_raiz,vacio);//Nodo2
		VEDArbin<Integer> hijo_der = new VEDArbin<Integer>(21,vacio,nodo_raiz);//Nodo3
		//Crear los hijos del nodo 80
		VEDArbin<Integer> hijo_izq_izq = new VEDArbin<Integer>(13,vacio,hijo_izq);//Nodo4 hijo del nodo 80
		VEDArbin<Integer> hijo_izq_der = new VEDArbin<Integer>(2,hijo_izq,vacio);//Nodo5 hijo del nodo 80
		//Crear hijo del nodo 2
		VEDArbin<Integer> hijo_izq_der_der = new VEDArbin<Integer>(6,hijo_izq_der,vacio);//Nodo6 hijo del nodo 2
		//Crear hijo del nodo 3
        VEDArbin<Integer> hijo_der_izq = new VEDArbin<Integer>(44,vacio,hijo_der);//nodo7 hijo del nodo 3
        VEDArbin<Integer> hijo_der_der = new VEDArbin<Integer>(90,hijo_der,vacio);//nodo8 hijo del nodo 3
        //Crear hijo del nodo 8
        VEDArbin<Integer> hijo_der_der_izq = new VEDArbin<Integer>(28,vacio,hijo_der_der);//nodo8 hijo del nodo 3
        VEDArbin<Integer> hijo_der_der_der = new VEDArbin<Integer>(55,hijo_der_der,vacio);//nodo9 hijo del nodo 3
 
        VEDArrayList<Integer> lista = new VEDArrayList<Integer>();//Crear lista apartir de la clase VEDArrayList, se crea lista vacia
        lista=hijo_der_der_izq.preorden();
        
        for(int i=0;i<lista.gettam();i++) {
        	System.out.println("Posicion ["+i+"]"+ lista.get(i));
        }//Imprimir la lista
        System.out.println("");
        lista=hijo_der_der_izq.postorden();
        for(int i=0;i<lista.gettam();i++) {
        	System.out.println("Posicion ["+i+"]"+ lista.get(i));
        }//Imprimir la lista
        */
		VEDArbin<Integer> vacio = new VEDArbin<Integer>();
        VEDArbin<Integer> hijo_der_der_izq = new VEDArbin<Integer>(28,vacio,vacio);
        VEDArbin<Integer> hijo_der_der_der = new VEDArbin<Integer>(55,vacio,vacio);
        VEDArbin<Integer> hijo_der_der = new VEDArbin<Integer>(90,hijo_der_der_izq,hijo_der_der_der);
        VEDArbin<Integer> hijo_der_izq = new VEDArbin<Integer>(44,vacio,vacio);
        VEDArbin<Integer> hijo_der = new VEDArbin<Integer>(21,hijo_der_izq,hijo_der_der);
        VEDArbin<Integer> hijo_izq_der_der = new VEDArbin<Integer>(66,vacio,vacio);      
        VEDArbin<Integer> hijo_izq_der = new VEDArbin<Integer>(2,vacio,hijo_izq_der_der);    
        VEDArbin<Integer> hijo_izq_izq = new VEDArbin<Integer>(13,vacio,vacio);
        VEDArbin<Integer> hijo_izq = new VEDArbin<Integer>(80,hijo_izq_izq,hijo_izq_der);
        VEDArbin<Integer> nodo_raiz = new VEDArbin<Integer>(34,hijo_izq,hijo_der);
        
        
        VEDArbin<Integer> buscar_valor = new VEDArbin<Integer>();
		System.out.println(buscar_valor.busqueda(2));
        
        System.out.println();
        System.out.println("Arbol impreso en Inorden");
        System.out.println();
        //Imprimir arbol en preorden
        VEDArrayList<Integer> lista = new VEDArrayList<Integer>();//Crear lista apartir de la clase VEDArrayList, se crea lista vacia
        lista=nodo_raiz.preorden();
        for(int i=0; i < lista.gettam(); i++) {
			  System.out.println(lista.get(i));  
		  }
        System.out.println();
        System.out.println("Arbol impreso en Inorden");
        System.out.println();
        //Imprimir arbol en inorden
        lista=nodo_raiz.inorden();
        for(int i=0; i < lista.gettam(); i++) {
			  System.out.println(lista.get(i));  
		  }
        System.out.println();
        System.out.println();
        
        System.out.println();
        System.out.println("Arbol impreso en Postorden");
        System.out.println();
        //Imprimir arbol en inorden
        lista=nodo_raiz.postorden();
        for(int i=0; i < lista.gettam(); i++) {
			  System.out.println(lista.get(i));  
		  }
        System.out.println();
        System.out.println();
        
        System.out.println(nodo_raiz.esVacio());//arbol vacio
        System.out.println(hijo_der_der.esHoja());// hoja
        
      
        //Buscar elemento dentro del arbol
        VEDArbin<Integer> buscar_dato = new VEDArbin<Integer>();
        Integer dato =Integer.parseInt(JOptionPane.showInputDialog("Ingresar dato a buscar: "));
     
        
        
        /*
         System.out.println("Digite la raiz: ");//tomar dato en pantalla
        n = Controlador.entrada.nextInt();//a n se le asigna valor
        
        System.out.println("Digite objeto a buscar");
        x=Controlador.entrada.nextInt();
        
        VEDArbin<Object> nuevoNodo1 = new VEDArbin();
        nuevoNodo1 = (VEDArbin<Object>) lista.get(buscarIndex(n));
        if(nuevoNodo1.busqueda(x)){
            System.out.println("Valor encontrado");
        }else{

            System.out.println("Valor NO encontrado");
        }
         */
        VEDArbin<ArrayList> lista_vacia=new VEDArbin<ArrayList>();
        System.out.println(lista_vacia.getVal());
 
	}
}