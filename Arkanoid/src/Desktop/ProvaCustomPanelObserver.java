package Desktop;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Collection;
import javax.swing.JPanel;
import Main.TimerWrapperObservable;
import Main.GameItemComposite;

public class ProvaCustomPanelObserver extends JPanel implements Main.IObserver{
	
	private TimerWrapperObservable timer; // the timer
	private Collection<GameItemComposite> items;
	private Graphics2DHandler g2DHandler;
	
	public ProvaCustomPanelObserver(TimerWrapperObservable timer, Collection<GameItemComposite> items, Graphics2DHandler g2DHandler) {
		this.timer = timer;
		this.items = items;
		this.g2DHandler = g2DHandler;
	}
	
	public void startTimer() {
		this.timer.add(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g2DHandler.setPen((Graphics2D)g);
		for (GameItemComposite i : items) {
			i.draw();
		}
	}
	
	@Override
	public void ack() {
		for (GameItemComposite i : items)
			i.tick();
		this.repaint();	
	}
	
}
