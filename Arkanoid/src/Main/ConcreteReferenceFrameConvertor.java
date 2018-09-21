package Main;

/*
 * throughout the Main model, position of objects is expressed in doubles
 * from 0 to 1, to be really not dependent from the real width and height of
 * the panel where the objects will be show
 * this class allows to pass to real coordinate specifying width and height
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
