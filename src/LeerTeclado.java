import java.util.Scanner;

public class LeerTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe un número entero : ");
		int num = sc.nextInt();
		
		System.out.println("Tu numero es: " + num);
		
		//Leer un double
		System.out.println("Escribe un numero double: ");
		double numDouble = sc.nextDouble();
		System.out.println("Tu numero decimal es: " + numDouble);
		
		//Leer un String
		System.out.println("Escribe un texto: ");
		//Funciona el nextLine si esta despues del Scanner sc = new Scanner
		//String texto = sc.nextLine();
		String texto = sc.next();
		System.out.println("Tu texto es: " + texto);
		
		
	}//main
}//class LeerTeclado
