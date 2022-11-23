package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer m = Integer.parseInt(br.readLine());
		Integer a[][] = new Integer[m][m];
		for (int row=0; row<m; row++) {
			for(int col=0; col<m; col++) {
				a[row][col] = Integer.parseInt(br.readLine());
			}
		}
		printColumn(0, a, m);
		printColumn(m-1, a, m);
		printRow(0, a, m);
		printRow(m-1, a, m);
		
	}

	private static void printRow(Integer j, Integer[][] a, Integer m) {
		System.out.print("Value of "+(j+1) +" row : ");
		for(int i=0; i<m; i++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println("");
		
	}

	private static void printColumn(Integer j, Integer[][] a, Integer m) {
		System.out.print("Value of "+(j+1) +" column : ");
		for(int i=0; i<m; i++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println("");
		
	}
}
