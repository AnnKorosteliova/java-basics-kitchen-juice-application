package main;

import fruits.Apple;
import fruits.Orange;
import kitchen.Blender;
import kitchen.Cup;
import liquids.JuiceableInterface;
import vegetables.Carrot;

public class Application {

	public static void main(String[] args) {

		JuiceableInterface smallOrange = new Orange(50);
		JuiceableInterface mediumOrange = new Orange(100);
		JuiceableInterface bigOrange = new Orange(200);
		JuiceableInterface mediumApple = new Apple(100);
		JuiceableInterface mediumCarrot = new Carrot(100);
		
		Blender cheapBlender = new Blender("F1rst");
		
		Cup bigCup = new Cup();
		bigCup.setContent( cheapBlender.makeJuice(bigOrange) );
		bigCup.addContent( cheapBlender.makeJuice(smallOrange) );
		bigCup.addContent( cheapBlender.makeJuice(mediumOrange) );
		bigCup.addContent( cheapBlender.makeJuice(mediumApple) );
		bigCup.addContent( cheapBlender.makeJuice(mediumCarrot) );
		
		System.out.println("In the cup " + bigCup.getContent().getVolume() + " ml of juice");	
	}
}
