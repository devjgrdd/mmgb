package mmcalculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void menu() {
		System.out.println("\nCALCULADORA\n");
		System.out.println("sumar - s");
		System.out.println("restar - r");
		System.out.println("multiplicar - m");
		System.out.println("dividir - d\n");
	}

	public static void main(String[] args) {
		Calculadora.menu();
		Scanner sc = new Scanner(System.in);
		float n1 = 0.0f;
		n1 = sc.nextFloat();
		System.out.println(n1);
	}

}
