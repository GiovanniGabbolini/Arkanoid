import java.util.ArrayList;

public abstract class AbstractObservable {

	private ArrayList<IObserver> observed;
	
	public void add(IObserver obs) {
		observed.add(obs);
	}
	
	public void ack() {
		for(IObserver o : observed)
			o.ack();
	}
	
}

