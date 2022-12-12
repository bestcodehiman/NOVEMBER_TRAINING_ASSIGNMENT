package OOPS.Question9;

import java.util.ArrayList;
import java.util.List;

public class Question9 {
	private static Integer objectsCount = 0;

	public static Integer getObjectsCount() {
		System.out.println("No of objects present : " + objectsCount);
		return objectsCount;
	}

	public Question9() {
		objectsCount += 1;
		System.out.println("object is created" + this);
	}
	
	public void finalize() {
		
		System.out.println("object is destructor" + this);
		this.objectsCount -= 1;
		System.out.println("No of objects after destruction :" + this.objectsCount);
	}
	
	public static void main(String args[]) throws InterruptedException {
		
		Question9 s1 = new Question9();
		Question9 s2 = new Question9();
		s1=null;
		s2=null;
		System.gc();
		Question9 s3 = new Question9();
		Thread.sleep(1000);
		Question9.getObjectsCount();
	}
}
