package classroom;

import java.util.ArrayList;

public class ClassroomImpl implements Operations {
	

	@Override
	public Classroom addRooms(String proj,String ac, String ClsId, String noofsys, String faculty, String name) {
	{
	Classroom cls = new Classroom();
	cls.setName(name);
	cls.setClsId(Integer.parseInt(ClsId));
	cls.setNoofsys(Integer.parseInt(noofsys));
	cls.setProj(Boolean.parseBoolean(proj));
	cls.setAc(Boolean.parseBoolean(ac));
	cls.setFaculty(faculty);
	cls.setAvailability(true);
	return cls;
	}
	}

	@Override
	public Classroom searchRooms(int ClsId, ArrayList<Classroom> list) {
		for(Classroom room:list)
		{
			if(room.getClsId()==ClsId)
             return room;
		}
		return null;
	}
	

	@Override
	public void allocRooms(int noofsystems) {
	// TODO Auto-generated method stub

	}
	public Classroom availOfRooms(int noofsys, ArrayList<Classroom> list)
	{
	Classroom availableRooms=new Classroom();
	for(Classroom room:list) {
	if(room.getNoofsys()>= noofsys && room.isAvailability()==true)
	{
	availableRooms=room;
	}
	}
	return availableRooms;
	}

	@Override
	public Classroom displayAllRooms() {
	// TODO Auto-generated method stub
	return null;
	}

	@Override
	public boolean validate(String username, String password) {
		// TODO Auto-generated method stub
	if(username.equals("admin")&& password.contentEquals("admin"))
		return true;
	else 
		return false;
		
	}
	
	}

