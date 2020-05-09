package xproot;
import java.util.LinkedList;
import java.util.Queue;

public class VEDArbin<E> extends VEDArrayList<E>{
	protected E val;
	protected VEDArbin<E> der;
	protected VEDArbin<E> izq;
	
	public VEDArbin () {
	val=null;
	izq=null;
	der=null;
	}
	
	public VEDArbin (E pVal, VEDArbin<E> pIzq, VEDArbin<E> pDer)
	{
		if(pVal==null) {
			throw new NullPointerException("un árbol vacío no deveria tener raíz");
		}
		if(pIzq==null) {
			throw new NullPointerException("un árbol vacío no necesita izquierda");
		}
		if(pDer==null) {
			throw new NullPointerException("un árbol vacío no necesita derecha");
		}
		val=pVal;
		izq=pIzq;
		der=pDer;
	}
	public E getVal() 
	{
		return val;
	}
	
	public VEDArbin<E> getIzq() 
	{
		return izq;
	}
	
	public VEDArbin<E> getDer() 
	{
		return der;
	}
	
	public boolean esVacio() {
		if (val==null) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
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
	}
	
	public int peso() {
		if (esVacio()) {
			return 0;
		}
		else
		{
			return 1 + izq.peso()+ der.peso();
		}
	}
	
	public int altura(){
		if (esVacio()) {
			return 0;
		}
		else {
			return 1+Math.max(izq.altura(),der.altura());
		}
	}
	
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
	
	public VEDArrayList<E> inorden()
	{
		VEDArrayList<E> lista=new VEDArrayList<E>();
		inorden(lista);
		return lista;
	}
	
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
	}
	
	public VEDArrayList<E> postorden()
	{
		VEDArrayList<E> lista=new VEDArrayList<E>();
		postorden(lista);
		return lista;
	}
	
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
	}
	
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
	}
	
	public boolean buscar (VEDArbin<E> E, Integer element) {
		   if (!esVacio()) {
	            if (getVal()==element) {
	                return true;
	            }
	            boolean b1=false,b2= false;
	            if(izq!=null){
	                b1 = izq.buscar(izq, element);
	            }
	            if(der!=null){
	                b2 = der.buscar(der, element);
	            }
	            if(b1||b2){
	            	System.out.println("Numero encontrado "+ element);
	            	return true;
	            }
	        }
	        return false;
	    }
    }