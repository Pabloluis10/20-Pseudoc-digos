import java.util.*;

public class Ejercicio7{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		int num;

		num = aleatorio.nextInt(39)+11;

		System.out.println("El número aleatorio entre 10 y 50 : "+num);

		num *=0.85;

		System.out.println("El número aleatorio disminuido un 15% es: "+num); 
	}
}
