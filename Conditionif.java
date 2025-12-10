import java.util.Scanner;
class Conditionif{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter marks:");
    int marks= sc.nextInt();
    if(marks>=35)
    {
        System.out.println("Pass");
    }
    else{
          System.out.println("Fail");
    }
  }
}