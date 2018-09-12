import java.util.ArrayList;

public interface IModelGameItem {

	public int getAx();

	public void setAx(int ax);

	public int getAy();

	public void setAy(int ay);
	
	public int getX();
	
	public void setX(int x);
	
	public int getY();
	
	public void setY(int y);
	
	public int getVx();
	
	public void setVx(int vx);
	
	public int getVy();
	
	public void setVy(int vy);
	
	public ArrayList<Couple<Integer, Integer>> getBox();
	
	public void setBox(ArrayList<Couple<Integer, Integer>> box);
	
}
