package Main;

import java.awt.Polygon;
import java.util.Collection;

public class ShapeBoxBasedOnPolygon implements IShapeBox {

	private ConcreteReferenceFrameConvertor convertor;
	private Polygon polygon;
	
	public ShapeBoxBasedOnPolygon(Collection<Couple<Double, Double>> box, ConcreteReferenceFrameConvertor convertor) {
		this.convertor = convertor;
		
		polygon = new Polygon();
		for (Couple<Double, Double> c : box)
			polygon.addPoint(convertor.getConcreteX(c.getFirst()), convertor.getConcreteY(c.getSecond()));
	}
	
	@Override
	public double getWidth() {
		return convertor.getConcreteX(Math.floor(polygon.getBounds().getWidth()));
	}

	@Override
	public double getHeight() {
		return convertor.getConcreteY(Math.floor(polygon.getBounds().getHeight()));
	}

}
