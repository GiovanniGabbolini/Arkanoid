package Main;
import java.util.Collection;

public abstract class AbstractObservable {

	private Collection<IObserver> observed;

	public AbstractObservable(Collection<IObserver> observed) {
		super();
		this.observed = observed;
	}

	public void add(IObserver obs) {
		observed.add(obs);
	}
	
	public void ack() {
		for(IObserver o : observed)
			o.ack();
	}
	
}

