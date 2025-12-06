class Intermediate
{
void Anusha()
{
System.out.println("Anusha");
}
}
class Chemistry extends Intermediate
{
void Vali()
{
System.out.println("Vali");
}
}
class Physics extends Chemistry
{ 
void Mukesh()
{
System.out.println("Mukesh");
}
}
  class Maths extends Physics
{
void Pujitha()
{
System.out.println("Pujitha");
}
}
class Demo
{
public  static void main(String args[])
{
Maths i=new Maths();
i.Anusha();
i.Vali();
i.Mukesh();


i.Pujitha();
}
}
