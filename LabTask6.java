import java.util.*;
class LabTask6
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		System.out.print("Enter menu no:");
		int a=sc.nextInt();
		

	switch(a)
	{
	
	case 1:
		System.out.println("Chicken price is 500Rs");
		break;
	
	case 2:
		System.out.println("Meal price is 20Rs");
		break;
	
	case 3:
		System.out.println("Ice cream price is 50Rs");
		break;

	case 4:
		System.out.println("Sabzii price is 100Rs");
		break;
	
	case 5:
		System.out.println("Keemaa Price is 200Rs");
		break;
	
	default:
		System.out.println("Sorry Its invalid No");
		}
	}
}