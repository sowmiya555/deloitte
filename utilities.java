package classroom;

public class utilities {
	public static boolean validateId(String roomId)
	{
		String pattern= "^[0-9]{4}$";
		if(roomId.matches(pattern))
			return true;
		else
			return false;
	}

}
