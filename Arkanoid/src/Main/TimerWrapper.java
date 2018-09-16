package Main;
import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

public class TimerWrapper extends AbstractObservable {

	private Timer timer;
	
	public TimerWrapper(Timer timer, Collection<IObserver> observed) {
		super(observed);
		this.timer = timer;
	}
	
	public void start(long delay, long repTime) {
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				ack();
			}
		}, delay, repTime);
	}
	
	public void stop() {
		timer.cancel();
	}
	
}
