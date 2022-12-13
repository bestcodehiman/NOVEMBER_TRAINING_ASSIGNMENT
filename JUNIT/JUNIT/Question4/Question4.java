package JUNIT.Question4;

public class Question4 {
	public Integer findExpressionSum(String s) {
		Integer totalSum = 0;
		String arr[] = s.split("\\+");
		for (String value : arr) {
			totalSum += Integer.parseInt(value.trim());
		}
		return totalSum;
	}

}
