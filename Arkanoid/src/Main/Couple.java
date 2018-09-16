package Main;

public class Couple <T,E> {

	private T t;
	private E e;
	
	public Couple(T t, E e) {
		super();
		this.t = t;
		this.e = e;
	}
	
	public T getFirst() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public E getSecond() {
		return e;
	}
	public void setE(E e) {
		this.e = e;
	}
		
		
}
