class arithematic{
    int a;
    int b;
     void calculations(int a,int b)
     {
System.out.println("sum of numbers---"+ (a+b));
System.out.println("difference of numbers---"+ (a-b));
System.out.println("product of numbers---"+ (a*b));
System.out.println("modules of numbers---"+(a%b));
System.out.println("division of numbers---"+(a/b));
     }
     
      public static void main(String args[])
      {
        arithematic a1=new arithematic();

        a1.calculations(10,20);

      }
}