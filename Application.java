package main;

import fruits.Orange;
import kitchen.Blender;
import kitchen.Cup;

public class Application {

	public static void main(String[] args) {

		Orange smallOrange = new Orange(50);
		Orange mediumOrange = new Orange(100);
		Orange bigOrange = new Orange(200);
		
		Blender cheapBlender = new Blender("F1rst");
		
		//Juice juice = cheapBlender.makeJuice(bigOrange);
		
		Cup bigCup = new Cup();
		bigCup.setContent( cheapBlender.makeJuice(bigOrange) );
		bigCup.addContent( cheapBlender.makeJuice(smallOrange) );
		bigCup.addContent( cheapBlender.makeJuice(mediumOrange) );
		
		System.out.println("In the cup " + bigCup.getContent().getVolume() + " ml of juice");	
	}
}
