package codigo_cartilla;


public class VEDArbin<E>{//Figura 11 Declaracion de la clase VEDArbin<E>
	
	protected E val;
	protected VEDArbin<E> izq;
	protected VEDArbin<E> der;
	
	public VEDArbin() {//figura 12 Metodos constructores de la clase VEDArbin<E>
		val=null;
		izq=null;
		der=null;
	}
	
	 public VEDArbin(E pVal,VEDArbin<E> pDer, VEDArbin<E> pIzq) {
	        if (pVal == null) {
	            throw new NullPointerException("Un arbol vacio debe tener raiz!");
	        }
	         if (pDer == null) {
	            throw new NullPointerException("Un arbol vacio debe tener sub arbol izquierdo!");
	        }
	         
	          if (pIzq == null) {
	            throw new NullPointerException("Un arbol vacio debe tener sub arbol derecho!");
	        }
	        
	        der = pDer;
	        izq = pIzq;
	        val = pVal;
	    }
	 
	 public E getVal() {
	        return val;
	    }
	

}