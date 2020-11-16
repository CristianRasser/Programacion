import java.util.Scanner;

public class Ejercicios {
	public static int año, a, Dias;
	public static Scanner scan = new Scanner(System.in);

	public static int parseo(String x) {
		if (x.length() > 1) {
			x = x.toLowerCase();
			switch (x) {
			case "enero":
				a = 1;
				Dias = 31;
				break;
			case "febrero":
				a = 2;
				if ((año % 100 != 0) && (año % 4 == 0)) {
					Dias = 29;    
	            } else {
	                Dias = 28;
			}
				break;
			case "marzo":
				a = 3;
				Dias = 31;
				break;
			case "abril":
				a = 4;
				Dias = 30;
				break;
			case "mayo":
				a = 5;
				Dias = 31;
				break;
			case "junio":
				a = 6;
				Dias = 30;
				break;
			case "julio":
				a = 7;
				Dias = 31;
				break;
			case "agosto":
				a = 8;
				Dias = 31;
				break;
			case "septiembre":
				a = 9;
				Dias = 30;
				break;
			case "octubre":
				a = 10;
				Dias = 31;
				break;
			case "noviembre":
				a = 11;
				Dias = 30;
				break;
			case "diciembre":
				a = 12;
				Dias = 31;
				break;
			default:
				System.out.println("ERROR!: Mes inexistente");
				return -1;
			}
		} else if (x.length() == 1) {
			a = Integer.parseInt(x);
		} else {
			return -1;
		}
		return Dias;
	}

	public static boolean ejer() {
		System.out.println("Introduzca el mes deseado");
		String x = scan.next();
		System.out.println("Intoduzca el año deseado");
		año = scan.nextInt();
		if ((año%100 != 0) && (año%4 == 0)) {
				System.out.println("El año " + año + " es bisiesto");
			} else {
				System.out.println("El año " + año + " no es bisiesto");
			}
		System.out.println(x + " tiene " + parseo(x) + " dias");
		return true;
	}

	public static void main(String[] args) {
		ejer();
	}

}
