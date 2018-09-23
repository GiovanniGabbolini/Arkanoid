package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Main.Couple;
import Main.ShapeBoxBasedOnPolygon;

class ShapeBoxPolygonContains {

	@Test
	void test() {
		ArrayList<Couple<Double, Double>> couples = new ArrayList<>();
		couples.add(new Couple<Double, Double>(10.0, 10.0));
		couples.add(new Couple<Double, Double>(10.0, 20.0));
		couples.add(new Couple<Double, Double>(20.0, 20.0));
		couples.add(new Couple<Double, Double>(20.0, 10.0));
		
		ShapeBoxBasedOnPolygon box = new ShapeBoxBasedOnPolygon(couples);
		
		Couple<Double, Double> c = new Couple<Double, Double>(12.0, 11.0);
		
		assertTrue(box.contains(c));
	}

}
