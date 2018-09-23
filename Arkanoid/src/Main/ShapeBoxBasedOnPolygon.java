package Main;

import java.awt.Polygon;
import java.util.Collection;

public class ShapeBoxBasedOnPolygon implements IShapeBox {

	private Polygon polygon;
	private Collection<Couple<Double, Double>> box;
	
	public ShapeBoxBasedOnPolygon(Collection<Couple<Double, Double>> box) {		
		polygon = new Polygon();
		for (Couple<Double, Double> c : box)
			polygon.addPoint((int)Math.floor(c.getFirst()), (int)Math.floor(c.getSecond()));
		this.box = box;
	}
	
	@Override
	public double getWidth() {
		return polygon.getBounds().getWidth();
	}

	@Override
	public double getHeight() {
		return polygon.getBounds().getHeight();
	}

	@Override
	public boolean contains(Couple<Double, Double> couple) {
		return polygon.contains(couple.getFirst(), couple.getSecond());
	}

	@Override
	public Collection<Couple<Double, Double>> getBoxPoints() {
		return box;
	}

}
