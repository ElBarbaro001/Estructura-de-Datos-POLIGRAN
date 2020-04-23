package codigo_tutor;

public class ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VEDArbin<String> arbolnull = new VEDArbin<String>();
		VEDArbin<String> arbol1 = new VEDArbin<String>("2",arbolnull,arbolnull);
		VEDArbin<String> arbol2 = new VEDArbin<String>("3",arbolnull,arbolnull);
		VEDArbin<String> arbol3 = new VEDArbin<String>("6",arbol1,arbol2);
		VEDArbin<String> arbol4 = new VEDArbin<String>("4",arbolnull,arbol3);
		VEDArbin<String> arbol5 = new VEDArbin<String>("5",arbolnull,arbolnull);
		VEDArbin<String> arbol6 = new VEDArbin<String>("8",arbolnull,arbolnull);
		VEDArbin<String> arbol7 = new VEDArbin<String>("1",arbol5,arbol6);
		VEDArbin<String> arbol8 = new VEDArbin<String>("7",arbol7,arbol4);
		VEDArrayList<String> lista = new VEDArrayList<String>();
		lista=arbol8.preorden();
		for(int i=0;i<lista.gettam();i++) {
			System.out.println(lista.get(i));
		}//fin
		 System.out.println("");
		  lista = arbol8.inorden();
		  for(int i=0; i < lista.gettam(); i++) {
			  System.out.print(lista.get(i));  
		  }//fin
		  System.out.println("");
		  lista = arbol8.postorden();
		  for(int i=0; i < lista.gettam(); i++) {
			  System.out.print(lista.get(i));  
		  }//fin
		  System.out.println("");
		  lista = arbol8.niveles();
		  for(int i=0; i < lista.gettam(); i++) {
			  System.out.print(lista.get(i));  
		  }//fin
		  
		  if(arbol8.esContenido(arbol7)) {
			  System.out.println("es contenido");
		  }else {
			  System.out.print("no es contenido");
		  }//fin else
	}
}
