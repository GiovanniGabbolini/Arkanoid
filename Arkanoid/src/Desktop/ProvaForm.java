package Desktop;

import java.util.ArrayList;
import java.util.Timer;
import javax.swing.JFrame;

import Main.BoardCollisionObserver;
import Main.ConcreteReferenceFrameConvertor;
import Main.Couple;
import Main.GameItemComposite;
import Main.GameItemStraightLineProgressionTickStrategy;
import Main.ModelGameItem;
import Main.ModelGameItemDecoratorPositionObservable;
import Main.ShapeBoxBasedOnPolygon;
import Main.TimerWrapperObservable;

public class ProvaForm {

	JFrame myFrame;
	ProvaCustomPanelObserver mainPanel;

	public ProvaForm() {
		int formWidth = 400, formHeigth = 400;
		
		TimerWrapperObservable timer = new TimerWrapperObservable(new Timer());
		timer.start(0, 1);
		
		Graphics2DHandler g2DHandler = new Graphics2DHandler();
		
		ArrayList<Couple<Double, Double>> couples = new ArrayList<>();
		couples.add(new Couple<Double, Double>(10.0, 10.0));
		couples.add(new Couple<Double, Double>(10.0, 20.0));
		couples.add(new Couple<Double, Double>(20.0, 20.0));
		couples.add(new Couple<Double, Double>(20.0, 10.0));
		ShapeBoxBasedOnPolygon box = new ShapeBoxBasedOnPolygon(couples);
		
		ModelGameItemDecoratorPositionObservable model = new ModelGameItemDecoratorPositionObservable(
				new ModelGameItem(100, 10, 0.1, 0.1, box, 0, 0));
		BoardCollisionObserver boardObsX = new BoardCollisionObserver(model, new ConcreteReferenceFrameConvertor(formWidth, formHeigth));
		
		ArrayList<GameItemComposite> items = new ArrayList<>();
		GameItemComposite item = new GameItemComposite(model, 
				new GameItemStraightLineProgressionTickStrategy(),
				new DrawGameItemCircleStrategyDesktop(
					new ConcreteReferenceFrameConvertor(formWidth, formHeigth), g2DHandler));
		items.add(item);
		
		myFrame = new JFrame("Frame Title");
		myFrame.setSize(formWidth, formHeigth);
		myFrame.setVisible(true);
		
		mainPanel = new ProvaCustomPanelObserver(timer, items, g2DHandler);
		mainPanel.startTimer();
		myFrame.getContentPane().add(mainPanel);
		
	}
	
}
