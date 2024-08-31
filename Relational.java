import java.util.Scanner;
class Relational {
    Scanner sc=new Scanner(System.in);
    int x;
    int y;
    void display(){
System.out.println("enter value of x");
x=sc.nextInt();
System.out.println("enter value of y");
y=sc.nextInt();

    if (x>y)
    {
        System.out.println("x is greater");

    }
    else {
        System.out.println("y is greater");

    }
}
    public static void main(String args[]){
        Relational r1=new Relational();
         r1.display();
    
    }

}
