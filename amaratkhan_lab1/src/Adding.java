
public class Adding extends Opers {
	
	public Adding(Term l, Term r) {
		super(l, r);
	}
	
	@Override
	public double getValue() {
		return this.leftVal.getValue() + this.rightVal.getValue();
	}

}
