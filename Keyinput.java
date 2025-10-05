import java.util.Scanner;
public class Keyinput
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    int input=sc.nextInt();
    System.out.println("the number is:"+input);
    System.out.println("enter any string:");
    String input1=sc.next();
    System.out.println("the string is is:"+input1);
    System.out.println("enter any floating value:");
    float input3=sc.nextFloat();
    System.out.println("the  is floating value:"+input3);
  }
}