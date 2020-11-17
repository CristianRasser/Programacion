package ejercicios;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
public class pruebas {
	public static Scanner scan = new Scanner(System.in);
	public static int año,a , Dias;
		public static int parseo(String x) { //Parseo de las opciones de los meses para que lo coja tambien en letra
			if (x.length() > 1) {
				x = x.toLowerCase();
				switch (x) {
				case "enero":
					a = 1;
					Dias = 31;
					break;
				case "febrero":
					a = 2;
					if (bisiesto()) {
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

		public static boolean ejer() { //Feedback del ejercicio 1
			System.out.println("Introduzca el mes deseado");
			String x = scan.next();
			System.out.println("Intoduzca el año deseado");
			año = scan.nextInt();
			if (a > 12) {
				System.out.println("Mes inexistente");
			}
			if (bisiesto()) {
					System.out.println("El año " + año + " es bisiesto \n");
				} else {
					System.out.println("El año " + año + " no es bisiesto \n");
				}
			System.out.println(x + " tiene " + Dias + " dias \n");
			return true;
		}

		public static boolean bisiesto() {
			if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
				System.out.println("El año es bisiesto");
			else
				System.out.println("El año no es bisiesto");
			return true;
		}
		
		public static BigInteger Combinat(long m, long n) { //funcion para conseguir el numero combinatorio de m y n
			
	    BigInteger operacion;
	    BigInteger factorialm = BigInteger.valueOf(m);
	    BigInteger factorialn = BigInteger.valueOf(n);
	    BigInteger factorialmn = BigInteger.valueOf(m - n);

	    int mn = (int) (m - n);

	    for (int a = (int) (m - 1); a >= 1; a--) {
	        factorialm = factorialm.multiply(BigInteger.valueOf(a));
	    }
	    for (int b = (int) (n - 1); b >= 1; b--) {
	        factorialn = factorialn.multiply(BigInteger.valueOf(b));
	    }
	    if (mn > 2) {
	        for (int c = mn - 1; c >= 1; c--) {
	            factorialmn = factorialmn.multiply(BigInteger.valueOf(c));
	        }
	    } else {
	        factorialmn = BigInteger.valueOf(mn);
	    }
	    operacion = factorialm.divide(factorialn.multiply(factorialmn));

	    return operacion;
	}
	
	public static void ejer2() { //Feedback del ejercicio 2
	    int n=0,m=0;
	    System.out.println("Escribe un numero:");
	    m = scan.nextInt();

	    System.out.println("Escribe otro numero:");
	    n = scan.nextInt();
	    if(m>n) {
	    System.out.println("El resultado de la funcion combinatoria es: "+Combinat(m,n));
	    }
	    else {
	        System.out.println("El valor de M debe ser mayor a N. \n Reinicia el programa \n\n\n");
	    }
	}
	
	public static int perfecto() { //Calculo de si un numero es perfecto o no
		int n, suma = 0;
   		System.out.println("Introduce un numero: ");
           n = scan.nextInt();
           for (int i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
               if (n % i == 0) {
                   suma = suma + i;   // si es divisor se suma
               }
           }
           if (suma == n) {           // si el numero es igual a la suma de sus divisores es perfecto                
               System.out.println("Perfecto");
           } else {
               System.out.println("No es perfecto");
           }
           return suma;
	}
	
//	public static boolean hola() {
//		
//	}
//	
	public static void main(String[] args) { //Menú
	    	System.out.println("HOLA! Bienvenido a la práctica 2 \n");
	    	scan = new Scanner(System.in);
	        boolean salir = false;
	        int opcion;
	        while (!salir) {
	        	System.out.println("Menú de opciones:");
	            System.out.println("1. Opcion 1");
	            System.out.println("2. Opcion 2");
	            System.out.println("3. Opcion 3");
	            System.out.println("4. Salir");
	            try 
	            {System.out.println("Escribe una de las opciones");
	              opcion = scan.nextInt();
	                switch (opcion) {
	                case 1:
	            	   ejer();
	                	break;
	                case 2:
	                	ejer2();
	                 	break;
	                case 3:
	                	perfecto();
	                	break;
	                case 4:
	                    salir = true;
	                    break;
	                default:
	                    System.out.println("Solo números entre 1 y 4, gracias :) ");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                scan.next();
	            }
	        }
	    }
	}