class Kittu{
public void add(int n1,int n2,int n3)
{
int n=n1+n2+n3;
System.out.println("the sum is:"+n);
}
public void add(int n1,int n2)
{
int n=n1+n2;
System.out.println("the sum is:"+n);
}

public class Pack
{
public static void main(String[] args)
{
Kittu cal=new Kittu();
cal.add(10,4,5);
cal.add(2,6);
}
}
}

