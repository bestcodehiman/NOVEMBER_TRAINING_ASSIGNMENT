package string_questions;

import java.io.IOException;

public class Question5 {
	public static void main(String args[]) throws IOException {
		StringBuilder sb = new StringBuilder("");
		StringBuffer sbf = new StringBuffer("");

		long start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			sb.append(".......");
		}
		System.out.println("StringBuilder : " + (System.nanoTime() - start));
		
		start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			sbf.append(".......");
		}
		System.out.println("StringBuffer : " + (System.nanoTime() - start));
	}

}
