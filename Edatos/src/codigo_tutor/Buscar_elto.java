package codigo_tutor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import pruebas.VEDArbin;
public class Buscar_elto {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear copia de la clase VEDArbin en la variable vacio
				VEDArbin<Integer> vacio = new VEDArbin<Integer>();
				
				//Rama derecha subarbol derecho
				VEDArbin<Integer> rama_der_der = new VEDArbin<Integer>(24,vacio,vacio);
				//Rama derecha subarbol izquierdo
				VEDArbin<Integer> rama_der_izq_izq = new VEDArbin<Integer>(17,vacio,vacio);
				VEDArbin<Integer> rama_der_izq = new VEDArbin<Integer>(18,rama_der_izq_izq,vacio);
				//Subarbol derecho
				VEDArbin<Integer> rama_der = new VEDArbin<Integer>(20,rama_der_izq,rama_der_der);
				//Rama derecha subarbol izquierdo
				VEDArbin<Integer> rama_izq_der_der = new VEDArbin<Integer>(12,vacio,vacio);
				VEDArbin<Integer> rama_izq_der_izq = new VEDArbin<Integer>(7,vacio,vacio);
				VEDArbin<Integer> rama_izq_der = new VEDArbin<Integer>(9,rama_izq_der_izq,rama_izq_der_der);
				//Rama izquierda subarbol izquierdo
				VEDArbin<Integer> rama_izq_izq_der = new VEDArbin<Integer>(4,vacio,vacio);
				VEDArbin<Integer> rama_izq_izq_izq = new VEDArbin<Integer>(1,vacio,vacio);
				VEDArbin<Integer> rama_izq_izq = new VEDArbin<Integer>(3,rama_izq_izq_izq,rama_izq_izq_der);
				//Subarbol izquierdo
				VEDArbin<Integer> rama_izq = new VEDArbin<Integer>(6,rama_izq_izq,rama_izq_der);
				//Raiz del Arbol
				VEDArbin<Integer> raiz= new VEDArbin<Integer>(15,rama_izq,rama_der);
				System.out.println(raiz.getVal());
				
				List<Integer> lista = new VEDArrayList<Integer>();
				lista=raiz.inorden();
		
	}

}