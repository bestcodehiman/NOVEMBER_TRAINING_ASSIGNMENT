package OOPS.Question10;

public class Product implements Cloneable {

	int pid;
	String pname;
	double price;
	String unitOfMeasurement;

	public Product() {
		pid = 1;
		pname = "rice";
		price = 200.0;
		unitOfMeasurement = "1 kg";
	}

}
