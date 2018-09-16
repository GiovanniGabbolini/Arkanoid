package Main;
import java.util.function.Consumer;

public class GameItemStraightLineProgressionTickStrategy implements Consumer<IGameItem> {

	@Override
	public void accept(IGameItem t) {
		t.getState().setX(t.getState().getX() + t.getState().getVx());
		t.getState().setY(t.getState().getY() + t.getState().getVy());
	}
	
}
