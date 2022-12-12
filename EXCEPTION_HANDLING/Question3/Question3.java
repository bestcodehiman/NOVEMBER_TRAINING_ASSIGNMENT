package EXCEPTION_HANDLING.Question3;

import java.io.FileOutputStream;

public class Question3 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("example.txt")) {

			String text = "Example text to be written in file";

			byte arr[] = text.getBytes();

			fos.write(arr);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Resources are closed");
	}

}
