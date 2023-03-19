package areavolume;
import java.util.Scanner;
/**
 * 
 * @author nandhakumar
 *interface calcarea which has 2 abstract methods calcArea and calcPerimeter for 2d shapes
 *interface calcvolume which has 2 abstract methods calcVolume and calcSurfaceArea for 3d shapes
 */

interface CalcArea{
	double calcArea();
	double calcPerimeter();
}

interface CalcVolume{
	double calcVolume();
	double calcSurfaceArea();
}

/**
 * 
 * @author nandhakumar
 *class circle returns area and perimeter of the value
 */
class Circle implements CalcArea{
	double pi = Math.PI;
	int a;
	public Circle(int a) {
		this.a = a;
	}
	@Override
	public double calcArea() {
		return pi*a*a;
	}
	@Override
	public double calcPerimeter() {
		return 2*pi*a;
	}
}

class Sphere implements CalcArea, CalcVolume{
	double pi = Math.PI;
	int a;
	public Sphere(int a) {
		this.a = a;
	}
	@Override
	public double calcVolume() {
		return (4/3) * pi * a * a * a;
	}
	@Override
	public double calcSurfaceArea() {	
		return 4 * pi * a * a ;
	}
	@Override
	public double calcArea() {
		return pi*a*a;
	}
	@Override
	public double calcPerimeter() {
		return 2*pi*a;
	}
}

class Square implements CalcArea{
	int a;
	public Square(int a) {
		this.a = a;
	}
	@Override
	public double calcArea() {
		return a*a;
	}
	@Override
	public double calcPerimeter() {
		return 4*a;
	}
}

class Cuboid implements CalcArea, CalcVolume{
	int a;
	public Cuboid(int a) {
		this.a = a;
	}
	@Override
	public double calcVolume() {
		return a * a * a;
	}
	@Override
	public double calcSurfaceArea() {	
		return 6 * a * a ;
	}
	@Override
	public double calcArea() {
		return a * a;
	}
	@Override
	public double calcPerimeter() {
		return 4 * a;
	}
}

class Triangle implements CalcArea{
	int a;
	
	public Triangle(int a) {
		this.a = a;
	}
	@Override
	public double calcArea() {
		return 0.86 * a * a;
	}
	@Override
	public double calcPerimeter() {
		return 4 * a;
	}
}

/**
 * 
 * @author nandhakumar
 *CLASS areavolume
 *main method - call the functionalities based on the user input
 */
public class AreaVolume{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius for Circle and Sphere");
		int radius = sc.nextInt();
		Circle myCircle = new Circle(radius);
		System.out.println("Area of Circle " + String.format("%.2f", myCircle.calcArea()) + "\nPerimeter of Circle " + String.format("%.2f", myCircle.calcPerimeter()));
		Sphere mySphere = new Sphere(radius);
		System.out.println("Area of Sphere " + String.format("%.2f" , mySphere.calcArea()) + "\nPerimeter of Sphere " + String.format("%.2f", mySphere.calcPerimeter()));
		System.out.println("Surface Are of Sphere" + String.format("%.2f" , mySphere.calcSurfaceArea()) + "\nVolume of Sphere "  +String.format("%.2f", mySphere.calcVolume()));
		
		System.out.println("Enter side of Square");
		int side = sc.nextInt();
		Square mySquare = new Square(side);
		System.out.println("Area of Square " + String.format("%.2f", mySquare.calcArea()) + "\nPerimeter of Square " + String.format("%.2f",mySquare.calcPerimeter()));
		Cuboid myCuboid = new Cuboid(side);
		System.out.println("Surface area of Cube " + String.format("%.2f",myCuboid.calcSurfaceArea()) + "\nVolume of Square " + String.format("%.2f",myCuboid.calcVolume()));		
		
		System.out.println("Enter side of triangle");
		int sideTriangle = sc.nextInt();
		Triangle myTriangle = new Triangle(sideTriangle);
		System.out.println("Area of Triangle " + String.format("%.2f",myTriangle.calcArea()) + "\nPerimeter of Triangle " + String.format("%.2f",myTriangle.calcPerimeter()));
	}
}