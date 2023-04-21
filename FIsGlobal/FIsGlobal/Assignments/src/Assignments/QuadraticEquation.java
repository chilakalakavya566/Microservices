package Assignments;

import java.util.Scanner;
import java.lang.Math;


public class QuadraticEquation {

	public static void main(String[] args) {
		int coefficientA,coefficientB,coefficientC;
		double discriminant;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CoefficientA value");
		coefficientA= sc.nextInt();
		System.out.println("Enter CoefficientB value");
		coefficientB= sc.nextInt();
		System.out.println("Enter CoefficientC value");
		coefficientC= sc.nextInt();
		discriminant=Math.pow( coefficientB,2)-4*coefficientA*coefficientC;
		System.out.println(discriminant);
		if (discriminant>0)
		{
			double root1=(-coefficientB+Math.sqrt(discriminant))/2*coefficientA;
			double root2=(-coefficientB-Math.sqrt(discriminant))/2*coefficientA;
			System.out.println("The roots are real and unequal.");
			System.out.printf("%f %f",root1,root2);
		}
		else if(discriminant==0)
		{
			double root=(-coefficientB+Math.sqrt(discriminant))/4*coefficientA;
			System.out.println("The roots are real and equal.");
			System.out.println("Root is:"+root);
		}
		else
		{
			System.out.println("Roots are imaginary.");
		}
		sc.close();
		
			}
	}


