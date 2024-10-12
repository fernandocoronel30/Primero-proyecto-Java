import java.util.Scanner;

public class SwitchDemo3 {
	public static void main(String[] args) {
		//Número de días que tiene un mes
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el número del mes (1-12): ");
		int month = sc.nextInt();
		String dias;
		
		//switch que compare el número del mes y que regrese el número de días de ese mes		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			dias = "31";
			break;
		case 4, 6, 9, 11:
			dias = "30";
			break;
		case 2:
			dias = "28/29";
			break;
		default:
			dias = "Mes incorrecto";
			break;
		}//swtich
		System.out.println(dias);
		
		sc.close();
	}//main
}//class SwitchDemo3
