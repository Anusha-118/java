import java.util.Scanner;
class Switch {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your day:");
    int day= sc.nextInt();
    switch(day){
      case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("tuesday");
        break;
        case 3:
    System.out.println("wednesday");
    break;
    default :
    System.out.println("cant accept more than 3");
    
    
  }
}
}