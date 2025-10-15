class Demo5
{
    public void add(int n1, int n2)
    {
        int n = n1 + n2;
        System.out.println("Addition is: " + n);
    }

    public void add(int n1, int n2, int n3)
    {
        int n = n1 + n2 + n3;
        System.out.println("Addition is: " + n);
    }

    public void add(double n1, double n2)
    {
        double n = n1 + n2;
        System.out.println("Addition is: " + n);
    }
}

class Mukku
{
    public static void main(String args[])
    {
        Demo5 d = new Demo5();
        d.add(10, 20);
        d.add(2, 3, 4);
        d.add(10.5, 20.5);
    }
}
