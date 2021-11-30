package aaplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		 Rectangle x = new Rectangle();
		 
		 System.out.println("Enter rectangle width and height: ");
		 
		 x.x = sc.nextDouble();
		 x.y = sc.nextDouble();
		 
		 System.out.printf("Area = %.2f%n", x.area());
		 System.out.printf("Perimeter = %.2f%n", x.perimeter());
		 System.out.printf("Diagonal = %.2f%n", x.diagonal());
					 	 
		sc.close();		 
	}

}
