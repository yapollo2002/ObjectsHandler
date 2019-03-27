package objectshandler;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ObjectsHandler {
	
	 public static void main(String[] args){
		 List<Vehicle> vehicleList = new LinkedList<Vehicle>();
		 vehicleList.add(new Auto());
			Collections.sort(vehicleList, new VehicleComparator());
		}
    
	static  class VehicleComparator implements Comparator<Vehicle> {
		 public int compare(Vehicle v1, Vehicle v2) {
			 if(v1.maxspeed<v2.maxspeed) return -1;
			 if(v1.maxspeed>v2.maxspeed) return 1;
			 return 1;
		 }
	 }
	
}
