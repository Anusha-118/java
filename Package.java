class Package{
  public static void main(String args[]){
    float a=2.6f;
    int b=5;
     int s=(int)Math.pow(a,b); //type casting 
    double s1=Math.floor(a); // coverts the number into 0 after the point
    double s2=Math.ceil(a); // add's +1 to the number before the point and converts the number after the point into 0.
    double s3=Math.round(a); // gives the approx or near value as output.
    System.out.println(s);
      System.out.println(s1);
       System.out.println(s2);
        System.out.println(s3);
  }
}