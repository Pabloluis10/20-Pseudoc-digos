import java.util.Scanner;

public class Ejercicio2{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String pais;
		String capital;

		System.out.println("Ingrese un país");
		pais = entrada.nextLine();
		System.out.println("Ingrese otro número");
		capital = entrada.nextLine();

		System.out.println(capital+" Es la capital de "+pais);
	}
}