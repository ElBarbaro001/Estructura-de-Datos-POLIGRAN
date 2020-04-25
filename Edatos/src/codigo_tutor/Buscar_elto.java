package codigo_tutor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Buscar_elto {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        VEDArrayList<Integer> lista = new VEDArrayList<Integer>();//Crear lista apartir de la clase VEDArrayList, se crea lista vacia
        lista=nodo_raiz.preorden();
        System.out.println();
        System.out.println("Arbol impreso en Inorden");
        System.out.println();
        for(int i=0; i < lista.gettam(); i++) {
			  System.out.println(lista.get(i));  
		  }
        
        //public static void buscar_elto(){
        	//Integer dato =Integer.parseInt(JOptionPane.showInputDialog("Ingresar dato a buscar: "));	
        //}
	}

}