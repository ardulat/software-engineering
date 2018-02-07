
public class SensorEnv implements Runnable {
	
	private boolean ended = false;
	private SensorSubject sens;
	
	public SensorEnv(SensorSubject sens) {
		this.sens = sens;
	}
	
	@Override
	public void run() {
		int n = 20;
		
		try {
			while(!ended) {
				n = n-1;
				if(n < 1) {
					ended = true;
				}
				
				Thread.sleep(1000);
				
				if(Math.random() > 0.6) {
					System.out.println("SensorEnv: Event!");
					sens.eventHappened();
				} else {
					System.out.println("SensorEnv: No Event!");
				}
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
