
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HolidayBonusTestStudent {

	private double[][] dataTest1 = { { 47, 27, 89 }, { 72, 74, 79 }, { 14, 25 }, { 29, 13 }};
	private double[][] dataTest2 = { { 33, 26, 95 }, { 3, 88, 67 }, { 35, 30 }, { 78, 62, 54 }};


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataTest1);
			assertEquals(6000.0, result[0], .001);
			assertEquals(15000.0, result[1], .001);
			assertEquals(4000.0, result[2], .001);

		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataTest2);
			assertEquals(6000.0, result[0], .001);
			assertEquals(15000.0, result[1], .001);
			assertEquals(4000.0, result[2], .001);


		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}

	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(29000.0,HolidayBonus.calculateTotalHolidayBonus(dataTest1),.001);
		assertEquals(31000.0,HolidayBonus.calculateTotalHolidayBonus(dataTest2),.001);

	}

}
