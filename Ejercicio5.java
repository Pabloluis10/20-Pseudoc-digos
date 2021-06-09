import java.util.Scanner;

public class Ejercicio5{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.println("Ingrese un número");
		num = entrada.nextInt();

		num = num + 1;

		System.out.println("El número siguiente al ingresado es: "+num);
	}
}
