import java.util.Scanner;
class DynamicReverseString{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the String:");
      String str=sc.nextLine();
      StringBuilder obj=new StringBuilder(str);
      obj.reverse();
      System.out.println(obj);
    }
}