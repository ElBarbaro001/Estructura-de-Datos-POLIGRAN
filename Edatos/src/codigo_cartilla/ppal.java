package codigo_cartilla;
import java.util.*;
public class ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VEDArbin<Integer> Arbolnull = new VEDArbin<Integer>();//Arbol vacio
		VEDArbin<Integer> Arbol1 = new VEDArbin<Integer>(10,Arbolnull,Arbolnull);//Raiz
		VEDArbin<Integer> Arbol2 = new VEDArbin<Integer>(15,Arbolnull,Arbol1);//Derecho
		VEDArbin<Integer> Arbol3 = new VEDArbin<Integer>(3,Arbol1,Arbol2);//Izquierdo
	
		System.out.println(Arbol2.getDer());
	}
}
