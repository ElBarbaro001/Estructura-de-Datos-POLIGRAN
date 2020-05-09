package pruebas;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import codigo_tutor.VEDArbin;
import codigo_tutor.VEDArrayList;

public class Ejercicio3 {
	
	static ArrayList<Object> lista = new ArrayList<Object>();//Pasar metodos de VEDArrayList a la Clase ArrayList

	public static void main(String[] args) {
		VEDArbin<Integer> vacio = new VEDArbin<Integer>();	
		//Rama derecha
		VEDArbin<Integer> der_der_der_der= new VEDArbin<Integer>(20,vacio,vacio);
		VEDArbin<Integer> der_der_der_izq= new VEDArbin<Integer>(17,vacio,vacio);//hoja
		VEDArbin<Integer> der_der_der= new VEDArbin<Integer>(18,der_der_der_izq,der_der_der_der);
		VEDArbin<Integer> der_der= new VEDArbin<Integer>(16,vacio,der_der_der);
		VEDArbin<Integer> der_izq= new VEDArbin<Integer>(12,vacio,vacio);//hoja
		VEDArbin<Integer> der= new VEDArbin<Integer>(15,der_izq,der_der);
		//Rama izquierda
		VEDArbin<Integer> izq_der_der_izq= new VEDArbin<Integer>(7,vacio,vacio);//hoja
		VEDArbin<Integer> izq_der_der= new VEDArbin<Integer>(8,izq_der_der_izq,vacio);
		VEDArbin<Integer> izq_der_izq= new VEDArbin<Integer>(5,vacio,vacio);//hoja
		VEDArbin<Integer> izq_der= new VEDArbin<Integer>(6,izq_der_izq,izq_der_der);
		VEDArbin<Integer> izq_izq= new VEDArbin<Integer>(1,vacio,vacio);//hoja
		VEDArbin<Integer> izq= new VEDArbin<Integer>(3,izq_izq,izq_der);
		//Raiz
		VEDArbin<Integer> raiz= new VEDArbin<Integer>(10,izq,der);
		VEDArrayList<Integer> lista= new VEDArrayList<Integer>();
		lista=raiz.inorden();
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero a buscar: "));
		VEDArbin<Integer> Buscar= new VEDArbin<Integer>();
		System.out.println(Buscar.(raiz, numero));
		

	}
}
