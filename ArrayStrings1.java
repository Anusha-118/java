import java.util.Scanner;
class ArrayStrings1{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number of strings you want to enter in array:");
        int number=sc.nextInt();
        sc.nextLine();
        String [] names=new String[number];
        for(int i=0;i<names.length;i++){
            System.out.println("enter the String:");
            names[i]=sc.nextLine();
        }
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
       
    }
}
