package Main;
import java.util.Timer;
import java.util.TimerTask;

public class TimerWrapperObservable extends AbstractObservable {

	private Timer timer;
	
	public TimerWrapperObservable(Timer timer) {
		super();
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
