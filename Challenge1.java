package Minireto;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge1 {

	
	//Metodo 1
	public static String generateString(String type) {

		String stringStart = "";
		if (type.equals("Tipo A")) {

			stringStart = "54";

		} else if (type.equals("Tipo B")) {
			stringStart = "08";

		}

		String string = "";
		for (int i = 0; i < 8; i++) {

			int numero = (int) (Math.random() * 10);
			string = string + String.valueOf(numero);
		}

		string = stringStart + string;
		return string;

	}

	//Metodo 2
	public static boolean checkList(String string, List<String> list) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).equals(string)) {
				return false;
			}

		}

		return true;
	}

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el tipo: ");
		String tipo = scanner.nextLine();
		String cadena = generateString(tipo);
		System.out.println("La cadena es: ");
		System.out.println(cadena);

		String string = "1";
		List<String> lista = Arrays.asList("1", "2", "3");
		boolean resultado1 = checkList(string, lista);
		string = "4";
		boolean resultado2 = checkList(string, lista);
		System.out.println("Result : " + resultado1);
		System.out.println("Result: " + resultado2);

	}
}
