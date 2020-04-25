package codigo_tutor;
import java.util.LinkedList;
import java.util.Queue;
public class VEDArbin<E> {
	
	//Crear varibles protegidas
	protected E val;// Se crear nodo
	protected VEDArbin<E> der;//Se acopla arbol o nodo al lado derecho
	protected VEDArbin<E> izq;//Se acopla arbol o nodo al lado izquierdo
	
	
	public VEDArbin() {//Crear nodo vacio
		val=null;
		izq=null;
		der=null;
	}
	
	//Crear funcion analizadora
	public VEDArbin(E pVal, VEDArbin<E> pIzq,VEDArbin<E> pDer) {//Asigna valor al nodo, y se apunta a los nodos deseados
		if(pVal==null) {
			throw new NullPointerException("Un arbol vacio no deberia tener raiz");
		}
		if(pIzq==null) {
			throw new NullPointerException("Un arbol vacio no necesita izquierda");
		}
		if(pDer==null) {
			throw new NullPointerException("Un arbol vacio no necesita derecha");
		}
		val=pVal;
		izq=pIzq;
		der=pDer;
	}//fin vedarbin
	public E getVal() {//Imprimir valor de la raiz
		return val;
	}//fin getval
	public VEDArbin<E> getIzq(){//imprimir valor del subarbol izquierdo
		return izq;
	}//fingetizq
	public VEDArbin<E> getDer(){//imprimir valor del subarbol derecho
		return der;
	}//fin getder
	public boolean esVacio() {//validar si arbol esta vacio
		if (val==null) {
			return true;
		}
		else {
			return false;
		}
	}//fin es vacio
	public boolean esHoja() {
		if (esVacio()) {
			return false;
		}
		else {
			if(izq.esVacio()&& der.esVacio()) {
				return true;
			}else {
				return false;
			}
		}	
	}//fin es hoja
	public int peso() {
		if (esVacio()) {
			return 0;
		}
		else
		{
			return 1 + izq.peso()+ der.peso();
		}
	}//fin peso
	public int altura(){
		if (esVacio()) {
			return 0;
		}
		else {
			return 1+Math.max(izq.altura(),der.altura());
		}
	}//fin altura
	public int numeroOcurrencias (Object pObject) {
		if(esVacio()) {
			return 0;
		}
		else {
			int contadorIzq=izq.numeroOcurrencias(pObject);
			int contadorDer=der.numeroOcurrencias(pObject);
			if (pObject.equals(val)) {
				return 1+contadorIzq+contadorDer;
			}
			else {
				return contadorIzq+contadorDer;
			}
		}
	}//finocurrencias
	public VEDArrayList<E> preorden()
	{
		VEDArrayList<E> lista=new VEDArrayList<E>();
		preorden(lista);
		return lista;
	}//finvedarraylist
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
	}//finpreorden
	
	public VEDArrayList<E> inorden()
	{
		VEDArrayList<E> lista=new VEDArrayList<E>();
		inorden(lista);
		return lista;
	}//finvedarraylist
	public void inorden(VEDArrayList<E> pLista)
	{
		if (esVacio())
		{
			
		}
		else
		{
			izq.inorden(pLista);
			pLista.add(val);
			der.inorden(pLista);
		}
	}//fininorden
	public VEDArrayList<E> postorden()
	{
		VEDArrayList<E> lista=new VEDArrayList<E>();
		postorden(lista);
		return lista;
	}//finvedarraylist
	public void postorden(VEDArrayList<E> pLista)
	{
		if (esVacio())
		{
			
		}
		else
		{
			izq.postorden(pLista);
			der.postorden(pLista);
			pLista.add(val);
		}
	}//fin postorden
	public VEDArrayList<E> niveles()
	{
		VEDArrayList<E> lista=new VEDArrayList<E>();
		Queue<VEDArbin<E>> cola =new LinkedList<VEDArbin<E>>();
		cola.offer(this);
		while (!cola.isEmpty()) {
			VEDArbin<E> actual=cola.poll();
			if (!actual.esVacio()) {
				lista.add(actual.val);
				cola.offer(actual.izq);
				cola.offer(actual.der);
			}
		}
		return lista;		
	}//fin vedarraylist
	public boolean esContenido (VEDArbin<E> arbol) {
		if(arbol.altura()>altura()){
			return false;
		}
		else if (arbol.altura()==altura()) {
			if(arbol.preorden()==preorden()) {
				return true;
			}else
			{
				return false;
			}
		}
		else {
			if(esContenido(arbol,izq)) {
				return true;
			}
			else if (esContenido(arbol,der)){
				return true;
			}
			else {
				return false;
			}
		}
	}//fin es contenido
	public boolean esContenido (VEDArbin<E> arbol, VEDArbin<E> arbol2) {
		if(arbol.altura()>arbol2.altura()){
			return false;
		}
		else if (arbol.altura()==arbol2.altura()) {
			if(arbol.preorden()==arbol2.preorden()) {
				return true;
			}else
			{
				return false;
			}
		}
		else {
			if(esContenido(arbol,arbol2.izq)) {
				return true;
			}
			else if (esContenido(arbol,arbol2.der)){
				return true;
			}
			else {
				return false;
			}
		}	
	}//fin es contenido
	
	public boolean busqueda(E valor){

        if (!esVacio()) {

            if (getVal()==valor) {
                return true;
            }
            boolean b1=false,b2= false;
            if(izq!=null){
                b1 = izq.busqueda(valor);
            }
            if(der!=null){
                b2 = der.busqueda(valor);
            }
            if(b1||b2){
                return true;
            }
        }
        return false;
    }
	public boolean SearchNode(VEDArbin<Integer> node, Integer key) {
        if (node == null)//Si existe un arbol
            return false;
        if (node.val == key)
            return true;
        boolean b1=false,b2= false;
        if(izq!=null){
            b1 = izq.busqueda(valor);
        }
        if(der!=null){
            b2 = der.busqueda(valor);
        }
        if(b1||b2){
            return true;
        }
    }
    return false;
    }
public boolean buscar(VEDArbin<Integer> node, Integer key) {
        if (node == null)//Si existe un arbol
            return false;
        if (node.val == key)
            return true;
        boolean b1=false,b2= false;
        if(izq!=null){
            b1 = izq.buscar(val,key);
        }
        if(der!=null){
            b2 = der.buscar(val,key);
        }
        if(b1||b2){
            return true;
        }
    }
    return false;
    }
    
    public boolean buscarr(VEDArbin<Integer> node, Integer key) {
    	boolean msge, msgen;
    	msge=true;
    	msgen=false;
    	String ms1,ms2;
    	ms1=Boolean.toString(msge);
    	ms2=Boolean.toString(msgen);
    	String str1="Existe " +
        if (node == null)
            return false;
        if (node.val == key)
            return true;
        boolean res1 = SearchNode(node.izq,key);
        if (res1)
            return true;
        boolean res2 = SearchNode (node.der,key);
        return res2;
    }
    
    
    
    
    
    
    
    
    
    public boolean Buscar(VEDArbin<Integer> node, Integer key) {
        if (node == null)//Si existe un arbol
            return false;
        if (node.val == key)
            return true;
        boolean b1=false,b2= false;
        if(izq!=null){
            b1 = Buscar(node.izq, key);
        }
        if(der!=null){
            b2 = der.Buscar(node.der, key);
        }
        if(b1||b2){
            return "El numero ingresado existe en el arbol";
        }
    return "El numero ingresado no existe en el arbol";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
}//fin clase ppal