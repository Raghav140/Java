import java.util.Scanner;
class Greatest{
    Scanner sc=new Scanner(System.in);
    int a;
    int b;
    int c;
    void test(){
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        System.out.println("enter the value of c");
        c=sc.nextInt();
        
        if (a>b)
        {
            if(a>c)
        {
            System.out.println("a is the greatest");
        }
        else 
        {
            System.out.println("c is greatest");
        }
    }
    else
    {
        if(c>b)
        {
            System.out.println("c is greatest");
        }
        else 
        {
            System.out.println("b is greatest");
        }
    }
}
    public static void main(String args[]){
        Greatest G1=new Greatest();
        G1.test();
    }
        
}


