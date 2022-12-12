package OOPS.Question2;

public class Triangle implements Shape{
	
	private double a;
	private double c;
	private double b;

	public Triangle(double a,double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}

	@Override
	public void area() {
		double s=(a+b+c)/2;
		double area = Math.sqrt((s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle "+area);
		
	}

}
