package conditionalstatement;
import java.util.Scanner;
public class microven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		int a=sc.nextInt();
		System.out.println("Enter the single item heating time");
		float f=sc.nextFloat();

		switch(a)

		{

		case 1:

		System.out.printf("The recommended heating time is %.1f",f);

		break;

		case 2:

		double t=(1.5)*f;

		System.out.printf("The recommended heating time is %.1f",t);

		break;

		case 3:

		t=2*f;

		System.out.printf("The recommended heating time is %.1f",t);

		break;

		default:

		System.out.printf("Number of items is more");
		break;
		}
	}
}
		
}