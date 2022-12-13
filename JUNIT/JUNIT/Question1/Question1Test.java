package JUNIT.Question1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Question1Test {
	Question1 additionObj = new Question1();
	
	@Test
	public void testFindSum(){  
		Integer arr[] = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(55,additionObj.findSum(arr));  
    }

}
