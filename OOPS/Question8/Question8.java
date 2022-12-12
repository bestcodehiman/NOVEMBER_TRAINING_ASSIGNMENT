package OOPS.Question8;

public class Question8 {
	public static void main(String[] args) {
		Electronics e = new Laptop(1, "name", "21/10/2022");
		System.out.println("Laptop : " + e);
		Electronics e1 = new Mobile(2, "name", "22/10/2022");
		System.out.println("Mobile : " + e1);
		Electronics e3 = new LCD(3, "name3", "23/10/2022");
		System.out.println("LCD : " + e3);
	}
}
