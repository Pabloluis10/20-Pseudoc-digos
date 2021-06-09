import java.util.*;

public class Ejercicio12{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double temperatura;
		double fahrenheit;

		System.out.println("Ingrese una temperatura en celsius para combertir a fahrenheit"); 
		temperatura = entrada.nextDouble();
		
		fahrenheit = (temperatura*1.8)+32;

		System.out.println("La conversion es");
		System.out.println("Fahrenheit: "+ fahrenheit);
	}
}