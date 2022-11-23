package array;

public class Question8 {
public static final char[] VOWELS = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
	
	public static void main(String[] args) throws java.lang.Exception {
		char[] arr = {'w','E', 's', 't', 'a', 'y', 'h', 'i', 'x'};
		String vowels = "";
		String consonants = "";
		for (char value: arr) {
			if (isVowel(value)) {
				vowels += value;
			} else {
				consonants += value;
			}
		}
		char[] separatedArray = (vowels+consonants).toCharArray();
		for (int i=0; i<separatedArray.length; i++) {
			System.out.print(separatedArray[i]);
		}
		
	}
	
	private static Boolean isVowel(char ch) {
		for (char vowel : VOWELS) {
			if (vowel == ch) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

}
