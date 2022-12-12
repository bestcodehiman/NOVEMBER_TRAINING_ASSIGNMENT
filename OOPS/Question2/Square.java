package OOPS.Question2;

public class Square implements Shape{

	private double a;

	public Square(double a) {
		this.a=a;
	}

	
	@Override
	public void area() {
		double area = a*a;
		System.out.println("Area of Square "+area);
	}

}
