package BasicPrograms;

import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Radius value :");
		int radius;
		double volume;
		radius=sc.nextInt();
		volume=(4.0/3.0)*3.14*(radius*radius*radius);
		System.out.printf("Volume of the Cirle is:%f",volume);
		sc.close();
		
	}

}
