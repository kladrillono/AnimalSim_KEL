package classes;
import exceptions.InvalidCoordinateException;

public class Location {

	private int xCoord;
	private int yCoord;
	
	public Location() {
		
		this.xCoord = 0;
		this.yCoord = 0;
		
	}// end empty-argument constructor
	
	public Location(int x, int y) throws Exception {
		
		this.xCoord = x;
		this.yCoord = y;
		
	}// end preferred constructor
	
	public void update(int x, int y) throws Exception {
		
		Location loc = new Location(x,y);
		
		InvalidCoordinateException excMessage = new InvalidCoordinateException("Invalid coordinates!");
		try {
			if (x >= 0) {
				this.xCoord = x;	
			}
			else {
				throw excMessage;
			}
			if (y >= 0) {
				this.yCoord = y;	
			}
			else {
				throw excMessage;
			}
		}
		catch (InvalidCoordinateException e) {
			System.out.println("Invalid coordinates!");
		}
		System.out.println(loc);
		
	}// accepts x and y, updates xCoord and yCoord
	
	public int[] getCoordinates() {
		
		int[] coordinates = new int[2];
		
		coordinates[0] = getxCoord();
		coordinates[1] = getyCoord();
		
		return coordinates;
	} // returns an array that contains the xCoord, yCoord

	public int getxCoord() {
		
		return xCoord;
		
	}// end getxCoord

	public void setxCoord(int xCoord) throws Exception {
		
		InvalidCoordinateException excMessage = new InvalidCoordinateException("Invalid X coordinate!");
		
		try {
			if (xCoord >= 0) {
				this.xCoord = xCoord;	
			}
			else {
				throw excMessage;
			}
		}
		catch (InvalidCoordinateException e) {
			System.out.println("Invalid X coordinate!");
		}
	}// end setxCoord

	public int getyCoord() {
		
		return yCoord;
		
	}// end getyCoord

	public void setyCoord(int yCoord) throws Exception{
		
		InvalidCoordinateException excMessage = new InvalidCoordinateException("Invalid Y coordinate!");
		
		try {
			if (yCoord >= 0) {
				this.yCoord = yCoord;	
			}
			else {
				throw excMessage;
			}
		}
		catch (InvalidCoordinateException e) {
			System.out.println("Invalid Y coordinate!");
		}
	}// end setyCoord

	@Override
	public String toString() {
		return "Location [X: " + xCoord + ", Y: " + yCoord + "]";
	}
	
}// end class
