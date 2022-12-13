package JUNIT.Question6;

public class Question6 {
	public Integer findSum() {
		Integer total = 0;
		for (Integer i = 100; i <= 200; i++) {
			if (i % 7 == 0) {
				total += i;
			}
		}
		return total;
	}

}
