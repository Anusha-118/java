import java.util.Scanner;
public class DecimalToBinaryDynamic  {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int number=sc.nextInt();
String binary = Integer.toBinaryString(number);
System.out.println(binary);
}
}