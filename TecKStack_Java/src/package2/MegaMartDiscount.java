package package2;

import java.util.Scanner;

public class MegaMartDiscount {

	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Customer Id");
			int id =sc.nextInt();

			if(id>0) {
			  System.out.println("Enter the Bill amount");
			  double billAMT = sc.nextDouble(); 
				if(billAMT>0) {
					if(billAMT>=1000) {
						if(id>=1&&id<=100) {
							System.out.println("Total Price is "+String.format("%.2f",billAMT-billAMT*15/100));
						}
						else if(id>=101&&id<=250) {
							System.out.println("Total Price is "+String.format("%.2f",billAMT-billAMT*18/100));
						}
						else if(id>=251&&id<=500) {
							System.out.println("Total Price is "+String.format("%.2f",billAMT-billAMT*23/100));
						}
						else if(id>501&&id<=1000) {
							System.out.println("Total Price is "+String.format("%.2f",billAMT-billAMT*28/100));
						}
						else if(id>=1001) {
							System.out.println("Total Price is "+String.format("%.2f",billAMT-billAMT*32/100));
						}
					}
					else {
						System.out.print("Total Price is "+String.format("%.2f",billAMT));
					}
					
				}
				else {
					System.out.println((int)billAMT +" is not a valid Bill Amount");
				}
				
			}
			else {
				System.out.println(id + " is not a valid Customer Id");
			}
	}
	}
}
