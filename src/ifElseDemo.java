import java.util.Scanner;

public class ifElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el número de tu calificacion: ");
		int testScore = sc.nextInt();
		char grade;
		
		if((testScore >= 90) && (testScore <= 100)) {
			grade = 'A';
		}else if((testScore >= 80) && (testScore < 90)) {
			grade = 'B';
		}else if((testScore >= 70) && (testScore < 80)){
			grade = 'C';
		}else if((testScore >= 60) && (testScore < 70)) {
			grade = 'D';
		}else if((testScore > 0) && (testScore < 60)) {
			grade = 'F';
		}else {
			System.out.println("Calificacion no válida");
			grade = ' ';
		}//else
		
		System.out.println("Grade = " + grade);
		sc.close();//Cerrarlo es opcional
	}//main
}//class ifElseDemo
