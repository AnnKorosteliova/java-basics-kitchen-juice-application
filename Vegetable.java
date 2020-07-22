package vegetables;

import liquids.JuiceableInterface;

public abstract class Vegetable implements JuiceableInterface {
	
	private int weight; //gramms
	
	public int getWeight() {
		return weight;
	}
	
	protected void setWeight(int weight) {		
			this.weight = weight;
	}
	
	public abstract int getCoefficient();
		
}
