import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculate {

	@Test
	public void testScorePercentInput() {
		// คะแนนรวมต้องไม่เกิน 100
		float result;
		for(int i = 0 ; i<4;i++){
		 result += controller.getPercent(i);
		}
		assertTrue("result of score could not more than or less than 100",result==100);
	}
	@Test
	public void ScoreInput(){
		for(int i = 0 ; i<4;i++){
			 controller.getPercent(i);
			}
			assertTrue("result of score could not more than or less than 100", controller.getPercent(i);<0);
	}
	

}
