class Operator{
public static void main(String[] args) {
  Operator o=new Operator();
   double a=o.add(1.0,2);
     System.out.println(a);
  
}

  
  public double add(double a, int b){
    return a+b;
  }
   public int add(int a, int b,int c){
 return a+b+c;
   }
    public double multiply(int a, double b){
      return a*b;
    }

}