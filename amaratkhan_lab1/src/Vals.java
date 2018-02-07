
public class Vals extends Term {
	private double myValue;
	
	public Vals(double m) {
		this.myValue = m;
	}
	
	public double getValue() {
		return myValue;
	}
	
	public int getDepth() {
		return 0;
	}
}
