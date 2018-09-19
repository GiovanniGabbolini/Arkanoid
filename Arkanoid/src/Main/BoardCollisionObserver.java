package Main;

public class BoardCollisionObserver implements IObserver {

	private ModelGameItemDecoratorPositionObservable obs;
	
	public BoardCollisionObserver(ModelGameItemDecoratorPositionObservable obs) {
		super();
		this.obs = obs;
		obs.add(this);
	}

	@Override
	public void ack() {
		if(obs.getX() + obs.getBox().getWidth() >= 1 || obs.getX() < 0)
			obs.setVx(-obs.getVx());
		if(obs.getY() + obs.getBox().getHeight() >= 1 || obs.getY() < 0)
			obs.setVy(-obs.getVy());			
	}
			
}
