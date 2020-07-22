package fruits;

public class Orange extends Fruit{

	private static int conversionCoefficient = 60; //fruit to juice conversion factor

	public Orange() {}

	public Orange(int weight) {
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
