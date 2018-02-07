
public class SensorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SensorSubject sens = new SensorSubject();
		SensorListener o1 = new SensorListener("Listener 1", sens);
		SensorListener o2 = new SensorListener("Listener 2", sens);
		
		sens.addListener(o1);
		sens.addListener(o2);
		sens.removeListener(o1);
		
		Thread t = new Thread(new SensorEnv(sens));
		t.start();
	}

}
