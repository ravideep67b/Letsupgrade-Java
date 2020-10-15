/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	 Avenger[] avengers = new Avenger[5];
	 
	 for(int i = 0;i<5;i++){
	     avengers[i]=new Avenger();
         avengers[i].getDetails();
	 }
	 for(int i=0;i<5;i++)
        {
            avengers[i].displayDetails();
        }
	}
}
