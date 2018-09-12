import java.util.ArrayList;

public class ModelGameItemDecoratorPositionObservable extends AbstractObservable implements IModelGameItem {

	private IModelGameItem modelGameItem;
	
	public ModelGameItemDecoratorPositionObservable(IModelGameItem modelGameItem) {
		super();
		this.modelGameItem = modelGameItem;
	}

	@Override
	public int getAx() {
		return modelGameItem.getAx();
	}

	@Override
	public void setAx(int ax) {
		modelGameItem.setAx(ax);
	}

	@Override
	public int getAy() {
		return modelGameItem.getAy();
	}

	@Override
	public void setAy(int ay) {
		modelGameItem.setAy(ay);
	}

	@Override
	public int getX() {
		return modelGameItem.getX();
	}

	@Override
	public void setX(int x) {
		if (modelGameItem.getX() != x)
			ack();
		modelGameItem.setX(x);
	}

	@Override
	public int getY() {
		return modelGameItem.getY();
	}

	@Override
	public void setY(int y) {
		if (modelGameItem.getY() != y)
			ack();
		modelGameItem.setX(y);
	}

	@Override
	public int getVx() {
		return modelGameItem.getVx();
	}

	@Override
	public void setVx(int vx) {
		modelGameItem.setVx(vx);
	}

	@Override
	public int getVy() {
		return modelGameItem.getVy();
	}

	@Override
	public void setVy(int vy) {
		modelGameItem.setVy(vy);
	}

	@Override
	public ArrayList<Couple<Integer, Integer>> getBox() {
		return modelGameItem.getBox();
	}

	@Override
	public void setBox(ArrayList<Couple<Integer, Integer>> box) {
		modelGameItem.setBox(box);
	}

}
