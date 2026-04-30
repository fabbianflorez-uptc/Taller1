//---------------------------------------//
//--FABIAN LEONARDO FLOREZ GONZALEZ------//
//---CODIGO 202614060--------------------//
//---------------------------------:D----//
package repasoFor;

public class repasoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" - - pto 1 y 2 - - ");
		//1. imprimir los numeros del 1 al 10
		System.out.println("del 1 al 10:");
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//2. imprimir del 10 al 1 en cuenta regresiva
		System.out.println("ahora pa tras:");
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("\n >>> punto 8 fibonacci <<<<");
		//8. imprimir los primeros 10 terminos de fibonacci
		int  a= 0;
		int b = 1;
		for(int i = 0; i < 10; i++) {
			System.out.print(a + " ");
			int aux = a + b;
			a = b;
			b = aux;
		}
		System.out.println();
		
		System.out.println("\n  --- pto 12 y 13 : el cuadradito ---");
		//12. imprimir un cuadrado de asteriscos 5x5 con for anidado
		for(int  i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println(); 
		}
		
		System.out.println();
		//13. imprimir un triangulo que empiece en 1 asterisco y llegue a 5
		System.out.println("triangulo medio chueco:");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
