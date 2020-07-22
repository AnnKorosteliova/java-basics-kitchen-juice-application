package fruits;

import liquids.JuiceableInterface;

public abstract class Fruit implements JuiceableInterface {
	
	private int weight; //gramms
	
	public int getWeight() {
		return weight;
	}
	
	protected void setWeight(int weight) {		
			this.weight = weight;
	}
	
	public abstract int getCoefficient();
		
}
