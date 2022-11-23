package evenoroddjl;        //@author Justin Little
import java.util.Scanner;

public class EvenorOddJL {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numcount;
        int num, num1 = 0, num2 = 0, num3 = 0;
        
        System.out.println("Even or Odd");
        for(numcount = 1; numcount <= 3; numcount++)
        {
            System.out.print("Enter a integer: ");
            num = input.nextInt();
                  if(numcount == 1)
             {
                   num1 = num;
             }
             else if(numcount == 2)
             {
                   num2 = num;
             }
             else
             {
                   num3 = num;
        }   
    }
        if (isEven(num1) == true)
        System.out.println("Number " + num1 + " is Even.");
        else
        {
        System.out.println("Number " + num1 + " is Odd.");
        }
         if (isEven(num2) == true)
        System.out.println("Number " + num2 + " is Even.");
        else
        {
        System.out.println("Number " + num2 + " is Odd.");
        }
          if (isEven(num3) == true)
        System.out.println("Number " + num3 + " is Even.");
        else
        {
        System.out.println("Number " + num3 + " is Odd.");
        }
      
    }
    public static boolean isEven(int number)
   {
       int remainder = number % 2;
       boolean even;
       
       if (remainder == 0)
       {
       even = true;
       }
       else 
       {
        even = false;
       }
       return even;
       }   
}
