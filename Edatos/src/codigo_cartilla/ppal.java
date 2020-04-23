package codigo_cartilla;
import java.util.*;
public class ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VEDArbin<Integer> vacio = new VEDArbin<Integer>();
		VEDArbin<Integer> raiz = new VEDArbin<Integer>(10,vacio,vacio);
		VEDArbin<Integer> derecho = new VEDArbin<Integer>(10,vacio,raiz);
		VEDArbin<Integer> izquierdo = new VEDArbin<Integer>(10,raiz,derecho);
		
		System.out.println(raiz.getVal());
		System.out.println(derecho.getDer());
		System.out.println(izquierdo.getIzq());
		System.out.println(vacio.peso());
	}
}
