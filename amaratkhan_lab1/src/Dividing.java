
public class Dividing extends Opers {

	public Dividing(Term l, Term r) {
		super(l, r);
	}
	
	@Override
	public double getValue() {
		return this.leftVal.getValue() / this.rightVal.getValue();
	}
}
