package Main;
import java.util.Timer;
import java.util.TimerTask;

public class TimerWrapperObservable extends AbstractObservable {

	private Timer timer;
	static long start;
	
	public TimerWrapperObservable(Timer timer) {
		super();
		this.timer = timer;
	}
	
	public void start(long delay, long repTime) {
		start = System.nanoTime();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(start - System.nanoTime());
				ack();
				start = System.nanoTime();
			}
		}, delay, repTime);
	}
	
	public void stop() {
		timer.cancel();
	}
	
}
