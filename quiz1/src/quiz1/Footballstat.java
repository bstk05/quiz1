package quiz1;

import java.util.Scanner;

public class Footballstat {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of passing attempts");
		double ATT = input.nextDouble();
		
		System.out.print("Number of completions");
		double COMP = input.nextDouble();
		
		double a = Completions(ATT, COMP);
		System.out.println("a =" + a);
		
		System.out.print("Passing yards");
		double YDS = input.nextDouble();
		
		double b = Yards(ATT, YDS);
		System.out.println("b =" + b);
		
		System.out.print("Touchdown passes");
		double TD = input.nextDouble();
		
		double c = Tpasses(ATT, TD);
		System.out.println("c = " + c);
	
		System.out.print("Interceptions");
		double INT = input.nextDouble();
		
		double d = Interceptions(ATT, INT);
		System.out.println("d = " + d);
		
		double data = PasserRating(a, b, c, d);
		System.out.println("The passer rating is: " + data);
		}
	
private static double Completions(double ATT, double COMP){
		double a = (COMP / ATT - .3) * 5;
		return a;
		}
	
private static double Yards(final double ATT, final double YDS){
		double b = (YDS / ATT - 3) * .25;
		return b;
		}
	
private static double Tpasses(double ATT, double TD){
		double c = (TD / ATT) * 20;
		return c;
		}
	
private static double Interceptions(double ATT, double INT){
		double d = 2.375 - (INT / ATT * 25);
		return d;
		}
private static double PasserRating(double a, double b, double c, double d){
		double PR = ((a + b + c + d) / 6) * 100;
		return PR;
		}
}
