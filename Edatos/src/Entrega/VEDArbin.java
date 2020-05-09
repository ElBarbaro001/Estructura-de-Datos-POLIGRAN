package Entrega;
import java.util.LinkedList;
import java.util.Queue;

public class VEDArbin <E>{
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
		
		public boolean buscar(VEDArbin<Integer> valor, Integer Key) {
			if(valor==null)
				return false;
			if(valor.val == Key)
				return true;
			boolean sw1=false,sw2=false;
			if(izq!=null) {
				sw1=izq.buscar(valor.izq, Key);
			}
			if(der!=null) {
				sw2=der.buscar(valor.der, Key);
			}
			if(sw1||sw2) {
				return true;
			}
				return false;
		}
}