package controller;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
	@Test
	public void testPatternMask() {
		int[] expected = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455,
				536870911, 1073741823, 2147483647, -1 };
		
		for (int i = 0; i <= 32; i++) {
			int actual = MathUtil.BITMASK[i];
			System.out.println("pattern size: " + i + ", pattern mask: " + actual);
			Assert.assertEquals(expected[i], actual);
		}
	}
}
