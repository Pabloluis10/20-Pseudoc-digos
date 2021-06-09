import java.util.*;

public class Ejercicio10{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int base;
		int altura;
		int area, perimetro;

		System.out.println("Para calcular el árera y perímetro del rectangulo ingrese.");
		System.out.print("Ingrese la base del triangulo: "); 
		base = entrada.nextInt();
		System.out.print("Ingrese la altura: ");
		altura = entrada.nextInt();
		
		area = base * altura;
		perimetro = 2*base + 2*altura;

		System.out.println("El perimetro del rectangulo es: "+perimetro);
		System.out.println("El área del rectangulo es: "+ area);
	}
}