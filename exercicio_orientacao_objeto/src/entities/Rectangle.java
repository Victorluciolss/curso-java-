package entities;

public class Rectangle {

	public double width;
	public double heigth;
	
	public double area() {
		double ar = width * heigth;
		return  ar;
	}
	public double perimetro() {
		double pr = (width + heigth) * 2;
		return pr;
	}
	public double diagonal() {
		double diag = Math.sqrt(Math.pow(width, 2) + (Math.pow(heigth, 2)));
		return  diag;
	}

}
