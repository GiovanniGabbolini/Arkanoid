import java.util.ArrayList;

public class ModelGameItem implements IModelGameItem{

	private int x, y, vx, vy, ax, ay;
	private ArrayList<Couple<Integer, Integer>> box;
	
	public ModelGameItem(int x, int y, int vx, int vy, ArrayList<Couple<Integer, Integer>> box, int ax, int ay) {
		super();
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.box = box;
		this.ax = ax;
		this.ay = ay;
	}

	public int getAx() {
		return ax;
	}

	public void setAx(int ax) {
		this.ax = ax;
	}

	public int getAy() {
		return ay;
	}

	public void setAy(int ay) {
		this.ay = ay;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getVx() {
		return vx;
	}
	
	public void setVx(int vx) {
		this.vx = vx;
	}
	
	public int getVy() {
		return vy;
	}
	
	public void setVy(int vy) {
		this.vy = vy;
	}
	
	public ArrayList<Couple<Integer, Integer>> getBox() {
		return box;
	}
	
	public void setBox(ArrayList<Couple<Integer, Integer>> box) {
		this.box = box;
	}
	
}
