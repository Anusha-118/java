import java.util.Scanner;
class Fibonacci{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the range:");
   int range= sc.nextInt();
   
    int first = 0;
    int second =1;
    System.out.println("first number is:"+first);
    System.out.println("Second number is:"+second);

    int i=3;
    while(i<=range){
      int newnumber=first+second;
      first=second;
      second=newnumber;
      System.out.println(i+"number is:"+newnumber);
      i++;

    }
     }
}