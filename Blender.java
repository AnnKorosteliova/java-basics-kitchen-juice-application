package kitchen;

import fruits.Orange;
import liquids.Juice;

public class Blender {

	private String brand;

	public Blender() {}
	
	public Blender(String brand) {  
		setBrand(brand);
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if( brand.trim().equals("") || brand.trim().equals(null))
			System.out.println("Uncorrect brand name");
	    else
	    	this.brand = brand;
	}
	
	public Juice makeJuice(Orange orange) {
		Juice juice = new Juice(orange.getWeight() * Orange.conversionCoefficient / 100);
		return juice;
	}
}
