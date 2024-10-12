import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el mes: ");
		int month = sc.nextInt();
		//expresion switch, se declara de la siguiente forma
		//tipo de dato nombre de la variable = switch(expresion)
		String monthString = switch(month) {		
		case 1 -> "Enero";
		case 2 -> "Febrero";
		case 3 -> "Marzo";
		case 4 -> "Abril";
		case 5 -> "Mayo";
		case 6 -> "Junio";
		case 7 -> "Julio";
		case 8 -> "Agosto";
		case 9 -> "Septiembre";
		case 10 -> "Octubre";
		case 11 -> "Noviembre";
		case 12 -> "Diciembre";
		default -> "Mes incorrecto";
		};
		System.out.println(monthString);
		sc.close();//Es opcional
	}//main
}//class SwitchDemo
