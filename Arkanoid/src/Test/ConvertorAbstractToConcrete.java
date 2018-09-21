package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Main.ConcreteReferenceFrameConvertor;

class ConvertorAbstractToConcrete {

	@Test
	void test() {
		int w = 400, h = 400;
		ConcreteReferenceFrameConvertor convertor = new ConcreteReferenceFrameConvertor(w, h);
		
		assertEquals(382, convertor.getConcreteX(0.957));
		assertEquals(222, convertor.getConcreteY(0.556));
		
	}

}
