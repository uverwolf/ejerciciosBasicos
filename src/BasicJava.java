import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("unused")
public class BasicJava {
//	Ejercicio 1
	public void imprimirNum() {
		int i = 1;
		while(i<=255) {
			System.out.println(i);
			i++;
		}
	}
//Ejercicio 2
	public void imprimirImpares() {
		for(int i=0; i<255;i++) {
			if(i%2>0) {
				System.out.println(i);
			}
		}
	}
//	Ejercicio 3
	public void sumaNum() {
		int i=0;
		int suma =0;
		while( i<255) {
			
			System.out.println("Nuevo Numero: "+i+" Suma: "+suma);	
			i++;
			suma+=i;
		}
	}
//	Recorrer Array
	public void recorrerArray(ArrayList<Integer> arrayTest) {
		for(Integer i: arrayTest) {
			System.out.println(i);
		}
		
	}
	public String mayor(ArrayList<Integer>arrayTest) {
		
//		return Collections.max(arrayTest);
		int mayor=arrayTest.get(0);
		
		for(int i=0;i<arrayTest.size();i++) {			
			
			if(arrayTest.get(i)>mayor) {
				mayor = arrayTest.get(i);				 
			}
		}
		
	return "El numero mayor es: "+mayor;
	}
//	Promedio
	public String promedio(ArrayList<Integer>arrayTest) {
		int total=0,promedio =0;
		for(int contador=0;contador<arrayTest.size();contador++) {
			total +=arrayTest.get(contador);
			promedio = total/ arrayTest.size();
		}
		return "el promedio del arreglo es"+promedio;
	}
//	Arreglo Impares
	public void arregloCreado() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		for(int i =0; i<=255;i++) {
			if(i%2>0) {
				y.add(i);			
			}
		}
		for(int i: y) {
			System.out.println("Numero en el array: "+i);
		}
		System.out.println("Tamaño del array: "+y.size());
	
	}
//	Contar numeros mayores que el entregado
	public void contarMayores(ArrayList<Integer>arrayTest,int numero) {
		
		int contador=0;
		
		for(int i =0;i<arrayTest.size();i++) {
			
			if(arrayTest.get(i)>numero) {
				contador = contador+1;
			}
		}
		System.out.println(contador);
	}
//	Arreglo al cuadrado
	
	public void alCuadrado( ArrayList<Integer> arrayTest) {
		for(int i: arrayTest) {
			i*=i;
			System.out.println(i);
		}
	}
//	cambiar numeros negativos
	public void eliminarNegativos(ArrayList<Integer>arrayTest) {
		
		for(int i=0;i<arrayTest.size();i++) {
			if(arrayTest.get(i)<0) {
				
				arrayTest.set(i, 0);
			}
		}
		for(int i: arrayTest) {
			System.out.println(i);
		}
		
	}
//	Minimo ,maximo, promedio en un arreglo
	
	public void minMaxAvg(ArrayList<Integer>arrayTest) {
		int minimo=arrayTest.get(0),max=arrayTest.get(0),promedio=0,total=0;
		
		for(int i=0;i<arrayTest.size();i++) {
			total+=arrayTest.get(i);
			promedio= total/arrayTest.size();
			
			//Maximo
			if (arrayTest.get(i)>max) {
				
				max=arrayTest.get(i);
				
				
			}else if(arrayTest.get(i)<minimo){
				minimo =arrayTest.get(i);
			}
		}
		ArrayList<Integer> avg = new ArrayList<Integer>();
		System.out.println("Valor minimo: "+minimo+"\nValor maximo: "+max+"\n Promedio: "+promedio);
		avg.add(max);
		avg.add(minimo);
		avg.add(promedio);
		
		System.out.println("Tamaño resultante del array creado: "+avg.size());
		for(int arrayNuevo: avg) {
			System.out.println(arrayNuevo);
		}
		
	}
	
	public void cambiarValores(ArrayList<Integer> arrayTest) {
		
		for(int i=0;i<arrayTest.size();i++) {
			try {
				arrayTest.set(i, arrayTest.get(i+1));
			} catch (Exception e) {
				arrayTest.set(i, 0);
				
			}
			System.out.println(arrayTest.get(i));
		}

			
	
	
	}
}
