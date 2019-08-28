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
		Scanner sc = new Scanner(System.in);
		float n1 = 0.0f;
		float n2 = 0.0f;
		boolean continuar = true;
		while(continuar) {
			Calculadora.menu();
		}
		
	}

}
