import java.util.Scanner;

public class Ejercicio3{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		int doble, triple;

		System.out.println("Ingrese un número");
		num = entrada.nextInt();

		doble = num *2;
		triple = num *3;

		System.out.println("El doble del número ingresado es: "+doble);
		System.out.println("El triple del número ingresado es: "+triple);
	}
}
