

package aportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {

    static Scanner entrada = new Scanner(System.in);
    static VEDArrayList<Object> lista = new ArrayList<Object>();
    static int raiz;
    private static int n;


    public static void main(String[] args) {

        do{

            Controlador.menu();
            System.out.println("");
            n = Controlador.entrada.nextInt();


            switch(n){
                case 1:
                    Controlador.nuevoNodo();
                    break;
                case 2:
                    Controlador.encadenar();
                    break;
                case 3:
                    Controlador.raiz();
                    break;
                case 4:
                    System.out.println("Digite la raiz del arbol a imprimir");
                    int n1 = Controlador.entrada.nextInt();
                    Controlador.preOrden(n1);
                    Controlador.inOrden(n1);
                    Controlador.postOrden(n1);
                    Controlador.niveles(n1);
                    break;
                case 5:
                    Controlador.busqueda();
            }

        }while(n<6);



    }

    public static void menu(){
        System.out.println("ARBOLES BINARIOS\n");
        System.out.println("1. Agregar Nodo.");
        System.out.println("2. Encadenar nodo.");
        System.out.println("3. Actualizar raiz.");
        System.out.println("4. Imprimir Arbol.");
        System.out.println("5. Buscar elemento.");
        System.out.println("Digite una opcion: \n");

    }

    public static int buscarIndex(Object valor){
        int index = -1;
        Object a;
        VEDArbin<Object> nuevoNodo = new  VEDArbin<Object>();
        for (int i = 0; i < lista.size(); i++) {
            nuevoNodo = (VEDArbin<Object>) lista.get(i);
            a =  nuevoNodo.getVal();
            if (a == valor) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static  void nuevoNodo(){
        VEDArbin<Object> nuevoNodo = new VEDArbin<Object>();
        System.out.println("Digite el valor del nuevo nodo: ");
        nuevoNodo.setVal(Controlador.entrada.nextInt());
        lista.add(nuevoNodo);
        System.out.println("Valor agregado correctamente\n");
    }

    public static void encadenar(){
        int izq, der, padre;
        VEDArbin<Object> nuevoNodo = new VEDArbin<Object>();

        System.out.println("Digite el padre: ");
        padre = Controlador.entrada.nextInt();
        System.out.println("Digite -1 para null");
        System.out.println("Digite el hijo izquierdo: ");
        izq = Controlador.entrada.nextInt();
        System.out.println("Digite -1 para null");
        System.out.println("Digite el hijo derecho: ");
        der = Controlador.entrada.nextInt();

        nuevoNodo = (VEDArbin<Object>) lista.get(buscarIndex(padre));
        if (izq>0 && buscarIndex(izq)>0) {
            nuevoNodo.setIzq((VEDArbin<Object>) lista.get(buscarIndex(izq)));
        }
        if (der>0 && buscarIndex(der)>0) {
            nuevoNodo.setDer((VEDArbin<Object>) lista.get(buscarIndex(der)));
        }

        lista.set(buscarIndex(padre), nuevoNodo);
        System.out.println("Valores encadenados correctamente\n");


    }

    public static void raiz(){
        System.out.println("Digite la nueva raiz: ");
        raiz = Controlador.entrada.nextInt();
        System.out.println("Raiz agregada correctamente\n");

    }

    public static void postOrden(int n){
        VEDArbin<Object> nuevoNodo1 = new VEDArbin<Object>();
        List<Object> L1 = new ArrayList<Object>();
        nuevoNodo1 = (VEDArbin<Object>) lista.get(buscarIndex(n));
        L1 = nuevoNodo1.postOrden();
        System.out.print("POSTORDEN:<");
        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i)+", ");
        }
        System.out.println(">");
    }
    
    public static void preOrden(int n){
        VEDArbin<Object> nuevoNodo1 = new VEDArbin<Object>();
        List<Object> L1 = new ArrayList<Object>();
        nuevoNodo1 = (VEDArbin<Object>) lista.get(buscarIndex(n));
        L1 = nuevoNodo1.preOrden();
        System.out.print("PREORDEN:<");
        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i)+", ");
        }
        System.out.println(">");
    }

    public static void inOrden(int n){
        VEDArbin<Object> nuevoNodo1 = new VEDArbin<Object>();
        List<Object> L1 = new ArrayList<Object>();
        nuevoNodo1 = (VEDArbin<Object>) lista.get(buscarIndex(n));
        L1 = nuevoNodo1.inOrden();
        System.out.print("INORDEN:<");
        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i)+", ");
        }
        System.out.println(">");
    }

    public static void niveles(int n){
        VEDArbin<Object> nuevoNodo1 = new VEDArbin<Object>();
        List<Object> L1 = new ArrayList<Object>();
        nuevoNodo1 = (VEDArbin<Object>) lista.get(buscarIndex(n));
        L1 = nuevoNodo1.niveles();
        System.out.print("NIVELES:<");
        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i)+", ");
        }
        System.out.println(">");
    }

    public static void busqueda(){
        Object x;
        int n;
        System.out.println("Digite la raiz: ");//tomar dato en pantalla
        n = Controlador.entrada.nextInt();//a n se le asigna valor
        
        System.out.println("Digite objeto a buscar");
        x=Controlador.entrada.nextInt();
        
        VEDArbin<Object> nuevoNodo1 = new VEDArbin();
        nuevoNodo1 = (VEDArbin<Object>) lista.get(buscarIndex(n));
        if(nuevoNodo1.busqueda(x)){
            System.out.println("Valor encontrado");
        }else{

            System.out.println("Valor NO encontrado");
        }

    }
}
