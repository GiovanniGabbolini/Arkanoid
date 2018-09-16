package Main;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class GameItemCollisionManager {
	
	private Collection<IGameItem> gameItems;
	private Predicate<IGameItem> checkCollisionStrategy;
	private Consumer<IGameItem> solveCollisionStrategy;
	
	public GameItemCollisionManager(Collection<IGameItem> gameItems, Predicate<IGameItem> checkCollisionStrategy,
			Consumer<IGameItem> solveCollisionStrategy) {
		super();
		this.gameItems = gameItems;
		this.checkCollisionStrategy = checkCollisionStrategy;
		this.solveCollisionStrategy = solveCollisionStrategy;
	}
	
	public boolean checkCollision(IGameItem gameItem) {
		return checkCollisionStrategy.test(gameItem);
	}
	
	public void solveCollision(IGameItem gameItem) {
		solveCollisionStrategy.accept(gameItem);
	}
	
}
