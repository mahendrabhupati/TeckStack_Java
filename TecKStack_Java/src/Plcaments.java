import java.util.Scanner;

public class Plcaments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Highest_placement = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the no of students placed in CSE");
		int CSE = input.nextInt();

		System.out.println("Enter the no of students placed in ECE");
		int ECE = input.nextInt();

		System.out.println("Enter the no of students placed in MECH");
		int MECH = input.nextInt();
		//CASE1
		if(CSE>0&&ECE>0&&MECH>0) 
		{		
			Highest_placement = (CSE>ECE)?(CSE>MECH?CSE:MECH):(CSE>MECH?CSE:MECH);
			System.out.println("Highest placement");
		}
		//CASE2
		else if(CSE==ECE||ECE==MECH||MECH==CSE)
		{
			if(Highest_placement==CSE) {
				System.out.println("CSE");
			}
			else if(Highest_placement==ECE) {
				System.out.println("ECE");
			}
			else if(Highest_placement==MECH) {
				System.out.println("MECH");
			}
		}
		//CASE3
		else if(Highest_placement==0) {
			System.out.println("None of the department has got the highest placement");
		}
		
		//CASE4
		else if (CSE<0||ECE<0||MECH<0) {
			System.out.println("Input is Invalid");
		}
	}

}
