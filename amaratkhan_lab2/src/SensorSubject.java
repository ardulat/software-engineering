import java.util.HashSet;
import java.util.Set;

public class SensorSubject implements Sensed {

	private Set<Listens> observers;
	private int eventsCount = 0;

	public SensorSubject() {
		this.observers = new HashSet<Listens>();
	}
	
	@Override
	public void addListener(Listens o) {
		this.observers.add(o);
	}

	@Override
	public void removeListener(Listens o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyListeners() {
		for(Listens o:this.observers) {
			o.update();
		}
	}
	
	public void eventHappened() {
		eventsCount++;
		System.out.println(
				"SensorSubject: " + eventsCount + " Events Have Happened!");
		this.notifyListeners();
	}
	
}
