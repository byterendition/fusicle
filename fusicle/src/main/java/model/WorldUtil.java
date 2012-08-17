package model;

import java.awt.Point;

import controller.MathUtil;

public abstract class WorldUtil {
	public static void translate(World world, Point location, int dx, int dy) {
		location.translate(dx, dy);
		location.x = MathUtil.modulo(location.x, world.getWidth());
		location.y = MathUtil.modulo(location.y, world.getHeight());
	}
}
