package codigo_cartilla;

public class ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VEDArbin<String> arbolnull=new VEDArbin<String>();
		VEDArbin<String> arbol1=new VEDArbin<String>("Nodo Padre",arbolnull,arbolnull);
		System.out.println(arbol1.getVal());
	}

}
