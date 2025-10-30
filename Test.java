class Test{
  public static void main(String args[]){
   int sum=age(10);
   System.out.println(sum);
   String s=agechecker(26); 
   System.out.println(s);
   Double d=demo(10,20);
   System.out.println(d);
    }
  public static int age(int a){
    return a*2;
  }
  public static String agechecker(int age){
    if(age>=18){
      return "yes";
    }
    return "no";
  } 
  public static double demo(double a,double b){
    return a+b;
  }
}