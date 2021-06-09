import java.util.*;

public class Ejercicio20{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String numero;
 		int num;
 		int d1 = 0;
 		int d2 = 0;
 		int d4 = 0;
 		int d5 = 0;
		
		System.out.println("Ingrese un número de 5 dígitos: ");
		num = entrada.nextInt();
		numero = num+""; 

		if(num <10000 || num>99999){
			System.out.println("Usted no ingreso un númeor de 5 digitos");
		} else {
			d1 = Integer.valueOf(Character.getNumericValue(numero.charAt(0)));
			d2 = Integer.valueOf(Character.getNumericValue(numero.charAt(1)));
			d4 = Integer.valueOf(Character.getNumericValue(numero.charAt(3)));
			d5 = Integer.valueOf(Character.getNumericValue(numero.charAt(4)));

			if(d1 == d5 &&  d2 == d4){
				System.out.println("El número ingresado es capicúa");
			}else{
				System.out.println("El número ingresado no es capicúa");
			}
		}
	}
}
