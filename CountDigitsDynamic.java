import java.util.Scanner;
public class CountDigitsDynamic {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the num:");
int num=sc.nextInt();
int count = String.valueOf(num).length();
System.out.println(count);
}
}