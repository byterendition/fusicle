package model;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Fusicle {
	private World			world;
	private Point			location;
	private Set<Protein>	proteinSet;
	
	public Fusicle(World world, Point location) {
		this(world, location, new HashSet<Protein>());
	}
	
	public Fusicle(World world, Point location, Set<Protein> proteinSet) {
		this.world = world;
		this.location = location;
		this.proteinSet = proteinSet;
	}
	
	public Set<Protein> getProteinSet() {
		return proteinSet;
	}
	
	public void addProtein(Protein protein) {
		proteinSet.add(protein);
	}
	
	public boolean removeProtein(Protein protein) {
		return proteinSet.remove(protein);
	}
	
	public Point getLocation() {
		return location.getLocation();
	}
	
	public void translate(int dx, int dy) {
		WorldUtil.translate(world, location, dx, dy);
	}
}
