class Count{
  public static void main(String args[])
  {
    int digit=34567;
    int count=0;
    while(digit>0){
      digit=digit/10;
      count++;
      System.out.println(count);

    }
  }
}