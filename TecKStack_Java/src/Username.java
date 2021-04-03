import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name:");
        String userName = input.nextLine();
        userName+=input.nextLine();
        input.close();
        
        System.out.println("Welcome "+userName);
	}

}
