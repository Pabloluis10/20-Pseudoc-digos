import java.util.*;

public class Ejercicio13{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double radio;
		double altura;
		double volumen;


		System.out.println("Para calcular el volumen del cilindro ingrese");
		System.out.print("Radio del cilindro: ");
		radio = entrada.nextDouble();
		System.out.print("Altura del cilindro: ");
		altura = entrada.nextDouble();

		if (radio > 0 && altura > 0) {
			volumen = 3.141592654*radio*radio*altura;
			System.out.println("El volumen del cilindro ingresado es: "+volumen);
		} else {
			System.out.println("No a ingresado datos positivos");
		}
		
	}
}
