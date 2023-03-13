package areavolume;


interface CalcArea{
	double calcArea();
	double calcPerimeter();
}

interface CalcVolume{
	double calcVolume();
	double calcSurfaceArea();
}

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

public class AreaVolume{
	public static void main(String[] args) {
		Circle myCircle = new Circle(4);
		System.out.println(myCircle.calcArea() + " " + myCircle.calcPerimeter());
		Sphere mySphere = new Sphere(5);
		System.out.println(mySphere.calcArea() + " " + mySphere.calcPerimeter() + " " + mySphere.calcSurfaceArea() + " " + mySphere.calcVolume());
		
		Square mySquare = new Square(4);
		System.out.println(mySquare.calcArea() + " " + mySquare.calcPerimeter());
		Cuboid myCuboid = new Cuboid(5);
		System.out.println(myCuboid.calcArea() + " " + myCuboid.calcPerimeter() + " " + myCuboid.calcSurfaceArea() + " " + myCuboid.calcVolume());		
		
		Triangle myTriangle = new Triangle(5);
		System.out.println(myTriangle.calcArea() + " " + myTriangle.calcPerimeter());
	}
}