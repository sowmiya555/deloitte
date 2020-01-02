package classroom;

import java.util.Scanner;
import java.util.ArrayList;

public class Juno
{
	public static void main(String args[]) {
	Scanner scr = new Scanner(System.in);
	ArrayList <Classroom> list =new ArrayList <Classroom> ();
	while (true) 
	{
		System.out.println("Please enter option 1 to add new room" + " option 2 to search the rooms"
		+ " option 3 to display all the rooms" + " option 4 to allocate the room"
		+"option 5 to Login"+ " option 6 to exit the application");
		String option = scr.next();
		ClassroomImpl mainClassRoomObj = new ClassroomImpl();
		switch (option) 
		{
			case "1":
				String ClsId = "";
				while(true)
				{
				System.out.println("please enter Classroom Id");
				ClsId = scr.next();
				if(utilities.validateId(ClsId))
					break;
				else
					continue;
				}
				
				System.out.println("please enter the classroom name");
				String name = scr.next();
				
				System.out.println("please enter Number of systems");
				String noofsys = scr.next();
				System.out.println("Availability of projector");
				String proj = scr.next();
				System.out.println("Availability of AC");
				String ac = scr.next();
				System.out.println("The name of the faculty");
				String faculty = scr.next();
				
				list.add(mainClassRoomObj.addRooms(proj, ac, ClsId, noofsys, faculty, name));
	
		
				break;
				
			case "2":
		
				System.out.println("please enter the room id:");
				String ClId = scr.next();
				mainClassRoomObj.searchRooms(Integer.parseInt(ClId), list);
				break;
			case "3":
				System.out.println(list);
				
				break;
			case "4":
				System.out.println("Specify the total number of systems needed");
				String nosys = scr.next();
				System.out.println("number of rooms");
				String noOfRoomsNeeded = scr.next();
				Classroom  availOfRooms = mainClassRoomObj.availOfRooms(Integer.parseInt(nosys),list);
				int counter=0;
				
				for (Classroom availableroom : list) 
				{
				
				for (Classroom room : list)
				{
				if (availableroom.getClsId() == room.getClsId());
				{
				System.out.println("Please enter faculty name");
				String fac = scr.next();
				room.setFaculty(fac);
				room.setAvailability(false);
				}
				
				}
				counter++;
				if(counter>= Integer.parseInt(noOfRoomsNeeded))
				{
				break;
				}
				}
				if(counter== Integer.parseInt(noOfRoomsNeeded))
				System.out.println("Don't have enough rooms");
				
				
			case "5":
				System.out.println("Enter Username:");
				String uname = scr.next();
				System.out.println("Enter Password:");
				String password = scr.next();
				boolean validateUser = mainClassRoomObj.validate(uname, password);
				if (validateUser)
					System.out.println("Login successful");
				else
					System.out.println("username or password is incorrect");
			case "6":
		
				
				System.exit(0);
       }
	}
}
}

