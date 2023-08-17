import classes.Location;
import classes.Animal;
import classes.Goldfinch;
import classes.BrownBear;
import java.util.ArrayList;

public class AnimalApplication {

	public static void main(String[] args) throws Exception {
		
		System.out.println("***************************************");
		System.out.println();
		System.out.println("Location Tests");
		System.out.println();
		System.out.println("***************************************");
		
		Location firstLoc = new Location(1,2);
		
		System.out.println(firstLoc.toString());
		
		firstLoc.getxCoord();
		firstLoc.getyCoord();
		//System.out.println(firstLoc.getCoordinates());
		
		//firstLoc.setxCoord(-10);
		//firstLoc.setyCoord(-2);
		firstLoc.update(2, 4);
		
		System.out.println("***************************************");
		System.out.println();
		System.out.println("Animal Tests");
		System.out.println();
		System.out.println("***************************************");
		
		//Animal animal1 = new Animal();
		
		System.out.println("***************************************");
		System.out.println();
		System.out.println("Goldfinch Tests");
		System.out.println();
		System.out.println("***************************************");
		
		Goldfinch gold1 = new Goldfinch(10, new Location(9,8), 10.5);
		
		System.out.println(gold1.toString());
		//gold1.setWingSpan(2.6);
		//gold1.setSimID(-5);
		gold1.fly(new Location(10,5));
		System.out.println(gold1.sleep());
		System.out.println(gold1.eat());
		System.out.println(gold1.getWingSpan());
		gold1.isFull();
		
		System.out.println(gold1.toString());
		
		Goldfinch goldie = new Goldfinch();
		
		goldie.setSimID(248);
		goldie.setLocation(new Location (13,6));
		goldie.walk(1);
		goldie.getLocation();
		
		System.out.println(goldie.toString());
		
		System.out.println("***************************************");
		System.out.println();
		System.out.println("BrownBear Tests");
		System.out.println();
		System.out.println("***************************************");
		
		BrownBear bear1 = new BrownBear(332, new Location(5,4), "Siberian");
		
		System.out.println(bear1.toString());
		//bear1.setSubSpecies("Polar");
		bear1.walk(-3);
		System.out.println(bear1.sleep());
		System.out.println(bear1.eat());
		bear1.isRested();
		
		BrownBear winnie = new BrownBear();
		
		winnie.setLocation(new Location(6,9));
		//winnie.setSimID(-87);
		winnie.setSimID(947);
		winnie.swim(2);
		
		System.out.println(winnie.toString());
		
		System.out.println("***************************************");
		System.out.println();
		System.out.println("Generics Tests");
		System.out.println();
		System.out.println("***************************************");
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		Goldfinch gold2 = new Goldfinch(364, new Location(6,7), 11);
		Goldfinch gold3 = new Goldfinch(259, new Location (2,8), 7.8);
		
		animals.add(gold2);
		animals.add(gold3);
		
		BrownBear bear2 = new BrownBear(837, new Location (5,9), "European");
		BrownBear bear3 = new BrownBear(45, new Location (4,7), "Kodiak");
		
		animals.add(bear2);
		animals.add(bear3);
		
		for (Animal animal : animals)
			
			System.out.println(animals.toString());
			
	}// end main

}// end class
