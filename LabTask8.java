import java.io.*;

class LabTask8
{
	public static void main(String args[])throws Exception
	{
	DataInputStream ob=new DataInputStream(System.in);

	System.out.print("===========================");
	System.out.print("=== MINI CALCULATOR ====");
	System.out.print("===========================");
	
	System.out.print("\n 1. Addition :");
	System.out.print("\n 2. Subtraction :");
	System.out.print("\n 3. Multiplication :");
	System.out.print("\n 4. Division :");
	System.out.print("\n 5. Remainder :");
	System.out.print("\n 6. Exit :");
	System.out.print("\n 7. About us :");
	
	System.out.print("Enter Selection from Above Menu:");
	int sel=Integer.parseInt(ob.readLine());
	
	if(sel==1) {
		System.out.print("Addition");

		System.out.print("Enter 1st Value :");
		int a=Integer.parseInt(ob.readLine());	
	
		System.out.print("Enter 2nd value :");
		int b=Integer.parseInt(ob.readLine());
	
		int z=a+b;
		System.out.print("Add is:"+z);
		System.out.print("\n%%%%%%% == Thanks For Using == %%%%%%%");
	}
	
	if (sel==2.){
	System.out.print("Enter 1st value: ");
	int d=Integer.parseInt(ob.readLine());
	System.out.print("Enter 2nd Value: ");
	int e=Integer.parseInt(ob.readLine());
	
	int y=d-e;
	System.out.print("Subtraction is:"+y);
	System.out.print("\n%%%%%%% == Thanks For Using == %%%%%%%");
	}
	
	if (sel==3.){
	System.out.print("Enter 1st value: ");
	int f=Integer.parseInt(ob.readLine());
	System.out.print("Enter 2nd Value: ");
	int g=Integer.parseInt(ob.readLine());
	
	int x=f*g;
	System.out.print("Multiplication is:"+x);
	System.out.print("\n%%%%%%% == Thanks For Using == %%%%%%%");
	}

	if (sel==4.){
	System.out.print("Enter 1st value: ");
	int h=Integer.parseInt(ob.readLine());
	System.out.print("Enter 2nd Value: ");
	int i=Integer.parseInt(ob.readLine());
	
	int w=h/i;
	System.out.print("Division is:"+w);
	System.out.print("\n%%%%%%% == Thanks For Using == %%%%%%%");
	}

	
	if (sel==5.){
	System.out.print("Enter 1st value: ");
	int j=Integer.parseInt(ob.readLine());
	System.out.print("Enter 2nd Value: ");
	int k=Integer.parseInt(ob.readLine());
	
	int r=j%k;
	System.out.print("Remainder is:"+r);
	System.out.print("\n%%%%%%% == Thanks For Using == %%%%%%%");
	}
	
	if(sel==6.){
	System.exit(0);
	System.out.print("\n%%%%%%% == Thanks For Using == %%%%%%%");
	}
	
	if(sel==7.){
	System.out.print("\n%%%% ============== My name is Israr =============== %%%%");
	
	System.out.print("\n%%%% =========== I am From Sehwan Sharif =========== %%%%");
	
	System.out.print("\n %%%% ========== Student of Computer Science ========%%%%");}
	

	
	}
}
	

	
	