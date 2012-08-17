package model;

import controller.MathUtil;

public class World implements Cloneable {
	private final int		width;
	private final int		height;
	
	public final int		PATTERN_SIZE	= 6;
	public final int		PATTERN_MASK	= MathUtil.BITMASK[PATTERN_SIZE];
	
	private Substance[][]	state;
	
	public World(int width, int height) {
		this.width = width;
		this.height = height;
		setState(new Protein[width][height]);
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	public Substance[][] getState() {
		return state;
	}

	public void setState(Substance[][] state) {
		this.state = state;
	}
}
