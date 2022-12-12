package OOPS.Question2;

public class Rectangle implements Shape{

	private double a;
	private double b;

	public Rectangle(double a,double b) {
		this.a=a;
		this.b=b;
	}

	
	@Override
	public void area() {
		double area = a*b;
		System.out.println("Area of Rectangle "+area);
	}


}
