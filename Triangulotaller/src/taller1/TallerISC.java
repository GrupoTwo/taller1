package taller1;

import java.util.Scanner;

public class TallerISC {
	public static boolean cehckRanges (double a , double b, double c) {
		boolean c1,c2,c3,result = true;
		c1 = 1<=a && a<=200;
		c2 = 1<=b && b<=200;
		c3 = 1<=b && c<=200;
		if (!c1) {
			System.out.println("El valor de a no es permitido");
			result = false;
		}
		if(!c2) {
			System.out.println("El valor de b no es permitido");
			result = false;
		}
		if(!c3) {
			System.out.println("El valor de c no es permitido");
			result = false;
		}
		
		return result;
	}
	
	public static double[] getInputs() {
		Scanner s = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double error = 1;
		boolean c1,c2,c3;
		do {
			System.out.println("Ingrese 3 enteros lados de un triangulo");
			System.out.println("Ingrese el valor de a");
			while(!s.hasNextDouble()) {
				System.out.println("Valor no válido, intentalo de nuevo: ");
				s.next();
			}	
			a = s.nextDouble();
			
			System.out.println("Ingrese el valor de b");
			while(!s.hasNextDouble()) {
				System.out.println("Valor no válido, intentalo de nuevo: ");
				s.next();
			}	
			b = s.nextDouble();
			System.out.println("Ingrese el valor de c");
			while(!s.hasNextDouble()) {
				System.out.println("Valor no válido, intentalo de nuevo: ");
				s.next();
			}	
			c = s.nextDouble();
			c1 = 1<=a && a<=200;
			c2 = 1<=b && b<=200;
			c3 = 1<=c && c<=200;
			if (!c1) {
				System.out.println("El valor de a no es permitido");
			}
			if(!c2) {
				System.out.println("El valor de b no es permitido");
			}
			if(!c3) {
				System.out.println("El valor de c no es permitido");
			}
		}while(!c1 || !c2 || !c3);
		System.out.println("Side A is " + a);
		System.out.println("Side B is " + b);
		System.out.println("Side C is " + c);
		
		s.close();
		
		return new double[] {a,b,c};
	}
	
	
	
	public static boolean isATriangle(double a,double b, double c) {
		if(a<b+c && b<c+a && c<a+b ) {
			return true;
		}
		return false;
	}
	//---- CORRECTION TYPES double 
	public static String TriangleType(double a, double b, double c) {
		
		if(isATriangle(a,b,c)){
		
			if (a==b && b==c ) {
				return "Equilateral";
			}
			else if(a!=b && a!=c && b!=c) {
				return "Scalene";
			}
			else {
				return "Isoceles";
			}
		}
		
		else {
			return "Not a Triangle";
		}

	}
 
	
	
	public static void main(String[] args) {
		
		double[] inputs = getInputs();
		System.out.println("Es triangulo?: "+isATriangle(inputs[0],inputs[1],inputs[2]));
		System.out.println(TriangleType(inputs[0],inputs[1],inputs[2]));
		
		//-------------------------------------------------------------------------------------
		//Test Case..
		
		System.out.println("Test 1: "+ "Equilateral".equals(TriangleType(3,3,3)));
		
		
	}

}
