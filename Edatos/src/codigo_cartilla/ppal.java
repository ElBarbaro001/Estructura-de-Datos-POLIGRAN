package codigo_cartilla;

public class ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VEDArbin<String> vacio=new VEDArbin<String>();
		VEDArbin<String> arbol1=new VEDArbin<String>("Raiz",vacio,vacio);
		VEDArbin<String> arbol2=new VEDArbin<String>("Lado Derecho",vacio,vacio);
		System.out.println(arbol1.getVal());
		System.out.println(arbol2.getVal());
	}

}
