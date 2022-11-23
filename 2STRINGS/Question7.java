package string_questions;

public class Question7 {

	private static String s = "";

	Question7(String s) {
		this.s = s;
	}

	// object is eligible for garbage collection finalized method
	// is called String inside it is also eligible for garbage collection
	public void finalize() {
		System.out.println("object is eligible for garbage collection as finalize is called");
	}

	public static void main(String args[]) {
		Question7 s1 = new Question7("new String");
		s1 = null;
		System.gc();
	}
}
