
package aportes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class VEDArbin<E> {

    protected E val = null;
    protected VEDArbin<E> der;
    protected VEDArbin<E> izq;

    @Override
    public String toString() {
        return "VEDArbin{" + "val=" + val + '}';
    }

    public void setVal(E val) {
        this.val = val;
    }

    public void setDer(VEDArbin<E> der) {
        this.der = der;
    }

    public void setIzq(VEDArbin<E> izq) {
        this.izq = izq;
    }

    public VEDArbin() {
        val = null;
        izq = null;
        der = null;

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

    public VEDArbin<E> getDer() {
        return der;
    }

    public VEDArbin<E> getIzq() {
        return izq;
    }

    public boolean esVacio(){
        return val == null;

    }

    public boolean esHoja(){

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


    public List<E> preOrden(){
        List<E> lista = new ArrayList<E>();
        preOrden(lista);
        return lista;

    }

    private void preOrden(List<E> pLista){
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

    public List<E> inOrden(){
        List<E> lista = new ArrayList<E>();
        inOrden(lista);
        return lista;

    }

    private void inOrden(List<E> pLista){
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


    public List<E> postOrden(){
        List<E> lista = new ArrayList<E>();
        postOrden(lista);
        return lista;

    }

    private void postOrden(List<E> pLista){
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



    public List<E> niveles(){
        List<E> lista = new ArrayList<E>();
        niveles(lista);
        return lista;

    }

    public List<E> niveles(List<E> lista){
        Queue<VEDArbin<E>> cola = new LinkedList<VEDArbin<E>>();
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


}



