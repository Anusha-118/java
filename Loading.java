class Overload 
  {
void demo(int a)
{
System.out.println("a:"+a);
}
void demo(int a,int b)
{
System.out.println("a and b:"+a+","+b);
}
}
class Loading
{
public static void main(String args[])
{
Overload obj=new Overload();
double result;
obj.demo(10);
obj.demo(10,20);

}
}
