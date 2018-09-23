package Main;

public class ModelGameItemDecoratorPositionObservable extends AbstractObservable implements IModelGameItem {

	private IModelGameItem modelGameItem;
	
	public ModelGameItemDecoratorPositionObservable(IModelGameItem modelGameItem) {
		super();
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
		double old = modelGameItem.getX();
		modelGameItem.setX(x);
		if (old != x)
			ack();
	}

	@Override
	public double getY() {
		return modelGameItem.getY();
	}

	@Override
	public void setY(double y) {
		double old = modelGameItem.getY();
		modelGameItem.setY(y);
		if (old != y)
			ack();
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
	public IShapeBox getShapeBox() {
		return modelGameItem.getShapeBox();
	}

	@Override
	public void setShapeBox(IShapeBox box) {
		modelGameItem.setShapeBox(box);
	}

}
