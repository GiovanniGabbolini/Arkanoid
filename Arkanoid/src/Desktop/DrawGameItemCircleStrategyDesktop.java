package Desktop;

import java.awt.Graphics2D;
import java.util.function.Consumer;
import Main.ConcreteReferenceFrameConvertor;
import Main.IGameItem;

public class DrawGameItemCircleStrategyDesktop implements Consumer<IGameItem> {

	private ConcreteReferenceFrameConvertor convertor;
	private Graphics2DHandler g2DHandler;
	
	public DrawGameItemCircleStrategyDesktop(ConcreteReferenceFrameConvertor convertor, Graphics2DHandler g2DHandler) {
		super();
		this.convertor = convertor;
		this.g2DHandler = g2DHandler;
	}

	@Override
	public void accept(IGameItem t) {
		Graphics2D g2D = g2DHandler.getPen();
		g2D.drawOval(convertor.getConcreteX(t.getState().getX()), 
						convertor.getConcreteY(t.getState().getY()),
							100, 100);
	}

}
