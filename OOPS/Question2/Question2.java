package OOPS.Question2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		int x1, x2, x3, y1, y2, y3;
		System.out.println("calculate Area");
		System.out.println("1. Square");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("other for exit");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("Enter vertex 1 coordinate");
			x1 = sc.nextInt();
			System.out.println("Enter vertex 2 coordinate");
			y1 = sc.nextInt();

			System.out.println("Enter vertex 3 coordinate");
			x2 = sc.nextInt();
			System.out.println("Enter vertex 4 coordinate");
			y2 = sc.nextInt();

			double d1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y2) * (y2 - y2));

			Square sq = new Square(d1);
			sq.area();
			break;
		case 2:
			System.out.println("Enter vertex 1 coordinate");
			x1 = sc.nextInt();
			System.out.println("Enter vertex 2 coordinate");
			y1 = sc.nextInt();

			System.out.println("Enter vertex 3 coordinate");
			x2 = sc.nextInt();
			System.out.println("Enter vertex 4 coordinate");
			y2 = sc.nextInt();

			System.out.println("Enter vertex 5 coordinate");
			x3 = sc.nextInt();
			System.out.println("Enter vertex 6 coordinate");
			y3 = sc.nextInt();

			double d4 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y2) * (y2 - y2));
			double d5 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));

			Rectangle rec = new Rectangle(d4, d5);
			rec.area();
			break;
		case 3:

			System.out.println("Enter vertex 1 coordinate");
			x1 = sc.nextInt();
			System.out.println("Enter vertex 2 coordinate");
			y1 = sc.nextInt();

			System.out.println("Enter vertex 3 coordinate");
			x2 = sc.nextInt();
			System.out.println("Enter vertex 4 coordinate");
			y2 = sc.nextInt();

			System.out.println("Enter vertex 5 coordinate");
			x3 = sc.nextInt();
			System.out.println("Enter vertex 6 coordinate");
			y3 = sc.nextInt();

			double d7 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y2) * (y2 - y2));
			double d8 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
			double d9 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

			Triangle triangle = new Triangle(d7, d8, d9);
			triangle.area();
			break;

		default:
			System.exit(0);
			break;
		}

	}
}
