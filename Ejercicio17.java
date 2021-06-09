import java.util.*;

public class Ejercicio17{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int lado1;
		int lado2;
		int lado3;

		System.out.println("Que tipo de triangulo es:");
		System.out.print("Ingrese el lado 1 del triangulo: ");
		lado1 = entrada.nextInt();
		System.out.print("Ingrese el lado 2 del triangulo: ");
		lado2 = entrada.nextInt();
		System.out.print("Ingrese el lado 3 del triangulo: ");
		lado3 = entrada.nextInt();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("El triangulo ingresado es <<Equilateroa>>");
		} else  if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("El triangulo ingresado es <<Isósceles>>");
		} else {
			System.out.println("El triangulo ingresado es <<Escaleno>> ");
		}
	}
}
