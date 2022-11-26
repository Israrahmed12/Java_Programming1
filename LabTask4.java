import java.util.*;
class LabTask4
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter Name:");
	String name=sc.nextLine();
	System.out.println("\nMy name is:"+name);

	System.out.print("\nEnter Java Marks:");
	int a=sc.nextInt();
	System.out.println("\nMy java Marks is:"+a);

	

	System.out.print("\nEnter PHP Marks:");
	int b=sc.nextInt();
	System.out.println("\nMy PHP Marks is"+b);
	


	System.out.print("\nEnter CSS Marks:");
	int c=sc.nextInt();
	System.out.println("\nMy CSS marks is:"+c);

	
	int total=300;
	int obtain=a+b+c;
	
	System.out.println("\nTotal marks is:"+total);
	System.out.println("\nObtain Marks is:"+obtain);
	
	double per=obtain*100/total;
	System.out.println("\nPercentage is:"+per);
	
	if (a>=40)
	System.out.print("\nYou are pass");
	
	else
	System.out.print("\nYou are Fail");
	
	if (b>=40)
	System.out.print("\nYou are pass");
	
	else
	System.out.print("\n You are Fail");
	
	if (c>=40)
	System.out.print("\n You are pass");
	
	else 
	System.out.print("\n You are Fail");
	
	if (per>=80)
	System.out.print("\n Grad A");
	

	if (per>70)
	System.out.print("\n Grad  B");

	if (per>60)
	System.out.print("\n Grad C");

	if (per<50)
	System.out.print("\n Grad D");
	
	if (per<40)
	System.out.print("\n You are Fail");
	}
}
	
	
	