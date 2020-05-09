package Entrega;

public class VEDArrayList<E> implements VEDLista<E> {
	private Object[] arreglo=new Object[1];
	public int tamanho=0;
	public VEDArrayList() {
		
	}//fin
	public void clear() {
		for (int i=0;i<tamanho;i++) {
			arreglo[i]=0;
		}
		tamanho=0;
	}//fin clear
	public int gettam() {
		return tamanho;
	}//fin gettam
	
	public E get(int index) {//Buscar elemento dentro de una lista
		Object elemento=arreglo [index];
		return (E)elemento;
	}//fin
	
	
	public E set(int index, E element) {//modificar dato en nodo
		E anteriorValor=get(index);
		arreglo[index]=element;
		return anteriorValor;
	}//fin
	private void garantizarCapacidad(int nuevaCantidadDeElementos) {
		if(nuevaCantidadDeElementos<=arreglo.length) {
		}
		else {
			if(nuevaCantidadDeElementos<arreglo.length*2) {
				nuevaCantidadDeElementos=arreglo.length*2;
			}
			Object[] nuevoArreglo=new Object[nuevaCantidadDeElementos];
			for (int i=0;i<tamanho;i++) {
				nuevoArreglo[i]=arreglo[i];
			}
			arreglo=nuevoArreglo;
		}
	}//fin
	public void add(int index, E element) {
		garantizarCapacidad(tamanho+1);
		for(int i=tamanho-1; i>index; i--) {
			arreglo[i+1]=arreglo[i];			
		}
		arreglo[index]=element;
		tamanho ++;
	}//fin
	public void add(E element) {
		garantizarCapacidad(tamanho+1);
		arreglo[tamanho]=element;
		tamanho ++;
	}//fin
	public E remove(int index) {
		E elemento=get(index);
		for(int i=index+1; i<tamanho; i++){
			arreglo[i+1]=arreglo[i];
		}
		arreglo[tamanho-1]=null;
		tamanho --;
		return elemento;
	}//fin
	public boolean contains(int buscar_numero) {
		// TODO Auto-generated method stub
		return (Boolean) null;
	}
	
}