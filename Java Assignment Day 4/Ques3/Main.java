import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[5];
	    for(int i = 0;i<5;i++)
	    {
          System.out.println("Enter " + (i+1) + " number");
	        numbers[i]= sc.nextInt();
	    }
      int totalSum = 0;
      for(int i = 0;i<5;i++)
      {
       totalSum += numbers[i];
      }
      System.out.println("Sum of given Numbers is " + totalSum);
  }
}