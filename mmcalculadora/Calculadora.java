package mmcalculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void menu() {
		System.out.println("\nCALCULADORA\n");
		System.out.println("sumar - 1");
		System.out.println("restar - 2");
		System.out.println("multiplicar - 3");
		System.out.println("dividir - 4");
		System.out.println("finalizar - 0\n");
	}

	/**
	 * float sumar(float n1,float n2)
	 * suma 2 números decimales
	 * @param n1
	 * @param n2
	 * @return la suma de n1 y n2
	 */
	public float sumar(float n1, float n2) {
		return n1 + n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1 = 0.0f;
		float n2 = 0.0f;
		float res = 0.0f;
		boolean continuar = true;
		char opcion = ' ';
		Calculadora calculadora = new Calculadora();
		while(continuar) {
			do {
				menu();
				opcion=sc.next().charAt(0);
				System.out.println("Opción: "+opcion);
			}while(opcion<'0' || opcion>'4');
			if(opcion=='0') continuar = false;
			else {
				System.out.println("n1?");
				try {
					n1=sc.nextFloat();
				}
				catch(Exception e) {
					System.out.println(e.toString());
				}
				finally {
					n1=0.0f;
				}
				System.out.println("n2?");
				try {
					n2=sc.nextFloat();
				}
				catch(Exception e) {
					System.out.println(e.toString());
				}
				finally {
					n2=0.0f;
				}
				switch(opcion) {
					case '1':
						res = calculadora.sumar(n1,n2);
						break;
					case '2':
						res = calculadora.restar(n1,n2);
						break;
					case '3':
						res = calculadora.multiplicar(n1,n2);
						break;
					case '4':
						res = calculadora.dividir(n1,n2);
						break;
				}
			}
			System.out.println("Resultado: "+res);
		}
		
	}

	private float dividir(float n1, float n2) {
		float res = 0.0f;
		try {
			res=n1/n2;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return res;
	}

	private float multiplicar(float n1, float n2) {
		return n1*n2;
	}

	private float restar(float n1, float n2) {
		return n1-n2;
	}

}
