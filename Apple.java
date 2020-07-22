package fruits;

public class Apple extends Fruit{

	private static int conversionCoefficient = 40; //fruit to juice conversion factor

	public Apple() {}

	public Apple(int weight) {
		setWeight(weight);
	}
	
	public void setWeight(int weight) {
		if(weight >= 10 && weight <= 1000)		
			super.setWeight(weight);
	}
	
	public int getCoefficient() {
		return conversionCoefficient;
	}
	
}	
	
