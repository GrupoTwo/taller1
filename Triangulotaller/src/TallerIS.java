import java.util.Scanner;

public class TallerIS {
	
	public static boolean isATriangle(int a,int b, int c) {
		if(a<b+c && b<c+a && c<a+b ) {
			return true;
		}
		return false;
	}
	
	public static String TriangleType(int a, int b, int c) {
		Boolean IsAtriangle;
		
		if((a<b+c) && (b<a+c) && (c<a+b)) {
			IsAtriangle = true;
		}
		else {IsAtriangle = false;}
		
		if(IsAtriangle){
		
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
		
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int error = 1;
		while(error<2){
		 System.out.println("Ingrese un número: ");
		 a = s.nextInt();
		 if(a>=1 && a<=200){
			 System.out.println("Ingrese un número: ");
			 b = s.nextInt();
			 if(b>=1 && b<=200){
				 System.out.println("Ingrese un número: ");
				 c = s.nextInt();
				 if(c>=1 && c<=200){
					 error=error+1;
				 }
				 else {
					 System.out.println("Value of c is not in the range of permitted values");
				 }
			 }
			 else {
				 System.out.println("Value of b is not in the range of permitted values");
			 }
		 }
		 else {
			 System.out.println("Value of a is not in the range of permitted values");
		 }
		 
		 
		}
		System.out.println("Side A is " + a);
		System.out.println("Side B is " + b);
		System.out.println("Side C is " + c);
		System.out.println("Es triangulo?: "+isATriangle(a,b,c));
		System.out.println(TriangleType(a,b,c));
		
		//-------------------------------------------------------------------------------------
		//Casos de Prueba..
		
		System.out.println("Test 1: "+ "Equilateral".equals(TriangleType(3,3,3)));
		
	}
	
}



