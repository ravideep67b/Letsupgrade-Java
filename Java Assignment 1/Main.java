public class Main
{
  public static void main (String[]args)
  {

    Employee e = new Employee ();
      e.name = "Kartik";
      e.age = 20;
      e.city = "Delhi";

    Employee e1 = new Employee ();
      e1.name = "Deepak";
      e1.age = 18;
      e1.city = "Jaipur";

      e.display ();
      e1.display ();
  }
}
