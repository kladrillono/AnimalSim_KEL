package classes;
import exceptions.InvalidWingspanException;
import interfaces.Flyable;
import interfaces.Walkable;

public class Goldfinch extends Animal implements Walkable, Flyable {
	
	private double wingSpan;
	
	public Goldfinch() throws Exception {
		
		super();
		this.simID = 0;
		this.location = new Location(0,0);
		this.full = false;
		this.rested = true;
		this.wingSpan = 9.0;
		
	}// end empty-argument constructor
	
	public Goldfinch(int simID, Location l, double wingSpan) throws Exception {
		
		super();
		this.simID = simID;
		this.location = l;
		this.setWingSpan(wingSpan);
		this.full = false;
		this.rested = true;
		
	}// end preferred constructor

	public double getWingSpan() {
		
		return wingSpan;
		
	}// end getWingSpan

	public void setWingSpan(double wingSpan) throws Exception {
		
		InvalidWingspanException excMessage = new InvalidWingspanException("Invalid wingspan!");
		
		try {
			if (wingSpan >= 5.0 && wingSpan <= 11.0) {
				this.wingSpan = wingSpan;
			}
			else {
				throw excMessage;
			}
		}
		catch (InvalidWingspanException e) {
			System.out.println("Invalid wingspan!");
		}
	}// end setWingSpan

	@Override
	public String toString() {
		return "Goldfinch " + "\n" + "WingSpan: " + wingSpan + " cm" + "\n" + "simID: " + simID + "\n" + "Location: " + location + "\n" + "Full: " + full
				+ "\n" + "Rested: " + rested + "\n";
	}// end toString

	@Override
	public void fly(Location l) {
			
		try {
			location.update(l.getxCoord(), l.getyCoord());
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}// end fly

	@Override
	public void walk(int direction) {
		
		int w;
		w = getLocation().getxCoord();
		
		if (direction == 1) {
			w = (w + 1);
		}
		else if (direction == -1) {
			w = (w - 1);
		}
		try {
			location.update(w, location.getyCoord());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end walk

}// end class
