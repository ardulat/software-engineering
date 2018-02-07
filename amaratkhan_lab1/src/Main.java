
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplying x = new Multiplying(
				new Adding(new Vals(2.0), new Vals(2.0)), 
				new Adding(new Vals(2.0),
						new Multiplying(new Vals(2.0), new Vals(2.0)))
				);
		System.out.println(x.getDepth());
	}

}
