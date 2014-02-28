import java.util.Scanner;
public class EvOd{

public static void main (String[]args)
{

int x;

System.out.print("Enter integer: ");

Scanner sc = new Scanner(System.in);
x = sc.nextInt();

if (x%2==0){
System.out.print(x + " is an even number.");
}
else{
System.out.print(x + " is an odd number.");
}


}


}