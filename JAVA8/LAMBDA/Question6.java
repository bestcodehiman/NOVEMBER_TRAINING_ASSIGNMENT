package JAVA8.LAMBDA;

import java.util.Scanner;

public class Question6 {
	@FunctionalInterface
	interface DrawPattern {
		void draw(int input);
	}

	public static void main(String[] args) {

		int alphabet = 65;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows needed to in the pattern ");
		int rows = scanner.nextInt();

		DrawPattern dp = (input) -> {

			for (int i = 0; i <= input; i++) {
				for (int j = 0; j <= input - i; j++) {
					System.out.print((char) (alphabet + j));
				}
				for (int k = 1; k <= i * 2 - 1; k++) {
					System.out.print(" ");
				}
				for (int l = input - i; l >= 0; l--) {
					if (l != input)
						System.out.print((char) (alphabet + l));
				}
				System.out.println();
			}
		};

		dp.draw(rows);

	}
}
