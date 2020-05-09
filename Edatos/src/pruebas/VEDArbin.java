package pruebas;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class VEDArbin<E> {
    
	private Object[] arreglo=new Object[1];
	protected E val;
    protected VEDArbin<E> izq;
    protected VEDArbin<E> der;
    
    // metodo constructor
    
    public VEDArbin() {
        //Arbol vacio representado como un ?rbol binario null, sub?rbol izq null y sub?rbol der null
        val=null;
        izq=null;
        der=null;
    }
    public VEDArbin(E pVal, VEDArbin<E> pIzq, VEDArbin<E> pDer) {
        // Si la raiz dada es null, Lanzar error
        if (pVal==null) {
            throw new NullPointerException ("Un ?rbol no vacio de tener ra?z!");
        }
        // si el arbol izq es nul lanzar error
        if (pIzq==null) {
            throw new NullPointerException ("Un ?rbol no vacio necesita su?rbol izquierdo!");
        }
        // si el arbol der es nul lanzar error
                if (pDer==null) {
                    throw new NullPointerException ("Un ?rbol no vacio necesita su?rbol derecho!");
        }
                val=pVal;
                izq=pIzq;
                der=pDer;
    }
    
    public E get(int index) {//Buscar elemento dentro de una lista
		Object elemento=arreglo [index];
		return (E)elemento;
	}//fin
    
    
    public E getVal() {//Imprimir valor de la raiz
		return val;
	}//fin getval
    public VEDArbin<E> getIzq(){
        return izq;    //Retornar el sub?rbol izquierdo
    }
    public VEDArbin<E> getDer(){
        return der;    //Retornar el sub?rbol derecho
    }
    public boolean esVacio() {
        if (val==null) { //Si la raiz es Null
            return true; //Retornar true porque este arbol representa un arbol vacio
        }
        else { //si la raiz no en null
            return false; //Retornar false porque el arbol no representa un arbol vacio
        }
    }
    public boolean esHoja() {
        if (esVacio()) { //Si este arbol es vacio
            return false; //decir que este arbol no representa una hoja
        }
        else { //Si este arbol es vacio
            if (izq.esVacio()&&der.esVacio()) {
                return true; //decir que este arbol si representa una hoja
            }
            else { //si alguno de los dos arboles no es vacio:
                return false; //decir qye este arbol no representa una hoja
            }
        }
    }        
    public int peso() {
        if (esVacio()) { //si este arbol es vacio
            return 0; //el peso del arbol es 0
        }
        else { //si este arbol no es vacio
            //el peso de un arbol no es vacio es uno mas el peso del subarbol izq ma el peso del subarbol der
            return 1+izq.peso()+der.peso();
            
        }
    }
    public int altura() {
        if (esVacio()) { //si este arbol es vacio
            return 0; //la altura el darbol es 0
        }
        else { //si este arbol no es vacio
            //la altura de un arbol no es vacio es uno mas el maximo de la altura del subarbol izq y la altura del subarbol der
            return 1+Math.max(izq.altura(),der.altura());
            
        }
    }
    public int numeroOcurrencias(Object pObject) {
        if (esVacio()) {  //si este arbol es vacio
            //el Objeto no es un arbol por que no tiene elementos
            return 0;
        }
        else { //si este arbol no es vacio
            //contar cuantas veces esta el objeto el el subarbol izq
            int contadorIzq=izq.numeroOcurrencias (pObject);
            //contar cuantas veces esta el objeto el el subarbol der
            int contadorDer=der.numeroOcurrencias (pObject);
            if (pObject.equals(val)) { //si el objeto buscardo es igual a la raiz dle arbol
                //retornat uno mas el numero de ocurrencias entre izq y der
                return 1+contadorIzq+contadorDer;
            }
            else { // si el objeto buscado no es igual a la raiz del arbol
                //retornar nuemro de ocurrencias de izq y der
                return contadorIzq+contadorDer;
            }
            
        }
    }
    public List<E> preorden() {
        List<E> lista=new ArrayList<E>(); //Crear una nueva lista
        preorden(lista); //Alimentar la lista con el recorrido preordenado
        return lista; //retirnar lista
        
    }
    private void preorden(List<E> pLista) {
        if (esVacio()) {
            
        }
        else {
            pLista.add(val);
            izq.preorden(pLista);
            der.preorden(pLista);
        }
    }
    public List<E> inorden(){
        List<E> lista=new ArrayList<E>();
        inorden(lista);
        return lista;
        
    }
    private void inorden(List<E> pLista) {
        if (esVacio()) {
            
        }
        else {
            izq.inorden(pLista);
            pLista.add(val);
            der.inorden(pLista);
        }
    }
    public List<E> postorden(){
        List<E> lista=new ArrayList<E>();
        postorden(lista);
        return lista;
        
    }
    private void postorden(List<E> pLista) {
        if (esVacio()) {
            
        }
        else {
            izq.postorden(pLista);
            der.postorden(pLista);
            pLista.add(val);
        }
    }
    //Insertar elementos al arbol
         @SuppressWarnings("unchecked")
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
         
         public boolean Buscar(VEDArbin<Integer> node, Integer key) {
        	
            if (node == null)
                return false;
            if (node.val == key)
                return true;
            boolean b1=false,b2= false;
            if(izq!=null){
                b1 = izq.Buscar(node.izq, key);
            }
            if(der!=null){
                b2 = der.Buscar(node.der, key);
            }
            if(b1||b2){
            	System.out.println("Existe!! ");
            	return true;
            }
            System.out.println("Error!!! No existe!!!");
		return false;
        }
}