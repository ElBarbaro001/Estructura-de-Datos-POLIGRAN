package xproot;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class VEDArbinOrdenado<E> extends VEDArbin<E> implements Set <E> {
	
	public VEDArbinOrdenado() {//figura 3 constructor
		super();
	}
	public VEDArbinOrdenado(Collection<? extends E> coll) {
		super();
		addAll(coll);
	}
	
	public void clear() {//figura 4 destructor
		val=null;
		izq=null;
		der=null;
	}
	
	public VEDArbinOrdenado<E> getIzq(){//figura 5 consultar subarbol izquierdo
		return (VEDArbinOrdenado<E>) izq;
	}
	public VEDArbinOrdenado<E> getDer(){//figura 6 consultar subarbol derecho
		return (VEDArbinOrdenado<E>) der;
	}
	
	public boolean isEmpty() {//figura 7 arbol vacio
		return esVacio();
	}
	
	public int size() {//figura 8 numero de eltos dentro del arbol
		return peso();
	}
	
	public boolean contains(Object obj) {//igura 9 buscar elto dentro del arbol
		if(esVacio()) {
			return false;
		}
		else {
			Comparable<E> x=(Comparable<E>) obj;
			int c=x.compareTo(val);
			if(c==0) {
				return true;
			}
			else if(c<0) {
				return getIzq().contains(obj);
			}
			else {
				return getDer().contains(obj);
			}
		}
	}

     public boolean  add (E element) {//figura 10 insertar elementos al arbol
          if(esVacio()) {
              val=element;
              izq=new VEDArbinOrdenado<E>();
              der=new VEDArbinOrdenado<E>();
              return true;
          }
          else {
              Comparable<E> x=(Comparable<E>) element;
              int c=x.compareTo(val);
              if(c==0) {
            	  return false;
              }
              else if (c<0) {
                  return  getIzq().add(element);
              }
              else {
                  return getDer().add(element);
              }
          }
      }
     
	public E max() {//figura 11 Valor mayor dentro del arbol
		if(esVacio()) {
			return null;
		}
		else {
			if(der.esVacio()) {
				return val;
			}
			else {
				return getDer().max();
			}
		}
	}
	
	public boolean remove(Object obj) {//figura 12 eleminar un elto de un arbol
		if(esVacio()) {
			return false;
		}
		else {
			Comparable<E> x =(Comparable<E>) obj;
			int c=x.compareTo(val);
			if(c==0) {
				if(esHoja()) {
					val=null;
					izq=null;
					der=null;
				}
				else if(izq.esVacio()) {
					VEDArbinOrdenado<E> temporal=getDer();
					val=temporal.val;
					izq=temporal.izq;
					der=temporal.der;
				}
				else if(der.esVacio()) {
					VEDArbinOrdenado<E> temporal=getIzq();
					val=temporal.val;
					izq=temporal.izq;
					der=temporal.der;
				}
				else {
					E m=getIzq().max();
					val=m;
					getIzq().remove(m);
				}
				return true;
			}
			else if (c<0) {
				return getIzq().remove(obj);
			}
			else {
				return getDer().remove(obj);
			}
		}
	}
	
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	public <T> T[] toArray(T[] arg0pro) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}