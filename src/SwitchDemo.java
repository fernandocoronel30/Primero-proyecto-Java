import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el mes: ");
		int month = sc.nextInt();
		String monthString;
		
		switch(month) {
		case 1 : monthString = "Enero";
		break;
		case 2 : monthString = "Febrero";
		break;
		case 3 : monthString = "Marzo";
		break;
		case 4 : monthString = "Abril";
		break;
		case 5 : monthString = "Mayo";
		break;
		case 6 : monthString = "Junio";
		break;
		case 7 : monthString = "Julio";
		break;
		case 8 : monthString = "Agosto";
		break;
		case 9 : monthString = "Septiembre";
		break;
		case 10 : monthString = "Octubre";
		break;
		case 11 : monthString = "Noviembre";
		break;
		case 12 : monthString = "Diciembre";
		break;
		default:
			monthString = "Mes incorrecto";
			break;
		}//swtich
		System.out.println(monthString);
		sc.close();//Es opcional
	}//main
}//class SwitchDemo
