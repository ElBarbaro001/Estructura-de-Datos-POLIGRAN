package codigo_externo;

public class main {

	public static void main(String[] args) {
		
		VEDArbin<Integer> raiz=new VEDArbin<Integer>();
		raiz.agregar(10);
		VEDArbin<Integer> izq=new VEDArbin<Integer>();
		izq.agregar(3);
		VEDArbin<Integer> der=new VEDArbin<Integer> ();
		der.agregar(15);
		VEDArbin<Integer> izqhijo1=new VEDArbin<Integer> ();
		izqhijo1.agregar(1);
		VEDArbin<Integer> izqhijo2=new VEDArbin<Integer>();
		izqhijo2.agregar(6);
		VEDArbin<Integer> izqnieto1=new VEDArbin<Integer>();
		izqnieto1.agregar(5);
		VEDArbin<Integer> izqnieto2=new VEDArbin<Integer>();
		izqnieto2.agregar(8);
		VEDArbin<Integer> izqbisnieto1=new VEDArbin<Integer>();
		izqbisnieto1.agregar(7);
		VEDArbin<Integer> derhijo1=new VEDArbin<Integer>();
		derhijo1.agregar(12);
		VEDArbin<Integer> derhijo2=new VEDArbin<Integer>();
		derhijo2.agregar(16);
		VEDArbin<Integer> dernieto1=new VEDArbin<Integer>();
		dernieto1.agregar(18);
		VEDArbin<Integer> derbisnieto1=new VEDArbin<Integer>();
		derbisnieto1.agregar(17);
		VEDArbin<Integer> derbisnieto2=new VEDArbin<Integer>();
		derbisnieto2.agregar(20);
		
		System.out.println(raiz.getVal());
		System.out.println(izq.getVal());	
		System.out.println(der.getVal());	
		System.out.println(izqhijo1.getVal());	
		System.out.println(izqhijo2.getVal());	
		System.out.println(izqnieto1.getVal());
		System.out.println(izqnieto2.getVal());
		System.out.println(izqbisnieto1.getVal());
		System.out.println(derhijo1.getVal());
		System.out.println(derhijo2.getVal());
		System.out.println(dernieto1.getVal());
		System.out.println(derbisnieto1.getVal());
		System.out.println(derbisnieto2.getVal());
		System.out.println("El peso de la raiz es:"+raiz.peso());
		System.out.println("El peso de los hijos de la raiz es:"+(izq.peso()+der.peso()));
		System.out.println("El peso de los nietos de la raiz es:"+(izqhijo1.peso()+izqhijo2.peso()+derhijo1.peso()+derhijo2.peso()));
		System.out.println("El peso de los bisnietos de la raiz es:"+(izqnieto1.peso()+izqnieto2.peso()+dernieto1.peso()));
		System.out.println("El peso de los tataranietos de la raiz es:"+(izqbisnieto1.peso()+derbisnieto1.peso()+derbisnieto2.peso()));
		System.out.println("El peso total del arbol es:"+(raiz.peso()+izq.peso()+der.peso()+izqhijo1.peso()+izqhijo2.peso()+derhijo1.peso()+derhijo2.peso()+izqnieto1.peso()+izqnieto2.peso()+dernieto1.peso()+izqbisnieto1.peso()+derbisnieto1.peso()+derbisnieto2.peso()));
		System.out.println("La altura hacia la derecha del arbol es:"+(raiz.altura()+izq.altura()+izqhijo1.altura()+izqhijo2.altura()+izqnieto1.altura()+izqnieto2.altura()+izqbisnieto1.altura()));
		System.out.println("La altura hacia la izquierda del arbol es:"+(raiz.altura()+der.altura()+derhijo1.altura()+derhijo2.altura()+dernieto1.altura()+derbisnieto1.altura()+derbisnieto2.altura()));
	}
}