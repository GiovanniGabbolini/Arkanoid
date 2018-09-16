package Main;

import java.util.function.Consumer;

public class GameItemComposite implements IGameItem {

	private IModelGameItem gameItemModel;
	private Consumer<IGameItem> tickStrategy;
	private Consumer<IGameItem> drawStrategy;
	
	public GameItemComposite(IModelGameItem gameItemModel, Consumer<IGameItem> tickStrategy, Consumer<IGameItem> drawStrategy) {
		super();
		this.gameItemModel = gameItemModel;
		this.tickStrategy = tickStrategy;
		this.drawStrategy = drawStrategy;
	}

	@Override
	public void tick() {
		tickStrategy.accept(this);
	}

	@Override
	public void draw() {
		drawStrategy.accept(this);
	}

	@Override
	public IModelGameItem getState() {
		return gameItemModel;
	}

	@Override
	public void setState(IModelGameItem gameItemModel) {
		this.gameItemModel = gameItemModel;
	}
	
}
