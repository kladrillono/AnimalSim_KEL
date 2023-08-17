package classes;
import exceptions.InvalidSimIDException;
import java.util.Random;

public abstract class Animal<T> {

	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	public Animal() throws Exception {
		
		this.simID = 0;
		this.location = new Location(0,0);
		this.full = false;
		this.rested = true;
	
	}// end empty-argument constructor
	
	public Animal(int simID, Location l) throws Exception {
			
		this.simID = simID;
		this.location = l;
		this.full = false;
		this.rested = true;
		
	}// end preferred constructor
	
	public boolean eat() {
		
		Random r1 = new Random();
		double doubleNum = r1.nextDouble(1);
		if (doubleNum <= 0.5) {
			full = false;
		}
		else {
			full = true;
		}
		return full;
		
	}// generate a random number between 0 and 1. if < 0.5 full = false, otherwise true
	
	public boolean sleep() {
		
		Random r2 = new Random();
		double doubleNum2 = r2.nextDouble(1);
		if (doubleNum2 < 0.5) {
			rested = false;
		}
		else {
			rested = true;
		}
		return rested;
		
	}// end sleep()

	public int getSimID() {
		
		return simID;
		
	}// end getSimID

	public void setSimID(int simID) throws Exception {
		
		InvalidSimIDException excMessage = new InvalidSimIDException("Invalid SimID!");
		try {
			if (simID > 0) {
				this.simID = simID;
			}
			else {
					throw excMessage;
			}
		}
		catch (InvalidSimIDException e) {
			System.out.println("Invalid SimID!");
		}
	}// end setSimID

	public Location getLocation() {
		
		return location;
		
	}// end getLocation

	public void setLocation(Location location) {
		
		this.location = location;
		
	}// end setLocation

	public boolean isFull() {
		
		return full;
		
	}// end isFull

	public void setFull(boolean full) {
		
		this.full = full;
		
	}// end setFull

	public boolean isRested() {
		
		return rested;
		
	}// end isRested

	public void setRested(boolean rested) {
		
		this.rested = rested;
		
	}// end setRested

	@Override
	public String toString() {
		return "Animal [simID: " + simID + "\n" + "Location: " + location + "\n" + "Full: " + full + "\n" + "Rested: " + rested;
	}// end toString
	

	
}// end class
