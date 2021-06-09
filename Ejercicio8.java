import java.util.*;

public class Ejercicio8{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		double promedio;

		System.out.print("Ingrese un número: ");
		num1 = entrada.nextInt();
		System.out.print("Ingrese un segundo número: "); 
		num2 = entrada.nextInt();
		System.out.print("Ingrese un tercer número: ");
		num3 = entrada.nextInt();

		promedio = (double)(num1+num2+num3)/3;

		System.out.println("El promedio de los tres números ingresados es: "+promedio);
	}
}
