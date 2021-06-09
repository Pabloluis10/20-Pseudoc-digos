import java.util.*;

public class Ejercicio15{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1;

		System.out.print("Ingrese un número: ");
		num1 = entrada.nextInt();
		
		if (num1 > 0) {
			System.out.println("El número ingresado es positivo");
		} else  if (num1 == 0) {
			System.out.println("El número ingresado es nulo");
		} else {
			System.out.println("El número ingresado es negativo");
		}
	}
}
