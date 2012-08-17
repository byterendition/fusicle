package model;

import java.awt.Point;

public class Substance {
	private World			world;
	private Point			location;
	private int				exteriorPattern;
	private final boolean	fixed;
	private final boolean	mutable;
	
	public Substance(World world, Point location, int exteriorPattern, boolean isFixed, boolean isMutable) {
		this.world = world;
		this.location = location;
		this.exteriorPattern = exteriorPattern;
		fixed = isFixed;
		mutable = isMutable;
	}
	
	public World getWorld() {
		return world;
	}
	
	public Point getLocation() {
		return location;
	}
	
	public int getExteriorPattern() {
		return exteriorPattern;
	}
	
	public void setExteriorPattern(int exteriorPattern) {
		this.exteriorPattern = exteriorPattern;
	}
	
	public boolean isFixed() {
		return fixed;
	}
	
	public boolean isMutable() {
		return mutable;
	}
}
