// import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the String:");
// String str=sc.nextLine();
String str="madam";
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(str.equals(reversed));
// boolean a=str.equals(reversed);
// System.out.println(a);
}
}