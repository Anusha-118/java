class Repeat{
  public static void main(String args[]){
    int digit=2425;
    // int occurancevalue=2;
    int count=0;
    while(digit>0)
{
  if(digit%10==2)
  
  {
    count++;

  }
  digit=digit/10;
  
}
  System.out.println(count);
}
  }
