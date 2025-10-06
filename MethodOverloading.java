class Abhi 
  {
void demo(int a)
{
System.out.println("a:"+a);
}
void demo(int a,int b)
{
System.out.println("a and b:"+a+","+b);
}

class MethodOverloading
{
public static void main(String args[])
{
Abhi obj=new Abhi();
double result;
obj.demo(10);
obj.demo(10,20);
}
}
  }
