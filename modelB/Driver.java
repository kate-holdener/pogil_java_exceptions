import java.util.Scanner;

public class Driver
{
   public static int convertUserInput(String value)
   {
       int resultValue = 0;
       resultValue = Integer.parseInt(value);
       return resultValue;
   }


   public static void main(String []args)
   {
       int inputValue = 0;
       double result = 0;

       // the Scnner object is connected to System.in - the terminal
       Scanner in = new Scanner(System.in);

       System.out.println("Enter an integer value:");
       // read the input from terminal
       String stringValue = in.nextLine();

       try
       {
          inputValue = convertUserInput(stringValue);
          result = java.lang.Math.pow(2.0, inputValue);
          System.out.println("2^"+inputValue+"="+result);
       }
       catch (NumberFormatException error)
       {
          System.out.println("You entered a non-integer value: " + stringValue);
          System.out.println("This program only works on integer inputs");
       }
   }
}

