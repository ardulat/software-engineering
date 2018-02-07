
public interface Sensed {
	
	public void addListener(Listens o);
	
	public void removeListener(Listens o);
	
	public void notifyListeners();
}
