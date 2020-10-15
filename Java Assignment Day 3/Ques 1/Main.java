import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    int math;
    int eng;
    int hindi;
    int science;
    int sanskrit;
    int totalMarks;
    double percentage;

    Scanner myObj = new Scanner (System.in);

      System.out.println ("Enter Your Maths Marks out of 100 ");
      math = myObj.nextInt ();
      System.out.println ("Enter Your English Marks out of 100 ");
      eng = myObj.nextInt ();
      System.out.println ("Enter Your Hindi Marks out of 100 ");
      hindi = myObj.nextInt ();
      System.out.println ("Enter Your Science Marks out of 100 ");
      science = myObj.nextInt ();
      System.out.println ("Enter Your Sanskrit Marks out of 100 ");
      sanskrit = myObj.nextInt ();
      totalMarks = math + eng + hindi + science + sanskrit;
      System.out.println ("Your Total Marks is: " + totalMarks);
      percentage = totalMarks / 5;
      System.out.println ("Your Percentage is: " + percentage);

    if (percentage >= 90.00)
      {
	System.out.println ("You have got A grade");
      }
    else if (percentage >= 70.00)
      {
	System.out.println ("You have got B grade");
      }
    else if (percentage >= 50.00)
      {
	System.out.println ("You have got C grade");
      }
    else if (percentage >= 40.00)
      {
	System.out.println ("You have got D grade");
      }
    else
      {
	System.out.println ("You Failed");
      }
  }
}
