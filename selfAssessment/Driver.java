import java.util.Scanner;

public class Driver
{
   public static void main(String []args)
   {
      int numerator;
      int denominator;
      int result;

      Scanner in = new Scanner(System.in);
      System.out.println("Enter a numerator value: ");
      String numeratorStr = in.nextLine();

      System.out.println("Enter a denomenator value: ");
      String denomenatorStr = in.nextLine();

      numerator = Integer.parseInt(numeratorStr);
      denominator = Integer.parseInt(denomenatorStr);

      result = numerator/denominator;

      System.out.println(numeratorStr + "/" + denomenatorStr + " = " + result);
   }
}
