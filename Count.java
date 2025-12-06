
import java.util.Scanner;
class Count{
  public static void main(String args[])
  {
  //   int digit=245;
  //   int count=0;
  //   while(digit>0)
  //     digit=digit/10;
  //     count++;
  //     System.out.println(count);
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number:"); 
     int number=sc.nextInt();
    int count=0;
     while(number>0){
    number=number/10;
    count++;
    System.out.println(count);
    
     } 

       
       }

    }
  
