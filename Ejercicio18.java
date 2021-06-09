import java.util.*;

public class Ejercicio18{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		String numero;
		int d1=0, d2=0, d3=0, d4=0;
		int suma;

		System.out.println("Ingrese un número que no seam mayor a 4 digitos");
		System.out.print("Ingrese número: ");
		numero = entrada.next();
		num = Integer.valueOf(numero);

		if(num > 9999){
			System.out.println("Usted ingreso un número mayor a 4 digitos");
		} else if (num > 999) {
			d1 = Character.getNumericValue(numero.charAt(0));
			d2 = Character.getNumericValue(numero.charAt(1));
			d3 = Character.getNumericValue(numero.charAt(2));
			d4 = Character.getNumericValue(numero.charAt(3));
			System.out.println("Los digitos del número ingresado son: "+d1+", "+d2+", "+d3+", "+d4);
		} else if( num > 99) {
			d1 = 0;
			d2 = Character.getNumericValue(numero.charAt(0));
			d3 = Character.getNumericValue(numero.charAt(1));
			d4 = Character.getNumericValue(numero.charAt(2));
			System.out.println("Los digitos del número ingresado son: "+d1+", "+d2+", "+d3+", "+d4);
		} else if(num > 9) {
			d1 = 0;
			d2 = 0;
			d3 = Character.getNumericValue(numero.charAt(0));
			d4 = Character.getNumericValue(numero.charAt(1));
			System.out.println("Los digitos del número ingresado son: "+d1+", "+d2+", "+d3+", "+d4);
		} else {
			d1 = 0;
			d2 = 0;
			d3 = 0;
			d4 = Character.getNumericValue(numero.charAt(0));
			System.out.println("Los digitos del número ingresado son: "+d1+", "+d2+", "+d3+", "+d4);
		}

		suma = d1+d2+d3+d4;
		System.out.println("La suma de los digitos es: "+suma);
	}
}
