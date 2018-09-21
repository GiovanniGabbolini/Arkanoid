package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Main.ConcreteReferenceFrameConvertor;
import Main.Couple;
import Main.ShapeBoxBasedOnPolygon;

class ShapeBoxPolygon {

	@Test
	void test() {		
		int w = 400, h = 400;
		
		ArrayList<Couple<Integer, Integer>> couples = new ArrayList<>();
		couples.add(new Couple<Integer, Integer>(10, 10));
		couples.add(new Couple<Integer, Integer>(10, 20));
		couples.add(new Couple<Integer, Integer>(20, 20));
		couples.add(new Couple<Integer, Integer>(20, 10));
		
		ShapeBoxBasedOnPolygon box = new ShapeBoxBasedOnPolygon(couples);
		
		assertEquals(10, box.getWidth());
		assertEquals(10, box.getHeight());
	}

}
