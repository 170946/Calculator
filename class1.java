
/**
 * Write a description of class class1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class class1
{
    public static void main(String[] args)
    {
      Scanner reader = new Scanner(System.in);  // Reading from System.in
      System.out.println("Enter a number: ");
      double n = reader.nextDouble(); 
      
      System.out.println("Enter another number: ");
      double m = reader.nextDouble();
      
      System.out.println("Enter an operator: ");
      String operator = reader.next();
      
      if (operator.equals("+"))
      {
          System.out.println(n+m);
      }
      
      if (operator.equals("-"))
      {
          System.out.println(n-m);
      }
      
      if (operator.equals("*"))
      {
          System.out.println(n*m);
      }
      
     if (operator.equals("/"))
      {
          System.out.println(n/m);
      }
    
      
    }
}
