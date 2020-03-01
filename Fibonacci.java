
package Fibonacci_number;
import java.util.Scanner;

public class Fibonacci {
   static int previous=0,next=1,temp;
   public static void Fibonacci(int input)
{

     if(input>0)
{
System.out.print(previous +" ");
       temp=previous+next;
       previous=next;
      next=temp;
     Fibonacci(input-1);
}
}
public static void main(String[] args) {
System.out.print("please provide no of terms:");
Scanner sc=new Scanner(System.in);
     int input=sc.nextInt();
     Fibonacci(input);
}
}