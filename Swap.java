class Swap{
  public static void main(String args[]){
    
    swap(10,11);
  
  }
  public static void swap(int a, int b){
    
    int temp;
    System.out.println("A before swapping:"+a);
    System.out.println("B before swapping:"+b);
    
    temp=a;
    a=b;
    b=temp;

    System.out.println("A after swapping:"+a);
     System.out.println("B after swapping:"+b);
  }

}