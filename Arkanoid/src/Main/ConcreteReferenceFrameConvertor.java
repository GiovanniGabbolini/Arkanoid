package Main;

/*
 * throughout the Main model, position of objects is expressed 
 * according to the size of the full panel.
 * in order to avoid the hardcoding of any coordinates, we 
 * exploit this convertor at the moment of the creation of objects
 */

public class ConcreteReferenceFrameConvertor {

	private double concreteWidth, concreteHeight;

	public ConcreteReferenceFrameConvertor(int concreteWidth, int concreteHeight) {
		super();
		this.concreteWidth = concreteWidth;
		this.concreteHeight = concreteHeight;
	}
	
	public int getConcreteX(double abstractX) {
		return (int)Math.floor(abstractX * concreteWidth);
	}
	
	public int getConcreteY(double abstractY) {
		return (int)Math.floor(abstractY * concreteHeight);
	}
	
	public double getAbstractX(int concreteX) {
		return concreteX / concreteWidth;
	}
	
	public double getAbstractY(int concreteY) {
		return concreteY / concreteHeight;
	}
	
	public double getConcreteWidth() {
		return concreteWidth;
	}

	public double getConcreteHeight() {
		return concreteHeight;
	}
}
