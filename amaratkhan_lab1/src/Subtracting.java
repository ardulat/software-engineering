
public class Subtracting extends Opers {
	
	public Subtracting(Term l, Term r) {
		super(l, r);
	}
	
	@Override
	public double getValue() {
		return this.leftVal.getValue() - this.rightVal.getValue();
	}
}
