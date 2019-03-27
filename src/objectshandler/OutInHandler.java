package objectshandler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class OutInHandler {
	
	public static List<Vehicle> readVehicles() {
		
		List<Vehicle> result = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ListVehicle.bin"));
			result =  (List<Vehicle>)(ois.readObject()); 
		}
		catch( ClassNotFoundException | IOException e){
            e.printStackTrace();			
		}
		return result;
	}

	public static void writeVehicles(List<Vehicle> vehicleList) {
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ListVehicle.bin"));
			oos.writeObject(vehicleList);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
	}
}
