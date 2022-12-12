package EXCEPTION_HANDLING.Question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question1 {
	public static void main(String args[])
			throws NumberFormatException, IOException, ResultException, FailedResultException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StudentResult result;
		Student student;
		Integer maths;
		Integer science;
		Integer computer;
		Integer counter;
		Double finalResult;
		Double passingMarks = (double) 40.0;
		Integer passingMarksInt = 40;
		counter = 0;
		student = new Student();
		System.out.println("Enter student roll no : ");
		student.setRollno(Integer.parseInt(bf.readLine()));
		System.out.println("Enter student name : ");
		student.setName(bf.readLine());
		System.out.println("Enter student address : ");
		student.setAddress(bf.readLine());
		result = new StudentResult();
		System.out.println("Enter Maths Marks : ");
		maths = Integer.parseInt(bf.readLine());
		if (passingMarksInt > maths) {
			counter += 1;
			if (counter > 1) {
				throw new ResultException();
			}
		}
		result.setMaths(maths);
		System.out.println("Enter Science Marks : ");
		science = Integer.parseInt(bf.readLine());
		if (passingMarksInt > science) {
			counter += 1;
			if (counter > 1) {
				throw new ResultException();
			}
		}
		result.setScience(science);
		System.out.println("Enter Computer Marks : ");
		computer = Integer.parseInt(bf.readLine());
		if (passingMarksInt > computer) {
			counter += 1;
			if (counter > 1) {
				throw new ResultException();
			}
		}
		result.setComputer(computer);
		finalResult = (double) ((maths + science + computer) / 3);
		if (finalResult < passingMarks) {
			throw new FailedResultException();
		}

	}

}
