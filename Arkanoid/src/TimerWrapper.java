import java.util.Timer;
import java.util.TimerTask;

public class TimerWrapper extends AbstractObservable {

	private Timer timer;
	
	public TimerWrapper(Timer timer) {
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
