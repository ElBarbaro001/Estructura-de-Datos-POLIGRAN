package JAVA_course;
import java.util.*;
public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Empleado lista[]= new Empleado[3];
		lista[0]= new Empleado("Ana",45,2500);
		lista[1]= new Empleado("Antonio",55,2000);
		lista[2]= new Empleado("Maria",25,2600);
		
		System.out.println(lista[0].dameDatos());
		System.out.println("Imprimir todos los datos mediante un ciclo");
		for(Empleado e:lista) {
			System.out.println(e.dameDatos());
		}
		*/
		
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		lista.ensureCapacity(11);//Crear arraylist de 11 elementos sirve para optimizar el uso de memoria
		lista.add(new Empleado("Ana",45,2500));
		lista.add(new Empleado("Antonio",55,2000));
		lista.add(new Empleado("Maria",25,2600));
		for(Empleado e:lista) {
			System.out.println(e.dameDatos());
		}
		System.out.println(lista.size());
	}
}