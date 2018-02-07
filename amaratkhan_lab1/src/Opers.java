
public abstract class Opers extends Term {
	protected Term leftVal;
	protected Term rightVal;
	
	public Opers(Term l, Term r) {
		this.leftVal = l;
		this.rightVal = r;
	}
	
	@Override
	public int getDepth() {
		return 1 + Math.max(this.leftVal.getDepth(), this.rightVal.getDepth());
	}
}
