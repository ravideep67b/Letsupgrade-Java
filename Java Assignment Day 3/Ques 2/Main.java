import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    String name;
    byte birthDate;
    byte birthMonth;
    int birthYear;
    int MonthlySalary;
    int annualSalary;
    int taxAmount = 0;

    Scanner myObj = new Scanner (System.in);
      System.out.println ("Enter Your Name");
      name = myObj.nextLine ();
      System.out.println ("Enter Your Birth Date");
      birthDate = myObj.nextByte ();
      System.out.println ("Enter Your Birth Month");
      birthMonth = myObj.nextByte ();
      System.out.println ("Enter Your Birth Year");
      birthYear = myObj.nextInt ();
      System.out.println ("Enter Your Monthly Salary");
      MonthlySalary = myObj.nextInt ();
      annualSalary = MonthlySalary * 12;
    int age = 2020 - birthYear;
    if (birthMonth >= 10 && birthDate >= 12)
      {
	age = age - 1;
      }
    else if (birthMonth > 10 && birthDate < 12)
      {
	age = age - 1;
      }
    else
      {
	age = age;
      }


    if (annualSalary >= 500000)
      {
	taxAmount = (annualSalary * 20) / 100;
      }
    else if (annualSalary >= 400000)
      {
	taxAmount = (annualSalary * 15) / 100;
      }
    else if (annualSalary >= 300000)
      {
	taxAmount = (annualSalary * 10) / 100;
      }
    else if (annualSalary >= 200000)
      {
	taxAmount = (annualSalary * 5) / 100;
      }
    else
      {
	taxAmount = taxAmount;
      }
    System.out.println ("Your Name: " + name);
    System.out.println ("Your Age: " + age);
    System.out.println ("Your Annual Salary: " + annualSalary + "Rs");
    System.out.println ("Your Tax: " + taxAmount + "Rs");


  }
}
