package Minireto;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge1 {

	public static String generateString(String type) {

		String stringStart = "";
		if (type.equals("Tipo A")) {

			stringStart = "54";

		} else if (type.equals("Tipo B")) {
			stringStart = "08";

		}

		String string = "";
		for (int i = 0; i < 8; i++) {

			int numero = (int) (Math.random() * 9);
			string = string + String.valueOf(numero);
		}

		string = stringStart + string;
		return string;

	}

	public static boolean checkListShort(String string, List<String> list) {
		return !list.contains(string);
	}

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
		System.out.print("Ingresa el tipo: ");
		String tipo = scanner.nextLine();
		String cadena = generarCadena(tipo);
		System.out.print("La cadena es: ");
		System.out.print(cadena);

		String string = "1";
		List<String> lista = Arrays.asList("1", "2", "3");
		boolean resultadoCorto = chequearListaCorto(string, lista);
		boolean resultadoLargo = checkList(string, lista);
		System.out.print("Result : " + resultadoCorto);
		System.out.println();
		System.out.print("Result: " + resultadoLargo);

	}
}
