package classes;
import exceptions.InvalidSubspeciesException;
import interfaces.Walkable;
import interfaces.Swimmable;

public class BrownBear extends Animal implements Walkable, Swimmable {
	
	private String subSpecies;
	
	public BrownBear() throws Exception {
		
		super();
		this.simID = 0;
		this.location = new Location(0,0); 
		this.full = false;
		this.rested = true;
		this.subSpecies = "Alaskan";
		
	}// end empty-argument constructor

	public BrownBear(int simID, Location l, String subSpecies) throws Exception {
		
		super();
		this.simID = simID;
		this.location = l;
		this.setSubSpecies(subSpecies);
		this.full = false;
		this.rested = true;
		
	}// end preferred constructor

	public String getSubSpecies() {
		
		return subSpecies;
		
	}// end getSubSpecies

	public void setSubSpecies(String subSpecies) throws Exception {
		
		InvalidSubspeciesException excMessage = new InvalidSubspeciesException("Invalid subspecies!");
		
		try {
			if (subSpecies == "Alaskan") {
				this.subSpecies = subSpecies;
			}
			else if (subSpecies == "Asiatic") {
				this.subSpecies = subSpecies;
			}
			else if (subSpecies == "European") {
				this.subSpecies = subSpecies;
			}
			else if (subSpecies == "Grizzly") {
				this.subSpecies = subSpecies;
			}
			else if (subSpecies == "Kodiak") {
				this.subSpecies = subSpecies;
			}
			else if (subSpecies == "Siberian") {
				this.subSpecies = subSpecies;
			}
			else {
				throw excMessage;
			}
		}
		catch (InvalidSubspeciesException e) {
			System.out.println("Invalid subspecies!");
		}
			
	}// end setSubSpecies
	
	@Override
	public String toString() {
		return "BrownBear " + "\n" + "subSpecies: " + subSpecies + "\n" + "simID: " + simID + "\n" + "Location: " + location + "\n" + "Full: " + full
				+ "\n" + "Rested: " + rested + "\n";
	}

	@Override
	public void walk(int direction) {
		
		int w;
		w = getLocation().getxCoord();
		
		if (direction == 3) {
			w = (w + 3);
		}
		else if (direction == -3) {
			w = (w - 3);
		}
		try {
			location.update(w, location.getyCoord());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end walk
	
	@Override
	public void swim(int direction) {
		
		int s;
		s = getLocation().getyCoord();
		
		if (direction == 2) {
			s = (s + 2);
		}
		else if (direction == -2) {
			s = (s - 2);
		}
		try {
			location.update(location.getxCoord(), s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end swim
		
}// end class
