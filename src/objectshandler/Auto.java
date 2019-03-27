package objectshandler;

public class Auto extends Vehicle {
	
	/*public Auto(String brand, String transmission, int maxspeed) {
		this.brand = brand;
		this.transmission = transmission;
		this.maxspeed = maxspeed;
	}*/
	
	public int getspeed(int speed, int pedal) {
		if( speed==1) return (int)(maxspeed*(pedal*(0.01)));
		else return 0;
	}

}
