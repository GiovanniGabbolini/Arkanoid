import java.util.function.Consumer;

public class GameItemStraightLineProgressionStrategy implements Consumer<IGameItem> {

	@Override
	public void accept(IGameItem t) {
		t.getState().setX(t.getState().getX() + t.getState().getX() * t.getState().getVx());
		t.getState().setY(t.getState().getY() + t.getState().getY() * t.getState().getVy());
	}
	
}
