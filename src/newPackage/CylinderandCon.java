package newPackage;

import java.util.Scanner;

public class CylinderandCon {

	public static void main(String[] args) {
		
	CylVol();
	ConeVol();
		
	}
	 
	static void CylVol() {
	 double r,h,volume;
	 Scanner s = new Scanner(System.in);
	 System.out.println("What is your radius for cylinder: ");
	 r = s.nextDouble();
	 System.out.println("What is yout height for cylinder: ");
	 h = s.nextDouble();
	 volume = Math.PI * r * r * h;
	 System.out.println("The volume of your cylinder is: " + volume );
 
	
}
	static void ConeVol() {
		double volume,r,h;
		Scanner s = new Scanner(System.in);
		System.out.println("What is your radius for cone: ");
		r=s.nextDouble();
		System.out.println("What is your height for cone: ");
        h = s.nextDouble();
        volume = Math.PI*r*r*(h/3);
        System.out.println("This is the volume of your Cone: " + volume);
        
	}
}