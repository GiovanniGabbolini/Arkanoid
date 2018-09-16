package Main;

import java.util.Collection;

public class ModelGameItemDecoratorPositionObservable extends AbstractObservable implements IModelGameItem {

	private IModelGameItem modelGameItem;
	
	public ModelGameItemDecoratorPositionObservable(IModelGameItem modelGameItem, Collection<IObserver> observed) {
		super(observed);
		this.modelGameItem = modelGameItem;
	}

	@Override
	public double getAx() {
		return modelGameItem.getAx();
	}

	@Override
	public void setAx(double ax) {
		modelGameItem.setAx(ax);
	}

	@Override
	public double getAy() {
		return modelGameItem.getAy();
	}

	@Override
	public void setAy(double ay) {
		modelGameItem.setAy(ay);
	}

	@Override
	public double getX() {
		return modelGameItem.getX();
	}

	@Override
	public void setX(double x) {
		if (modelGameItem.getX() != x)
			ack();
		modelGameItem.setX(x);
	}

	@Override
	public double getY() {
		return modelGameItem.getY();
	}

	@Override
	public void setY(double y) {
		if (modelGameItem.getY() != y)
			ack();
		modelGameItem.setX(y);
	}

	@Override
	public double getVx() {
		return modelGameItem.getVx();
	}

	@Override
	public void setVx(double vx) {
		modelGameItem.setVx(vx);
	}

	@Override
	public double getVy() {
		return modelGameItem.getVy();
	}

	@Override
	public void setVy(double vy) {
		modelGameItem.setVy(vy);
	}

	@Override
	public ShapeBox getBox() {
		return modelGameItem.getBox();
	}

	@Override
	public void setBox(ShapeBox box) {
		modelGameItem.setBox(box);
	}

}
