import java.util.Scanner;
class User
{
	String name;
	String phone;
	
	void getDetails(Scanner sc)
	{
		System.out.println("====================================================================================================");
		System.out.println("                                    WELCOME TO FOOD DELIVERY APP");
	    System.out.println("====================================================================================================");
		
		System.out.println("Enter your Name");
		name=sc.nextLine();
		
		System.out.println("Enter your Phone");
		phone=sc.nextLine();
		
	}
}
