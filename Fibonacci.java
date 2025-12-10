<<<<<<< HEAD
public class Fibonacci {
public static void main(String[] args) {
int n = 10, num1 = 0, num2 = 1;
System.out.print("Fibonacci Series: " + num1 + ", " + num2);
for (int i = 2; i < n; i++) {
int num3 = num1 + num2;
System.out.print(", " + num3);
num1 = num2;
num2 = num3;
}
}
}
=======
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

    // int i=3;
    // while(i<=range){
    //   int newnumber=first+second;
    //   first=second;
    //   second=newnumber;
    //   System.out.println(i+"number is:"+newnumber);
    //   i++;
         for(int i=3;i<=range;i++){
          int newnumber =first +second;;
          first=second;
          second=newnumber;
        
          
          System.out.println(i + "number is:" +newnumber);
         }
    }
     }
>>>>>>> 81c5ae80821226fd1559fee5b4d5de188c6186cc
