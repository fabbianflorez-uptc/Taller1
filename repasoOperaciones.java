//---------------------------------------//
//--FABIAN LEONARDO FLOREZ GONZALEZ------//
//---CODIGO 202614060--------------------//
//---------------------------------:D----//
package repasoOperaciones;

public class repasoOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. dados dos numeros enteros imprimir suma, resta, multiplicacion y division
		int a = 15;
		int b = 3;
		System.out.println("suma: " + (a+b) + " resta: " + (a-b) + " multi: " + (a*b) + " div: " + (a/b));
		
		System.out.println("\n  --- punto 2 y 3 ==>");
		//2. calcular el residuo de 17 entre 5 con % e imprimirlo
		System.out.println(" residuo de 17 entre 5 da " + (17 % 5));
		
		//3. dado un numero, imprimir si es par o impar usando solo %
		int numero_par = 14;
		if(numero_par % 2 == 0) {
			System.out.println("el numero " + numero_par + " es par ");
		} else {
			System.out.println("el numero " + numero_par + " es impar ");
		}
		
		System.out.println("\n  *** pUNTO 4 y 5 * ");
		//4. calcular el area de un rectangulo con base 8 y altura 5
		int base = 8;
		int  altura = 5;
		System.out.println("area del rectangulo es " + (base * altura));
		
		//5. calcular el perimetro de un cuadrado con lado 6
		int lado_cuadrado = 6;
		System.out.println("perimetro cuadrado: " + (lado_cuadrado * 4));
		
		System.out.println("\n ~~~ punto 6 al 8 ~~~");
		//6. dado un precio y un descuento como variables, calcular el precio final
		double precio_base = 80000;
		double desc = 0.15; 
		System.out.println("te queda en " + (precio_base - (precio_base * desc)));
		
		//7. convertir 100 fahrenheit a celsius
		double fahrenheit = 100;
		double  celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("100 grados f son " + celsius + " en celsius");
		
		//8. calcular cuantos segundos hay en un dia
		int horas = 24;
		int minutos = horas * 60;
		int segundos = minutos * 60;
		System.out.println("en un dia hay " + segundos + " segs");
		
		System.out.println("\n > punto 9 y 10 < ");
		//9. calcular la hipotenusa de un triangulo con catetos 3 y 4
		double cat1= 3;
		double cat2= 4;
		double hipo = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		System.out.println(" la hipotenusa da " + hipo);
		
		//10. dado un numero de segundos, convertirlo a horas, minutos y segundos restantes
		int seg_totales = 4500;
		int hrs = seg_totales / 3600;
		int mins = (seg_totales % 3600) / 60;
		int segs = seg_totales % 60;
		System.out.println(" son " + hrs + " horas, " + mins + " minutos y " + segs + " segundos");

	}

}
