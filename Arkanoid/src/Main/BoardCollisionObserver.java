package Main;

public class BoardCollisionObserver implements IObserver {

	private ModelGameItemDecoratorPositionObservable obs;
	private ConcreteReferenceFrameConvertor convertor;
	private String last = "";
	
	public BoardCollisionObserver(ModelGameItemDecoratorPositionObservable obs, ConcreteReferenceFrameConvertor convertor) {
		super();
		this.obs = obs;
		obs.add(this);
		this.convertor = convertor;
	}

	@Override
	public void ack() {
		if(obs.getX() + obs.getBox().getWidth() >= convertor.getConcreteWidth() || obs.getX() < 0)
			if (!last.equals("x")) {
				obs.setVx(-obs.getVx());
				last = "x";
			}
		if(obs.getY() + obs.getBox().getHeight() >= convertor.getConcreteHeight() || obs.getY() < 0)
			if (!last.equals("y")) {
				obs.setVy(-obs.getVy());
				last = "y";
			}
	}
			
}
