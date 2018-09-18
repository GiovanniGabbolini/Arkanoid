package Main;
import java.util.ArrayList;

public abstract class AbstractObservable {

	private ArrayList<IObserver> observed;

	public AbstractObservable() {
		super();
		observed = new ArrayList<>();
	}

	public void add(IObserver obs) {
		observed.add(obs);
	}
	
	public void ack() {
		for(IObserver o : observed)
			o.ack();
	}
	
}

