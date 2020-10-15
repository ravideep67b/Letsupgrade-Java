class Main {
  public static void main(String[] args) {
    int[] numbers = new int[5];
	    for(int i = 0;i<5;i++)
	    {
	        numbers[i]= i+1 ;
	    }
      for(int i = 0;i<5;i++)
      {
        if(numbers[i]%2 != 0){
          System.out.println(numbers[i] + " is odd number");
        }
      }
  }
}