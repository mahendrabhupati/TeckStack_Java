 import java.util.*;
 import java.io.*;
     public class Customer
     {
         public static void main(String[] args)
         {
             Scanner input =new Scanner(System.in);
             System.out.println("Enter your name:");
             String name =input.nextLine();
             
             System.out.println("Enter age:");
             int age = Integer.parseInt(input.nextLine());
             
             System.out.println("Enter gender:");
             String gender =input.nextLine();
             
             System.out.println("Hailing from:");
             String location = input.nextLine();
             location+=input.nextLine();
             input.close();
             
             System.out.println("Welcome, "+name );
             System.out.println("Age:"+ age);
             System.out.println("Gender:"+ gender);
             System.out.println("City:"+ location);
         }
     }