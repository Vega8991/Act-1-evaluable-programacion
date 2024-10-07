package actividad1;

public class actividad1 {

	public static void main(String[] args) {
		
		//Definimos las variables
		
		int t = 567;
		int m = 877;
		
		//Incluimos conversiones de tipo ancho y estrecho
		
		long tlong = t;
		short mshort = (short) m;
		
		/*Imprimimos por pantalla los valores de las variables y sus
		diferentes tipos de operaciones matematicas*/
		
		System.out.println("La variable t equivale a " + t);
		System.out.println("La variable m equivale a " + m);
		System.out.println("La suma de las dos variables equivale a " + (t + m));
		System.out.println("La resta de las dos variables equivale a " + (t - m));
		System.out.println("La multiplicación de las dos variables equivale a " + (t * m));
		System.out.println("La división de las dos variables equivale a " + (t / m));
		System.out.println("El módulo de las dos variables equivale a " + (t % m));
	}
}