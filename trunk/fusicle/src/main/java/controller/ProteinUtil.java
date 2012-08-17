package controller;

import java.util.Random;

public class ProteinUtil {
	public static final Random	random	= new Random();
	
	public static boolean boundLigand(int proteinPattern, int ligandPattern, int mask) {
		return random.nextInt(1 << Integer.bitCount(~(proteinPattern ^ ligandPattern) & mask)) == 0;
	}
}
