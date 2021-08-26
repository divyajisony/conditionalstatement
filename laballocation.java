package conditionalstatement;
import java.util.Scanner;

public class laballocation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L1,L2,L3,n;
		System.out.println("Entry of x:");
		L1=sc.nextInt();
		System.out.println("Enter of y:");
		L2=sc.nextInt();
		System.out.println("Enter of z:");
		L3=sc.nextInt();

		if(L1<L2&&L1<L3)
		{
		System.out.println("L1 has the minimal seating capacity;");
		}
		else if(L2<L3&&L2<L1){
		System.out.println("L2 has the minimal seating capacity");
		}
		else if(L3<L1&&L3<L2){
		System.out.println("L3 has the minimal seating capacity");
		}
		else{
		System.out.println("Default");
		}
	}

}
