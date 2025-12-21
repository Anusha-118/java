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
class Physics extends Intermediate
{
void Mukesh()
{
System.out.println("Mukesh");
}
}
class Maths extends Intermediate
{
void Pujitha()
{
System.out.println("Pujitha");
}
}
class Eamcet
{
public static void main(String args[])
{
Intermediate i=new Intermediate();
i.Anusha();
Chemistry c=new Chemistry();
c.Vali();
Physics p=new Physics();
p.Mukesh();
Maths m=new Maths();
m.Pujitha();
}
}
