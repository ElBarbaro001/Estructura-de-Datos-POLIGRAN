package pruebas;
import codigo_tutor.VEDArrayList;
import codigo_tutor.List;

public class tutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VEDArbin<String> Arbolnull=new VEDArbin<String>();
		  VEDArbin<String> Arbol1=new VEDArbin<String>("2",Arbolnull,Arbolnull);
		  VEDArbin<String> Arbol2=new VEDArbin<String>("3",Arbolnull,Arbolnull);
		  VEDArbin<String> Arbol3=new VEDArbin<String>("6",Arbol1,Arbol2);
		  VEDArbin<String> Arbol4=new VEDArbin<String>("4",Arbolnull,Arbol3);
		  VEDArbin<String> Arbol5=new VEDArbin<String>("5",Arbolnull,Arbolnull);
		  VEDArbin<String> Arbol6=new VEDArbin<String>("8",Arbolnull,Arbolnull);
		  VEDArbin<String> Arbol7=new VEDArbin<String>("1",Arbol5,Arbol6);
		  VEDArbin<String> Arbol8=new VEDArbin<String>("7",Arbol7,Arbol4);
		  VEDArrayList <String> lista=new VEDArrayList<String>();
		  lista = (VEDArrayList<String>) Arbol8.preorden();
		  for(int i=0; i < lista.gettam(); i++) {
			  System.out.print(lista.get(i));  
		  }
		  System.out.println("");
		  //lista = (VEDArrayList<String>) Arbol8.inorden(raiz);
		  for(int i=0; i < lista.gettam(); i++) {
			  System.out.print(lista.get(i));  
		  }
		  System.out.println("");
		//  lista = Arbol8.postorden();
		  for(int i=0; i < lista.gettam(); i++) {
			  System.out.print(lista.get(i));  
		  }
		  System.out.println("");
		//  lista = Arbol8.niveles();
		  for(int i=0; i < lista.gettam(); i++) {
			  System.out.print(lista.get(i));  
		  }
		  
		//  if(Arbol8.esContenido(Arbol7)) {
			  System.out.println("es contenido");
		//  }else {
			  System.out.print("no es contenido");
		  }

	}