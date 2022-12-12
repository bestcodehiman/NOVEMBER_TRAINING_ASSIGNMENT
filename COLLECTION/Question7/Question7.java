package COLLECTION.Question7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import COLLECTION.Question5.Item;

public class Question7 {

	public static void main(String[] args) throws IOException {
		List<Student> studentsInfoList = Arrays.asList(new Student(2, "student2", 270), new Student(1, "student1", 100),
				new Student(4, "student4", 240), new Student(6, "student6", 210), new Student(3, "student3", 120),
				new Student(5, "student5", 430));
		// a) Print the name of students who secure first, second and third position.
		Collections.sort(studentsInfoList, new Comparator<Student>() {
			public int compare(Student student1, Student student2) {
				if (student1.getTotalmarks() < student2.getTotalmarks()) {
					return 1;
				}
				return -1;
			}
		});
		System.out.print("Top 3 students are : ");
		for (int i = 0; i < 3; i++) {
			System.out.print(studentsInfoList.get(i) + ", ");
		}
		// b) Print name of those students who’s marks are below 50%.
		System.out.println("");
		System.out.print("Students below 50% marks are : ");
		studentsInfoList.stream().filter((student) -> student.getPercentage() < 50)
				.forEach((student) -> System.out.print(student + ", "));
		// c) Print name of those students who’s marks are below 35% it means they are
		// fail.
		System.out.println("");
		System.out.print("Students below 35% marks are : ");
		studentsInfoList.stream().filter((student) -> student.getPercentage() < 35)
				.forEach((student) -> System.out.print(student + ", "));
		// d) Print name of those students who’s marks are above average score.
		Integer value = (int) studentsInfoList.stream().map(student -> student.getTotalmarks()).mapToInt(Integer::intValue)
				.summaryStatistics().getAverage();
		System.out.println("");
		System.out.print("Students above average marks are : ");
		studentsInfoList.stream().filter((student) -> student.getTotalmarks() > value)
				.forEach((student) -> System.out.print(student + ", "));
		// e) Print detail of all students on the basis of Name
		System.out.println("Enter the name of  the student whose detail you want : ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String searchedElement = bf.readLine();
		Boolean check=Boolean.TRUE;
        for (Student stu : studentsInfoList) {
        	if (stu.getSname().equals(searchedElement)) {
        		check = Boolean.FALSE;
        		System.out.println("Student complete details are : "+stu);
        		break;
        	}
        }
        if(check) {
        	System.out.println("Student with above name not found");
        }

	}

}
