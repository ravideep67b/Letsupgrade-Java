import java.util.Scanner;

public class Avenger{
    Scanner sc=new Scanner(System.in);
    String name;
    int age; 
    String power;
    String weapon;
    String planet;
    
     public void getDetails(){

            System.out.println("Enter the Avenger name");
            name=sc.nextLine();
            System.out.println("Enter the Avenger age");
            age=sc.nextInt();
            System.out.println("Enter the Avenger power");
            power=sc.next();
            System.out.println("Enter the Avenger weapon");
            weapon=sc.next();
            System.out.println("Enter the Avenger planet");
            planet=sc.next();



        }
         public void displayDetails(){

             System.out.println("Name: "+name);
             System.out.println("Age: "+age);
             System.out.println("Power: "+power);
             System.out.println("Weapon: "+weapon);
             System.out.println("Planet: "+planet);


         }
}