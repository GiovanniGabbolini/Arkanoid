import java.util.ArrayList;

public class ShapeBox {

	ArrayList<Couple<Double, Double>> box;
	
	public ShapeBox(ArrayList<Couple<Double, Double>> box) {
		this.box = box;
	}
	
	public double getWidth() {
		double minX = 1, maxX = 0;
		for(Couple<Double, Double> c : box) {
			if (c.getFirst() < minX)
				minX = c.getFirst();
			if (c.getFirst() > maxX)
				maxX = c.getFirst();
		}
		return maxX - minX;
	}
	
	public double getHeight() {
		double minY = 1, maxY = 0;
		for(Couple<Double, Double> c : box) {
			if (c.getSecond() < minY)
				minY = c.getSecond();
			if (c.getSecond() > maxY)
				maxY = c.getSecond();
		}
		return maxY - minY;
	}
	
}
