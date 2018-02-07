
public class SensorListener implements Listens {

	private String name;
	private SensorSubject sens;
	
	public SensorListener(String name, SensorSubject sens) {
		this.name = name;
		this.sens = sens;
	}
	
	@Override
	public void update() {
		System.out.println(
				"SensorListener: Update detected by " + this.name + "!");
	}

}
