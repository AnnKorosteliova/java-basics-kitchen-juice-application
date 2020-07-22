package vegetables;

public class Carrot extends Vegetable {

	private static int conversionCoefficient = 30; //fruit to juice conversion factor

	public Carrot() {}

	public Carrot(int weight) {
		setWeight(weight);
	}
		
	public void setWeight(int weight) {
		if(weight >= 10 && weight <= 1500)		
			super.setWeight(weight);
	}
	
	public int getCoefficient() {
		return conversionCoefficient;
	}
	
}
