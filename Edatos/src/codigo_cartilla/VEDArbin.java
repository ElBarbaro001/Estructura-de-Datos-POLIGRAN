package codigo_cartilla;
import java.util.*;

public class VEDArbin<E>{//Figura 11 Declaracion de la clase VEDArbin<E>
	
	protected E val;
	protected VEDArbin<E> izq;
	protected VEDArbin<E> der;
	
	public VEDArbin() {//figura 12 Metodos constructores de la clase VEDArbin<E>
		val=null;
		izq=null;
		der=null;
	}
	
	public VEDArbin(E pVal,VEDArbin<E> pDer, VEDArbin<E> pIzq) {//figura 12 Metodos constructores de la clase VEDArbin<E>
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
	public E getVal() {//Figura 13 Metodo para consultar la raiz de un arbol
        return val;
    }
	
	public VEDArbin<E> getIzq() {//Figura 14 Metodo para consultar el sub-arbol izquierdo
        return izq;
    }
	
	public VEDArbin<E> getDer() {//Figura 15 Metodo para consultar el sub-arbol derecho
        return der;
    }
	
	public boolean esVacio(){//Figura 16 Metodo para consultar si el arbol esta vacio o no
        if(val==null) {
        	return true;
        }else {
        	return false;
        }
    }
	
	public boolean esHoja(){//Figura 17 Metodo para consultar si un nodo es una hoja o no
        if (esVacio()) {
            return false;
        }
        else {
        	if(izq.esVacio() && der.esVacio()) {
        		return true;
        	}
        	else {
        		return false;
        	}
        }  
    }
	
	public int peso(){//Figura 18 Metodo para calcular el peso de un arbol
        if(esVacio()){
            return 0;
        }else{
            return 1+izq.peso()+der.peso();
        }        
    }
	
	public int altura(){//Figura 19 Metodo para calcular la altura de un arbol
        if(esVacio()){
            return 0;
            
        }else{
            return 1+Math.max(izq.altura(), der.altura()) ;
            
        }
    
    }
	
	public int numeroOcurrencias(Object Pobject){//figura 20 Metodo para calcular el numero de ocurrencias de un valor dentro de un arbol
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
	
	public List<E> preOrden(){//Figura 21 Metodo recursivo para hallar el recorrido de un arbol binario en preorden
        List<E> lista = new ArrayList<E>();
        preOrden(lista);
        return lista;      
        
    }
    
    private void preOrden(List<E> pLista){//Figura 21 Metodo recursivo para hallar el recorrido de un arbol binario en preorden
        if (!esVacio()) {
            
            
            pLista.add(val);
            if (izq!=null) {
            izq.preOrden(pLista);
            }
            if (der!=null) {
            der.preOrden(pLista);    
            }
            
            
        }
       
    }
	
    public List<E> inOrden(){//Figura 22 Metodo recursivo para hallar el recorrido de un arbol binario en inorden 
        List<E> lista = new ArrayList<>();
        inOrden(lista);
        return lista;      
        
    }
    
    private void inOrden(List<E> pLista){//Figura 22 Metodo recursivo para hallar el recorrido de un arbol binario en inorden
        if (!esVacio()) {
            if (izq!=null) {
            izq.inOrden(pLista);
            }
            pLista.add(val);
            if (der!=null) {
            der.inOrden(pLista);   
            }
        } 
    }
    
    public List<E> postOrden(){//Figura 23 Metodo recursivo para hallar el recorrido de un arbol binario en postorden
        List<E> lista = new ArrayList<E>();
        postOrden(lista);
        return lista;      
        
    }
    
    private void postOrden(List<E> pLista){//Figura 23 Metodo recursivo para hallar el recorrido de un arbol binario en postorden
        if (!esVacio()) {
            
                if(izq!=null){
                izq.postOrden(pLista);
                }
                if(der!=null){
                der.postOrden(pLista);
                }
                pLista.add(val);

            }
        }

    public List<E> niveles(){//Figura 24 Metodo iterativo para hallar el recorrido de un arbol binario por niveles
        List<E> lista = new ArrayList<E>();
        niveles(lista);
        return lista;      
    }
      
   public List<E> niveles(List<E> lista){//Figura 24 Metodo iterativo para hallar el recorrido de un arbol binario por niveles
        Queue<VEDArbin<E>> cola = new LinkedList<E>();
        VEDArbin<E> actual = new VEDArbin<E>();
        cola.offer(this);
        while(!cola.isEmpty()){
            actual = cola.poll();
            if (!actual.esVacio()) {
                lista.add(actual.val);
                if (izq!=null) {
                izq.niveles(lista);   
                }
                if (der!=null) {
                izq.niveles(lista);   
                }              
            }
        }
        return lista;      
     }
    
}