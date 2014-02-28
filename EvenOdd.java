import java.util.Scanner;


public class EvenOdd{

public static void main (String[]args){

int x;
Scanner sc = new Scanner(System.in);
System.out.print("Enter integer:");
x = sc.nextInt();

if (x%2 == 0)
{
System.out.print( x + " is an Even number.");
}
else
{
System.out.print(x + " is an Odd number ");
}




}

}