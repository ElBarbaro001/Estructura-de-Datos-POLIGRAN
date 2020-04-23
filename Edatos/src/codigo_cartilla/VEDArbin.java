package codigo_cartilla;
import java.util.*;

public class VEDArbin<E>{//Figura 11 Declaracion de la clase VEDArbin<E>
	
	protected E val;//raiz
	protected VEDArbin<E> der;//rama del lado derecho
	protected VEDArbin<E> izq;// rama del lado izquierdo
	public String toStringRaiz(){
        return "Arbol_Binario{"+"val="+val+'}';
    }
	public String toStringDerecho(){
        return "Arbol_Binario{"+"val="+der+'}';
    }
	public String toStringIzquierdo(){
        return "Arbol_Binario{"+"val="+izq+'}';
    }
    public void setVal(E val){
        this.val=val;
    }
    public void setDer(VEDArbin<E> der){
        this.der=der;
    }
    public void setIzq(VEDArbin<E> izq){
        this.izq=izq;
    }
	public VEDArbin() {//figura 12 Metodos constructores de la clase VEDArbin<E> //Metodo destructor
		val=null;
		der=null;
		izq=null;
	}
	
	 public VEDArbin(E pVal,VEDArbin<E> pDer, VEDArbin<E> pIzq) {//Metodo constructor
		 val = pVal;
	     der = pDer;
	      izq = pIzq;
		 if (pVal == null) {
	            throw new NullPointerException("Un arbol vacio debe tener raiz!");
	        }
	         if (pDer == null) {
	            throw new NullPointerException("Un arbol vacio debe tener sub arbol izquierdo!");
	        }
	          if (pIzq == null) {
	            throw new NullPointerException("Un arbol vacio debe tener sub arbol derecho!");
	        }
	    }
	 
	

	public E getVal() {//Imprimir valor de la Raiz
	        return val;
	    }
	 
	 public VEDArbin<E> getDer() {//Imprimir valor derecho del abol
	        return der;
	    }
	 public VEDArbin<E> getIzq() {//Imprimir valor izquierdo
	        return izq;
	    }
	 
	 public boolean esVacio(){//Imprimir arbol vacio
	        return val == null;
	    }
	 
	 public boolean esHoja(){//Un nodo es una hoja si sus dos subárboles son vacíos
	        if (esVacio()) {
	            return false;
	        }
	        return izq.esVacio() && der.esVacio();
	    }
	 
	 public int peso(){
	        if(esVacio()){
	            return 0;
	        }else{
	            return 1+izq.peso()+der.peso();
	        }       
	    }
	 
	 public int altura(){
	        if(esVacio()){
	            return 0;
	            
	        }else{
	            return 1+Math.max(izq.altura(), der.altura()) ;
	        }
	    }
	 public int numeroOcurrencias(Object Pobject){
	        if (esVacio()) {
	            return 0;

	        }else{
	            int contadorIzq = izq.numeroOcurrencias(Pobject);
	            int contadorDer = der.numeroOcurrencias(Pobject);
	            if (Pobject.equals(val)) {
	                return 1+contadorIzq+contadorDer;
	            }else{
	                return contadorIzq+contadorDer;
	            }

	        }

	    }
	 public VEDArrayList<E> preorden()
		{
			VEDArrayList<E> lista=new VEDArrayList<E>();
			preorden(lista);
			return lista;
		}
		
		public void preorden(VEDArrayList<E> pLista)
		{
			if (esVacio())
			{
				
			}
			else
			{
				pLista.add(val);
				izq.preorden(pLista);
				der.preorden(pLista);
			}
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //Insertar elementos al arbol
	 public boolean agregar (E element) {
		 if(esVacio()) {
			 val=element;
			 izq=new VEDArbin<E>();
			 der=new VEDArbin<E>();
			 return true;
		 }
		 else {
			 Comparable<E> x=(Comparable<E>) element;
			 int c=x.compareTo(val);
			 if(c==0) {
				 return false;
			 }
			 else if (c<0) {
				 return getIzq().agregar(element);
			 }
			 else {
				 return getDer().agregar(element);
			 }
		 }
	 }
}