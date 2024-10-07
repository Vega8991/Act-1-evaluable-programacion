package actividad1;

public class actividad1 {

	public static void main(String[] args) {
		
		//Cambiamos el tipo de variables
		
		short t = 567;
		long m = 877;
		
		//Anadimos constantes
		
		double Pi = 3.14159;
		
		/*Modificamos las conversiones de tipo
		ancho y estrecho y anadimos mas*/
		
		long tlong = t;
		short mshort = (short) m;
		char tchar = (char) t;
		int mint = (int) m;
		
		/*Imprimimos por pantalla los valores de las variables y sus
		diferentes tipos de operaciones matematicas*/
		
		System.out.println("La variable t equivale a " + t);
		System.out.println("La variable m equivale a " + m);
		System.out.println("La suma de las dos variables equivale a " + (t + m));
		System.out.println("La resta de las dos variables equivale a " + (t - m));
		System.out.println("La multiplicacion de las dos variables equivale a " + (t * m));
		System.out.println("La division de las dos variables equivale a " + (t / m));
		System.out.println("El modulo de las dos variables equivale a " + (t % m));
		System.out.println("El numero pi es: " + Pi);
	}
}