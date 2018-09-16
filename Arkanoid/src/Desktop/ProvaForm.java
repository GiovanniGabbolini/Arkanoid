package Desktop;

import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Main.ConcreteReferenceFrameConvertor;
import Main.GameItemComposite;
import Main.GameItemStraightLineProgressionTickStrategy;
import Main.IModelGameItem;
import Main.IObserver;
import Main.ModelGameItem;
import Main.ShapeBox;
import Main.TimerWrapper;

public class ProvaForm {

	JFrame myFrame;
	ProvaCustomPanel mainPanel;
	
	public ProvaForm() {
		ArrayList<IObserver> observer = new ArrayList<>();
		
		TimerWrapper timer = new TimerWrapper(new Timer(), observer);
		timer.start(0, 100);
		
		myFrame = new JFrame("Frame Title");
		myFrame.setSize(400, 400);
		myFrame.setVisible(true);
		
		Graphics2DHandler g2DHandler = new Graphics2DHandler();
		
		ArrayList<GameItemComposite> items = new ArrayList<>();
		GameItemComposite item = null;
		
		item = new GameItemComposite(
				new ModelGameItem(0.1, 0.1, 0.01, 0.01, null, 0, 0), 
				new GameItemStraightLineProgressionTickStrategy(),
				new DrawGameItemCircleStrategyDesktop(
						new ConcreteReferenceFrameConvertor(100, 100), g2DHandler));
		items.add(item);
		
		mainPanel = new ProvaCustomPanel(timer, items, g2DHandler);
		mainPanel.startObserving();
		myFrame.getContentPane().add(mainPanel);
	}
	
}
