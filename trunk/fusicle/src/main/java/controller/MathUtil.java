package controller;

public abstract class MathUtil {
	public final static int[]	BITMASK	= createBitMasks();
	
	public static int modulo(int val, int div) {
		return val % div < 0 ? (val % div) + div : val % div;
	}
	
	public static int[] createBitMasks() {
		int[] bitMasks = new int[33];
		for (int i = 0; i <= 32; i++) {
			bitMasks[i] = i != 32 ? ~(-1 << i) : -1;
		}
		return bitMasks;
	}
}
