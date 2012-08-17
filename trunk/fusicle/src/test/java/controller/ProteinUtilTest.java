package controller;

import org.junit.Test;

public class ProteinUtilTest {
	@Test
	public void testBoundLigand() {
		String proteinPattern = "11011011";
		String ligandPattern = "10110110";
		int bound = 0;
		for (int i = 0; i < 1000000; i++) {
			if (ProteinUtil.boundLigand(Integer.parseInt(proteinPattern, 2), Integer.parseInt(ligandPattern, 2), 255)) {
				bound++;
			}
		}
		System.out.println("proteinPattern: " + proteinPattern + ", ligandPattern: " + ligandPattern + ", number of succeeded bondings: " + bound + " out of 1000000 tries (+/- 1/" + (Math.round(1000000.0 / bound)) + ")");
	}
}
