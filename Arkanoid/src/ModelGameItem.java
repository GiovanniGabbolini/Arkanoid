import java.util.ArrayList;

public class ModelGameItem implements IModelGameItem{

	private double x, y, vx, vy, ax, ay;
	private ShapeBox box;
	
	public ModelGameItem(double x, double y, double vx, double vy, ShapeBox box, double ax, double ay) {
		super();
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.box = box;
		this.ax = ax;
		this.ay = ay;
	}

	public double getAx() {
		return ax;
	}

	public void setAx(double ax) {
		this.ax = ax;
	}

	public double getAy() {
		return ay;
	}

	public void setAy(double ay) {
		this.ay = ay;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getVx() {
		return vx;
	}
	
	public void setVx(double vx) {
		this.vx = vx;
	}
	
	public double getVy() {
		return vy;
	}
	
	public void setVy(double vy) {
		this.vy = vy;
	}
	
	public ShapeBox getBox() {
		return box;
	}
	
	public void setBox(ShapeBox box) {
		this.box = box;
	}

}
