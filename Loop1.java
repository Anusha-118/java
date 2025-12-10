import java.util.Scanner;
class Loop1{
    public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number :");
  int number=sc.nextInt();
  for(int i=0;i<number;i++)
  {
    for(int j=0;j<number;j++)
    {
        System.out.println("*");
    }
      System.out.println();
  }
  
}}

// import java.util.Scanner;

// class Loop0 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int number = sc.nextInt();

//         for (int i = 0; i < number; i++) {
//             for (int j = 0; j < number; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
