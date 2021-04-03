import java.util.Scanner;

class Pizza{
	public static int pizzaCalc(int x) {
		return 100*x;
	}
}
public class Bill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the no of pizzas bought");
		int no_pizza = input.nextInt();
		
		System.out.println("Enter the no of puffs bought");
		int no_puffs = input.nextInt();
		
		System.out.println("Enter the no of cool drinks bought");
		int no_drinks = input.nextInt();
		
		System.out.println("Bill Details");
		System.out.println("No of pizzas");
		System.out.println(no_pizza*100);//pizza
		
		System.out.println("No of pizzas");
		System.out.println(no_puffs*20);// puffs
		
		System.out.println("No of pizzas");
		System.out.println(no_drinks*10);// drinks
	
	}

}
