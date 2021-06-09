import java.util.*;

public class Ejercicio14{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1;
		int num2;
		int divisible;


		System.out.println("Ingrese 2 número para verificar si el segundo número es divisible por el primero");
		System.out.print("Número 1: ");
		num1 = entrada.nextInt();
		System.out.print("Número 2: ");
		num2 = entrada.nextInt();

		divisible = num2 % num1;
		if (divisible == 0) {
			System.out.println("Es divisible el segundo número por el primero");
		} else {
			System.out.println("No es divisble el segundo número por el primero");
		}
		
	}
}
