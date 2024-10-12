// TODO sirve para hacer notas de la lista de pendientes que tengas por hacer
/*
 * Esta es la primera aplicación de java en el bootcamp
 * Generation México 
 * 2024/09/09
 * */

public class Prueba {

	public static void main(String[] args) {
		// Definicion de una variable ejemplo:
		// tipo de dato + nombre de la variable = valor;
		byte num1 = 10, num2 = 20, num3 = 30;
		byte edad = 127;
		byte Edad = 127;
		short suma = edad;
		int resultado = 96;
		byte otro = (byte) resultado;// Conversion implícita

		long enterolargo = 567;
		short enterocorto = (short) enterolargo;// Conversion Explícita

		final double PI = 3.1415962;// final:es para decir que es una constante
		// float IVA = (float) 0.16;
		//Por default cualquier numero escrito con punto decimal es un double.
		float IVA = 0.16F;// f o F: Hace la conversion de un float
		long km = 13164984654L;//L: Hace la conversion a long
		//Por default cualquier numero entero escrito en el codigo es un int.
		
		char letraInicial = '\u007F';//Imprime un caracter del codigo unicode.
		
		boolean flag = false;
		flag = (enterolargo == enterocorto) && (resultado == otro);
		
		System.out.println(enterocorto);
		System.out.println(flag);
		System.out.println(letraInicial);

		System.out.println("Hola CH-45");

	}// main

}// class Prueba
