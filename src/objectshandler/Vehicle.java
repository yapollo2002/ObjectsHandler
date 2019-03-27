package objectshandler;
// Vechicle abstract class for all cars
//brand - like Toyota, Reno, Mazda....
//transmission - number gearbox's steps
//maxspeed - maxim of speed what can accelerate car
public abstract class Vehicle {
	 String brand;
	 String transmission; // lets agree that transmission maybe 5 speed
	 int maxspeed;
	 public int speed = 0;
	
	public Vehicle() {
		brand = "Toyota";
		transmission = "manual";
		maxspeed = 100;
	}
	
	public Vehicle(String brand, String transmission, int maxspeed) {
		
	}
	public String getbrand() {
		return brand;
	}
    
	public String getTransmission() {
		return transmission;
	}
		
	public int getmaxspeed() {
		return maxspeed;
	}
	
	 // speeds number of gearbox speed, pedal - lacotion pressure of gas pedal 0-100 %
	abstract int  getspeed(int speed, int pedal);
	
}
