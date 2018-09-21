package Main;

import java.awt.Polygon;
import java.util.Collection;

public class ShapeBoxBasedOnPolygon implements IShapeBox {

	private Polygon polygon;
	
	public ShapeBoxBasedOnPolygon(Collection<Couple<Integer, Integer>> box) {		
		polygon = new Polygon();
		for (Couple<Integer, Integer> c : box)
			polygon.addPoint(c.getFirst(), c.getSecond());
	}
	
	@Override
	public double getWidth() {
		return polygon.getBounds().getWidth();
	}

	@Override
	public double getHeight() {
		return polygon.getBounds().getHeight();
	}

}
