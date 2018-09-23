package Main;

import java.util.Collection;

public interface IShapeBox {

	public Collection<Couple<Double, Double>> getBoxPoints();
	
	public double getWidth();
	
	public double getHeight();
	
	public boolean contains(Couple<Double, Double> couple);
	
}
