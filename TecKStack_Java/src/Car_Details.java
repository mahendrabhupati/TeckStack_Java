import java.util.Scanner;

public class Car_Details {

	public static void main(String[] args) {
		// Write a program to get details about a car and display it.

		Scanner Input = new Scanner(System.in);
		System.out.println("Enter the car name:");
		String car_name = Input.nextLine();

		System.out.println("Enter the car no:");
		int car_num = Input.nextInt();

		System.out.println("Enter the price:");
		double car_price = Input.nextDouble();

		// printing entered details

		System.out.println("Car name:"+car_name);
		System.out.println("Car no:"+car_num);
		System.out.println("Price:"+String.format("%.2f", car_price)+"rs only");

	}

}
