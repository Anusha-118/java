import java.util.Scanner;
class Logical
{
  public static void main(String args [])
  {
    Scanner sc=new Scanner(System.in);

      System.out.println(" enter a value:");
      int a=sc.nextInt();
      System.out.println(" enter b value:");
      int b=sc.nextInt();
      if(a>2 && b>2)
      {
        System.out.println("both are greater");

      }
      else{
        System.out.println("they are not greater");

      }
  }
}