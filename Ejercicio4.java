import java.util.Scanner;

public class Ejercicio4{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		int cuadrado, cubo;

		System.out.println("Ingrese un número");
		num = entrada.nextInt();

		cuadrado = num * num;
		cubo = num * num * num;

		System.out.println("El cuadrado del número ingresado es: "+cuadrado);
		System.out.println("El cubo del número ingresado es: "+cubo);
	}
}
