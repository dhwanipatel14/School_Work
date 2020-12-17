
public class TestMicrowave {

	public static void main(String[] args) {
		Microwave microwave1 = new Microwave();
		microwave1.increaseTime();
		microwave1.increaseTime();
		System.out.printf("Actual : Microvave is running at time %d seconds.\n", microwave1.getTime());
		System.out.printf("Expected : Microvave is running at time 60 seconds.\n\n");
		
		microwave1.changeLevel();
		System.out.printf("Actual : Microvave is running at time %d seconds at %s level.\n", microwave1.getTime(),microwave1.getpowerlevel());
		System.out.printf("Expected : Microvave is running at time 60 seconds at MEDIUM level.\n\n");
		
		microwave1.start();
		System.out.println("Expected: cooking for 60 seconds at level MEDIUM.\n");
		
		microwave1.increaseTime();
		microwave1.changeLevel();
		System.out.println("Expected : Cooking for 90 seconds at level HIGH.\n");
		
		microwave1.stop();
		System.out.println("Expected: Your Cooking is successfully done for 90s at level HIGH.\n");
		
		microwave1.reset();
		System.out.println("Expected : Your Microwvae is succesfully at reset mode.\n");
		
		

	}

}
