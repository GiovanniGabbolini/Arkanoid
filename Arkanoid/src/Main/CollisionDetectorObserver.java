package Main;

import java.util.Collection;

public class CollisionDetectorObserver implements IObserver {

	private Collection<GameItemComposite> gameObjects;
	private GameItemComposite observedGameObject;
		
	public CollisionDetectorObserver(Collection<GameItemComposite> gameObjects, GameItemComposite observedGameObject) {
		super();
		this.gameObjects = gameObjects;
		this.observedGameObject = observedGameObject;
	}

	@Override
	public void ack() {
		for(GameItemComposite o : gameObjects)
			if(!o.equals(observedGameObject))
				
				for(Couple<Double, Double> c : o.getState().getShapeBox().getBoxPoints()) {
					c.setFirst(o.getState().getX() + c.getFirst());
					c.setSecond(o.getState().getY() + c.getSecond());
					if(observedGameObject.getState().getShapeBox().contains(c))
						System.out.println("collided");
				}
	}

}
