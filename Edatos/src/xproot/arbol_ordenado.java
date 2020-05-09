package xproot;

import javax.swing.JOptionPane;

public class arbol_ordenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		VEDArbinOrdenado<Integer> vacio=new VEDArbinOrdenado<Integer>();//Arbol vacio
		
		VEDArbinOrdenado<Integer> raiz=new VEDArbinOrdenado<Integer>();//Raiz
		raiz.add(7);
		
		VEDArbinOrdenado<Integer> der=new VEDArbinOrdenado<Integer>();//sub arbol derecho
		der.add(20);
		
		VEDArbinOrdenado<Integer> der_izq=new VEDArbinOrdenado<Integer>();//sub arbol derecho_izquierdo
		der.add(15);
		
		VEDArbinOrdenado<Integer> der_der=new VEDArbinOrdenado<Integer>();//sub arbol derecho_derecho
		der_der.add(25);
		
		VEDArbinOrdenado<Integer> der_der_der=new VEDArbinOrdenado<Integer>();//sub arbol derecho_derecho_derecho
		der_der_der.add(30);
		
		VEDArbinOrdenado<Integer> izq=new VEDArbinOrdenado<Integer>();//sub arbol izquierdo
		izq.add(3);
		
		VEDArbinOrdenado<Integer> izq_der=new VEDArbinOrdenado<Integer>();//sub arbol izquierdo_derecho
		izq_der.add(5);
		
		VEDArbinOrdenado<Integer> izq_der_der=new VEDArbinOrdenado<Integer>();//sub arbol izquierdo_derecho_derecho
		izq_der_der.add(6);
		
		VEDArbinOrdenado<Integer> izq_der_izq=new VEDArbinOrdenado<Integer>();//sub arbol izquierdo_derecho_izquierdo
		izq_der_izq.add(4);
		
		VEDArbinOrdenado<Integer> izq_izq=new VEDArbinOrdenado<Integer>();//sub arbol izquierdo_izquierdo
		izq_izq.add(0);
		
		VEDArbinOrdenado<Integer> izq_izq_der=new VEDArbinOrdenado<Integer>();//sub arbol izquierdo_izquierdo_derecho
		izq_izq_der.add(1);
		
		VEDArbinOrdenado<Integer> izq_izq_izq=new VEDArbinOrdenado<Integer>();//sub arbol izquierdo_izquierdo_izquierdo
		izq_izq_izq.add(-3);
		
		VEDArrayList<Integer> lista=new VEDArrayList<Integer>();
		
		System.out.println(raiz.getVal());
		*/
		VEDArbinOrdenado<String> vacio=new VEDArbinOrdenado<String>();//arbol vacio
		VEDArbinOrdenado<String> arbol=new VEDArbinOrdenado<String>();//arbol lleno
		arbol.add( "H");
		arbol.add("B");
		arbol.add("E");
		arbol.add( "G");
		arbol.add("F");
		arbol.add( "D");
		arbol.add( "A");
		//arbol.add(7);
		VEDArrayList<String> lista = new VEDArrayList<String>();
		//System.out.println(lista=arbol.inorden());
		lista=arbol.inorden();
		for(int i=0;i<lista.gettam();i++) {
			System.out.println(lista.get(i));
		}
		
		VEDArbinOrdenado<Integer> arbol2=new VEDArbinOrdenado<Integer>();//arbol lleno
		arbol2.add( 19);
		arbol2.add(24);
		arbol2.add(32);
		arbol2.add( 40);
		arbol2.add(37);
		arbol2.add(80);
		arbol2.add(97);
		arbol2.add(71);
		arbol2.add(92);
		arbol2.add(45);
		VEDArrayList<Integer> lista2 = new VEDArrayList<Integer>();
		lista2=arbol2.inorden();
		System.out.println();
		for(int i=0;i<lista2.gettam();i++) {
			System.out.println(lista2.get(i));
		}
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa valor: "));
		System.out.println(arbol2.buscar_ordenado(arbol2, numero));
	}

}
