package array;

import java.io.IOException;

public class Question11 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] arr = {"nan", "sefrgg", "rstsr", "frrf", "newstr"};
		String resultedArray[] = new String[arr.length];
		Integer counter = 0;
		for (int i=0; i<arr.length; i++) {
			if (isPalindromeStr(arr[i])) {
				resultedArray[counter] = arr[i];
				counter += 1;
				System.out.println(arr[i]);
			}
		}
		
	}

	private static Boolean isPalindromeStr(String str) {
		String firstPart = "";
		String lastPart = "";
		Integer index = ((int) Math.floor(str.length()/2));
		for(int i=0; i<((int) Math.floor(str.length()/2)); i++) {
			firstPart+=str.charAt(i);
		}
		if (str.length()%2==0) {
		index=((int) Math.floor(str.length()/2))-1;
		}
        for(int i=str.length()-1; i>index; i--) {
        	lastPart+=str.charAt(i);
		}
        if (firstPart.equals(lastPart)) {
        	return Boolean.TRUE;
        }
		return Boolean.FALSE;
	}

}
