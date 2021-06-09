import java.util.Scanner;

public class Ejercicio1{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1;
		int num2;
		int suma;

		System.out.println("Ingrese un número");
		num1 = entrada.nextInt();
		System.out.println("Ingrese otro número");
		num2 = entrada.nextInt();

		suma = num1 + num2;
		System.out.println("La suma de los números ingresados es: "+suma);
	}
}