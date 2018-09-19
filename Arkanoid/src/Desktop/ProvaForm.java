package Desktop;

import java.util.ArrayList;
import java.util.Timer;
import javax.swing.JFrame;

import Main.BoardCollisionObserver;
import Main.ConcreteReferenceFrameConvertor;
import Main.GameItemComposite;
import Main.GameItemStraightLineProgressionTickStrategy;
import Main.ModelGameItem;
import Main.ModelGameItemDecoratorPositionObservable;
import Main.TimerWrapperObservable;

public class ProvaForm {

	JFrame myFrame;
	ProvaCustomPanelObserver mainPanel;
	
	public ProvaForm() {
		
		TimerWrapperObservable timer = new TimerWrapperObservable(new Timer());
		timer.start(0, 1);
		
		Graphics2DHandler g2DHandler = new Graphics2DHandler();
		
		ModelGameItemDecoratorPositionObservable model = new ModelGameItemDecoratorPositionObservable(
				new ModelGameItem(0.1, 0.1, 0.001, 0.001, null, 0, 0));
		BoardCollisionObserver boardObs = new BoardCollisionObserver(model);
		
		ArrayList<GameItemComposite> items = new ArrayList<>();
		GameItemComposite item = new GameItemComposite(model, 
				new GameItemStraightLineProgressionTickStrategy(),
				new DrawGameItemCircleStrategyDesktop(
					new ConcreteReferenceFrameConvertor(100, 100), g2DHandler));
		items.add(item);
		
		myFrame = new JFrame("Frame Title");
		myFrame.setSize(400, 400);
		myFrame.setVisible(true);
		
		mainPanel = new ProvaCustomPanelObserver(timer, items, g2DHandler);
		mainPanel.startTimer();
		myFrame.getContentPane().add(mainPanel);
		
	}
	
}
