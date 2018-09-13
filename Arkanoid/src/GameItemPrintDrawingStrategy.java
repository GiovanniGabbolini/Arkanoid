import java.util.function.Consumer;

public class GameItemPrintDrawingStrategy implements Consumer<IGameItem> {

	@Override
	public void accept(IGameItem t) {
		System.out.println(String.format("object in coordinate: (%i, %i ", t.getState().getX(), t.getState().getY()));
	}
	
}
