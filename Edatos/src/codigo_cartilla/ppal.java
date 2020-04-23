package codigo_cartilla;

public class ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VEDArbin<Integer> vacio=new VEDArbin<Integer>();
		VEDArbin<Integer> arbol1=new VEDArbin<Integer>(9,vacio,vacio);
		//public VEDArbin(E pVal,VEDArbin<E> pDer, VEDArbin<E> pIzq)
		System.out.println(arbol1.getVal());
		VEDArbin<Integer> arbol2=new VEDArbin<Integer>();
		System.out.println(arbol2.getVal());
		VEDArbin<Integer> arbol3=new VEDArbin<Integer>(30,vacio,vacio);
		System.out.println(arbol3.getVal());
		System.out.println(arbol1.esVacio());
		System.out.println(arbol1.peso());
		System.out.println(arbol1.altura());
	}
}
