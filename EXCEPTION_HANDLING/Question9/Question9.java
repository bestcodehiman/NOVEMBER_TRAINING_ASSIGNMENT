package EXCEPTION_HANDLING.Question9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9 {

	public static Double standardDeviationSize;
	public static Double collarActualSize;
	public static final Integer STANDARD_DEVIATION = 2;

	public static void main(String args[]) throws NumberFormatException, IOException, CollarStandardDeviateException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the collars actual size : ");
		collarActualSize = Double.valueOf(bf.readLine());
		standardDeviationSize = findMaxAllowedDeviationSize(collarActualSize);
		Integer counter = 0;
		Double collarSize = (Double) 0.0;
		Double deviatedSize;
		for (Integer i = 0; i < 10; i++) {
			System.out.println("Enter the final size :");
			collarSize = Double.valueOf(bf.readLine());
			deviatedSize = Math.abs(collarSize - collarActualSize);
			if (deviatedSize > standardDeviationSize) {
				System.out.println("Deviated By Size : " + deviatedSize);
				counter += 1;
				if (counter >= 5) {
					throw new CollarStandardDeviateException();
				}
			}
		}
	}

	private static Double findMaxAllowedDeviationSize(Double size) {
		return (size * STANDARD_DEVIATION) / 100;
	}
}
