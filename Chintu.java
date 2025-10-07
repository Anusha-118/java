class Grandpa
{
  void boy()
  {
    System.out.println("thikka");
    System.out.println("sahayam");
  }
}
  class Father
  {
    void boy()
    {
  
    
    System.out.println("aavesam");
    System.out.println("jaali");
    }
  }
  class Chintu 
  {
    public static void main(String args[])
    {
      System.out.println("all in one");
      Father f=new Father();
      Grandpa g=new Grandpa();
      f.boy();
      g.boy();
    }  
}