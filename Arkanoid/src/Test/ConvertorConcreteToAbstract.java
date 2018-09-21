package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.ConcreteReferenceFrameConvertor;

class ConvertorConcreteToAbstract {

	@Test
	void test() {
		int w = 400, h = 400;
		ConcreteReferenceFrameConvertor convertor = new ConcreteReferenceFrameConvertor(w, h);
		
		assertEquals(0.955, convertor.getAbstractX(382));
		assertEquals(0.555, convertor.getAbstractY(222));
	}

}
