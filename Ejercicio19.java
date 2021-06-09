import java.util.*;

public class Ejercicio19{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random aleatroio = new Random();

 		int num;
 		int multiplo;

 		num = aleatroio.nextInt(1000)+1;
		
		System.out.println("El número aleatroio generado es: "+num);

		multiplo = num % 5;

		if(multiplo != 0 && num < 26) {
			System.out.println("Correcto el número es multiplo del 5 y se encuentra entre los primero s 25 números");
		} else {
			System.out.println("Incorrecto el número no es multiplo del 5 o no se encuentra en los primeros 25 números");
		}
	}
}
