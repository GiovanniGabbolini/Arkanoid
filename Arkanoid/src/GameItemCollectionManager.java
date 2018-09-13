import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class GameItemCollectionManager {

	private ArrayList<IGameItem> gameItems;
	private Predicate<IGameItem> checkCollisionStrategy;
	private Consumer<IGameItem> solveCollisionStrategy;
	
	public GameItemCollectionManager(ArrayList<IGameItem> gameItems) {
		super();
		this.gameItems = gameItems;
	}

	public ArrayList<IGameItem> getGameItems() {
		return gameItems;
	}
	
	public boolean checkCollision(IGameItem gameItem) {
		return checkCollisionStrategy.test(gameItem);
	}
	
	public void solveCollision(IGameItem gameItem) {
		solveCollisionStrategy.accept(gameItem);
	}
}
