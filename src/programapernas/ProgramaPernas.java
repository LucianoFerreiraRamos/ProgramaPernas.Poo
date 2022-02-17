package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantas pernas ? ");
		int perna = teclado.nextInt();
		String tipo;
		System.out.print("isso é um(a) ");
		switch (perna) {
		case 1:
			tipo = "Saci ";
			break;
		case 2:
			tipo = "Bipede";
			break;
		case 4:
			tipo = "Quadrupede";
			break;
		case 8:
			tipo = "Aranha";
			break;		
		default:
			tipo = "ET ";
			break;
		}
		System.out.println(tipo);

	}

}
