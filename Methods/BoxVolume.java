/*Define a class ‘Box’ that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. 
The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities[use this keyword].*/

import java.util.Scanner;
class Box {
	int length;
	int breadth;
	int height;
	Box(int l, int b, int h) {
		this.length = l;
		this.breadth = b;
		this.height = h;
	}
	int getVol() {
		return this.length * this.breadth * this.height;
	}
}
class BoxVolume {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	
 	System.out.print("Enter the length(in m): ");
		int l = sc.nextInt();
		System.out.print("Enter the breadth(in m): ");
		int b = sc.nextInt();
		System.out.print("Enter the height(in m): ");
		int h = sc.nextInt();
		Box b1 = new Box(l, b, h);
		System.out.print("Volume of box: "+b1.getVol()+"m^3");
	}
}

