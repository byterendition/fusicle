package model;

import java.awt.Point;

public class Protein extends Substance {
	private final Fusicle	fusicle;
	private final Point		relativeLocation;
	private final int		recognitionPattern;
	private final int		activityPattern;
	
	public Protein(World world, Fusicle fusicle, Point relativeLocation, int exteriorPattern, int recognitionPattern, int activityPattern) {
		super(world, getAbsoluteLocation(fusicle, relativeLocation), exteriorPattern, false, true);
		this.fusicle = fusicle;
		this.relativeLocation = relativeLocation;
		this.recognitionPattern = recognitionPattern;
		this.activityPattern = activityPattern;
	}
	
	private static Point getAbsoluteLocation(Fusicle fusicle, Point relativeLocation) {
		Point absoluteLocation = (Point) fusicle.getLocation().clone();
		absoluteLocation.translate(relativeLocation.x, relativeLocation.y);
		return absoluteLocation;
	}
	
	public Fusicle getFusicle() {
		return fusicle;
	}
	
	public Point getRelativeLocation() {
		return relativeLocation;
	}
	
	public int getRecognitionPattern() {
		return recognitionPattern;
	}
	
	public int getActivityPattern() {
		return activityPattern;
	}
}
