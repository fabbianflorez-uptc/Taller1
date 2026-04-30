//---------------------------------------//
//--FABIAN LEONARDO FLOREZ GONZALEZ------//
//---CODIGO 202614060--------------------//
//---------------------------------:D----//
package repasoVariables;

public class repasoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. declarar una variable int con tu edad e imprimirla
		int  miEdad = 19;
		System.out.println("mi edad es: " + miEdad );
		
		System.out.println("\n  -~-~ punto 2 ~-~-  ");
		//2. declarar un double con tu estatura ej 1.75 e imprimirla
		double  estatura= 1.78; 
		System.out.println(" mido mas o menos " + estatura);
		
		System.out.println("\n>>> punto 3 <<");
		//3. declarar un String con tu nombre e imprimirlo
		String minombre  = "fabian leonardo";
		System.out.println(" me llamo " + minombre );
		
		//4. declarar un boolean llamado esMayorDeEdad en true e imprimirlo
		boolean esMayorDeEdad = true ;
		System.out.println(" ya soy mayor? " + esMayorDeEdad);
		
		System.out.println("\n ..:: punto 5 ::.. ");
		//5. declarar dos int, sumarlos y guardar en una tercera variable, imprimir las tres
		int num1 = 12 ;
		int  num2 = 25;
		int total_suma= num1 +  num2;
		System.out.println("los numeros son " + num1 + " y " + num2 + " y suman " + total_suma);
		
		//6. declarar un char con la inicial de tu nombre e imprimirlo
		char  inicial = 'f';
		System.out.println("mi inicial es la " + inicial);
		
		System.out.println("\n /// punto 7 y 8 ////");
		//7. declarar un int y un double, multiplicarlos e imprimir el resultado
		int cant = 5;
		double precio = 3.5;
		System.out.println(" multiplicacion da : " + (cant * precio));
		
		//8. declarar tres variables de tipos distintos e imprimirlas en una sola linea con +
		int dia = 27;
		String mes = "septiembre";
		boolean naciEseDia = true;
		System.out.println("yo naci el " + dia + " de " + mes + " y eso es " + naciEseDia);
		
		System.out.println("\n ++ punto 9 y 10 ++");
		//9. declarar variables con var para cada tipo basico e imprimir cada una (java 10+)
		var var1 = 500;
		var texto = "hola mundo con var";
		var varDecimal = 4.2;
		System.out.println(var1 + " -- " + texto + " -- " + varDecimal);
		
		//10. declarar una constante final llamada PI=3.14159 y calcular el area de un circulo con radio 4
		final double PI = 3.14159;
		int radio_circulo = 4;
		double area = PI * (radio_circulo * radio_circulo);
		System.out.println("el area del circulo es " + area);

	}

}
