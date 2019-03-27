package objectshandler;

public class Manual extends Vehicle {
	
	public int getspeed(int speed, int pedal) {
		 return (int)(maxspeed*(0.01)*pedal*speed);
	}

}
