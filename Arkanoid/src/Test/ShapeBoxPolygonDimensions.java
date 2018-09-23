package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Main.ConcreteReferenceFrameConvertor;
import Main.Couple;
import Main.ShapeBoxBasedOnPolygon;

class ShapeBoxPolygonDimensions {

	@Test
	void test() {		
		ArrayList<Couple<Double, Double>> couples = new ArrayList<>();
		couples.add(new Couple<Double, Double>(10.0, 10.0));
		couples.add(new Couple<Double, Double>(10.0, 20.0));
		couples.add(new Couple<Double, Double>(20.0, 20.0));
		couples.add(new Couple<Double, Double>(20.0, 10.0));
		
		ShapeBoxBasedOnPolygon box = new ShapeBoxBasedOnPolygon(couples);
		
		assertEquals(10, box.getWidth());
		assertEquals(10, box.getHeight());
	}

}
