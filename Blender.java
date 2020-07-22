package kitchen;

import liquids.Juice;
import liquids.JuiceableInterface;

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
	
	public Juice makeJuice(JuiceableInterface juiceable) {
		Juice juice = new Juice( (int)(juiceable.getWeight() * juiceable.getCoefficient() / 100.0) );
		return juice;
	}
}
