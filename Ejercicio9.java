import java.util.*;

public class Ejercicio9{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String palabraA;
		String palabraB;
		String aux;

		System.out.print("Ingrese un palabra (A): ");
		palabraA = entrada.nextLine();
		System.out.print("Ingrese otra palabra (B): "); 
		palabraB = entrada.nextLine();

		aux = palabraA;
		palabraA = palabraB;
		palabraB = aux;

		System.out.println("Se han intercambiado las palabras ahora");
		System.out.println("La palabra A es: "+palabraA);
		System.out.println("La palabra B es: "+palabraB);
	}
}
