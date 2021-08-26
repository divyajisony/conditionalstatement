package conditionalstatement;
import java.util.Scanner;
public class laballocation4 {

	public static void main(String[] args) {
		int l1,l2,l3,n;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the x:");
		l1=s.nextInt();
		System.out.println("Enter the y:");

		l2=s.nextInt();
		System.out.println("Enter the z:");
		l3=s.nextInt();
		System.out.println("Enter the n");
		n=s.nextInt();

		if(n<l1&&n<l2&&n<l3)

		{

		if(l1<l2&&l1<l3)


		System.out.println("L1 should be allocated to this class ");

		else if(l2<l3)

		System.out.println("L2 should be allocated to this class ");

		else

		System.out.println("L3 should be allocated to this class ");
		}

		else if(n<l1&&n<l2)

		{

		if(l1<l2)

		System.out.println("L1 should be allocated to this class ");

		else

		System.out.println("L2 should be allocated to this class ");

		}

		else if(n<l1&&n<l3)

		{

		if(l2<l3)

		System.out.println("L1 should be allocated to this class");

		else

		System.out.println("L3 should be allocated to this class ");

		}

		else if(n<l1)
		System.out.println("L1 should be allocated to this class ");

		
	    else if(n<l2)

		System.out.println("L2 should be allocated to this class ");

		else if(n<l3)

		System.out.println("L3 should be allocated to this class ");


		else 

		System.out.println("L1 should be allocated to this class ");

		}

		}