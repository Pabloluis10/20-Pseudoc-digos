import java.util.*;

public class Ejercicio11{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double centimetros;
		double yardas;
		double metros;
		double pies;
		double pulgadas;

		System.out.println("Ingrese la medida en centímetros para combertir a yardas, metros, pies y pulgadas"); 
		centimetros = entrada.nextDouble();
		
		yardas = 0.0109361*centimetros;
		metros = 0.01*centimetros;
		pies = 0.0328084*centimetros;
		pulgadas = 0.393701*centimetros;

		System.out.println("La conversion es");
		System.out.println("Yardas: "+ yardas);
		System.out.println("Metros: "+ metros);
		System.out.println("Pies: "+ pies);
		System.out.println("Pulgadas: "+ pulgadas);
	}
}