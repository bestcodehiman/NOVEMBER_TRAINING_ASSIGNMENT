package EXCEPTION_HANDLING.Question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Question2 {
	public static void main(String args[]) throws IOException, EmployeeAbscondingException, LeaveExceedLimitException {
		Integer leaveCounter = 0;
		Integer paidCounter = 0;
		Integer absentCounter = 0;
		Integer noInfoCounter = 0;
		String attendance;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employees total salary");
		Integer salary = Integer.parseInt(bf.readLine());
		Double singleDaySalary = (double) (salary / (LocalDate.now().lengthOfMonth()));
		System.out.println("Enter the attendance for the month for each day:");
		for (Integer i = 1; i <= LocalDate.now().lengthOfMonth(); i++) {
			attendance = bf.readLine();
			if ("p".equalsIgnoreCase(attendance)) {
				noInfoCounter = 0;
				paidCounter += 1;
			} else if ("l".equalsIgnoreCase(attendance)) {
				noInfoCounter = 0;
				leaveCounter += 1;
				paidCounter += 1;
			} else if ("a".equalsIgnoreCase(attendance)) {
				noInfoCounter = 0;
				absentCounter += 1;
			} else if ("n".equalsIgnoreCase(attendance)) {
				noInfoCounter += 1;
			} else {
				System.out.println("Invalid value entered");
				return;
			}
			if (leaveCounter > 2) {
				throw new LeaveExceedLimitException();
			}
			if (noInfoCounter > 3) {
				throw new EmployeeAbscondingException();
			}
		}
		System.out.println("Total salary : " + (paidCounter * singleDaySalary));
	}

}
