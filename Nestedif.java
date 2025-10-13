import java.util.Scanner;
class Nestedif{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter age:");
    int age= sc.nextInt();
    System.out.println("enter gender:");
    String gender=sc.next();
    if(age>=18){
      if(gender.equals("male")) //in java to compare two strings we use .equals method
      {
         System.out.println("male boxing");
      }
      else{
         System.out.println("female boxing");
      }
    }
    else{
      if(age<18){
        if(gender.equals("female")){
           System.out.println("girl boxing");
        }
        else{
           System.out.println("boy boxing");
        }

      }
    }

  }
}