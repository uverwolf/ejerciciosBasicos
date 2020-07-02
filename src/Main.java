import java.util.ArrayList;
import java.util.Collections;
@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {		

		BasicJava ej1 = new BasicJava();
//		ej1.imprimirNum();
//		ej1.imprimirImpares();
//		ej1.sumaNum();
		
		ArrayList<Integer> arrayTest= new ArrayList<Integer>();
		Collections.addAll(arrayTest, 10,20,30,-10,-50,199,2,51);
		
//		Recorrer array
		ej1.recorrerArray(arrayTest);
		
//		Buscar Mayor
		System.out.println(ej1.mayor(arrayTest));
//		
////		Sacar promedio
		System.out.println(ej1.promedio(arrayTest));
//		
//		//ArregloImpares
		ej1.arregloCreado();
		
//		Contar Mayores que el parametro numero dado
		ej1.contarMayores(arrayTest, 1);
		
//		multiplica los valores del array al cuadrado
		ej1.alCuadrado(arrayTest);
		
//		Eliminar numeros negativos
		ej1.eliminarNegativos(arrayTest);
		
		//avg,min,max
		ej1.minMaxAvg(arrayTest);
		
		ej1.cambiarValores(arrayTest);
		
		
	
	}

}
