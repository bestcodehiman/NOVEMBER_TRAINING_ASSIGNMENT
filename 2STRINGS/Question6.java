package string_questions;

public class Question6 {
	public static void main(String args[]) {
		// 2 objects will be created one in scp and one in heap area and str will point to heap are object
		String str1 = new String("Hello");
		// 1 object will be created in heap area and str2 will point to that object only
		String str2 = new String("Hello");
		// No object will be created it will point to the scp area existing object only
		String str3 = "Hello";
		// No object will be created it will point to the scp area existing object only
		String str4 = "Hello";
		// One object will be created it will point to the scp area existing object only
		String str5 = "New";
		// No object will be created it will point to the scp area existing object only
		String str6 = "New";
		// One object will be created it will point to the scp area existing object only
		String str7 = new String("New");
		System.out.println("str1 and str2 = " + (str1==str2));
		System.out.println("str2 and str3 = " + (str2==str3));
		System.out.println("str3 and str4 = " + (str3==str4));
		System.out.println("str5 and str6 = " + (str5==str6));
		System.out.println("str6 and str7 = " + (str6==str7));
	}

}
