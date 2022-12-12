package OOPS.Question10;

public class Question10 {
	public static void main(String[] args) {
		Product product = new Product();

		System.out.println(product.pid + " " + product.pname + " " + product.price + " " + product.unitOfMeasurement);

		Product product1 = product;

		product1.pname = "xyz";
		product1.price = 300;

		System.out.println(product.pid + " " + product.pname + " " + product.price + " " + product.unitOfMeasurement);
		System.out
				.println(product1.pid + " " + product1.pname + " " + product1.price + " " + product1.unitOfMeasurement);

		System.out.println(product1 instanceof Product);
	}
}
