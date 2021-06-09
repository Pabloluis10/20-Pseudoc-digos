import java.util.*;

public class Ejercicio16{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1;
		int num2;
		int num3;

		System.out.print("Ingrese un número: ");
		num1 = entrada.nextInt();
		System.out.print("Ingrese un segundo número: ");
		num2 = entrada.nextInt();
		System.out.print("Ingrese un tercer número: ");
		num3 = entrada.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("El primer número ingresado es el mayor: "+num1);
		} else  if (num2 > num1 && num2 > num3) {
			System.out.println("El segundo número ingresado es el mayor: "+num2);
		} else {
			System.out.println("El tercer número ingresado es el mayor: "+num3);
		}
	}
}
