import java.util.*;

public class Ejercicio6{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		int num;

		num = aleatorio.nextInt(199)+1;

		System.out.println("El número aleatorio entre 0 y 200 es: "+num);

		num *=1.30;

		System.out.println("El número aleatorio aumetado un 30% es: "+num); 
	}
}
