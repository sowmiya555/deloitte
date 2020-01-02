package classroom;

import java.util.ArrayList;

public interface Operations {
	
	public Classroom addRooms(String proj,String ac, String ClsId, String noofsys, String faculty, String name);
	public Classroom searchRooms(int roomId,  ArrayList<Classroom> list);
	public void allocRooms(int noOfSystems);
	public Classroom availOfRooms(int numOfSys, ArrayList<Classroom> list);
	public Classroom displayAllRooms();
	public boolean validate(String username, String password);
	

}
