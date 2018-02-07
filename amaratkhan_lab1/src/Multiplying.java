
public class Multiplying extends Opers {

	public Multiplying(Term l, Term r) {
		super(l, r);
	}
	
	@Override
	public double getValue() {
		return this.leftVal.getValue() * this.rightVal.getValue();
	}
	
}
