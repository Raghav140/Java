import java.util.Scanner;
class Addition{
    Scanner sc=new Scanner(System.in);
    int a;
    int b;
     int c;
     int d;
      Addition(){
        System.out.println("enter the value for a");
        a=sc.nextInt();
        System.out.println("enter the val;ue of b");
        b=sc.nextInt();
        System.out.println("enter the value for c ");
        c=sc.nextInt();
        
        d=a+b+c;
        System.out.println("total="+d);
    }
    public static void main(String args[]){
        Addition a1=new Addition();
    }
}