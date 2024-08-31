import java.util.Scanner;
class Evennumber{
    Scanner sc=new Scanner(System.in);

    int x;
    int y=2;
    void test(){
        System.out.println("enter the value of x");
        x=sc.nextInt();
        
        if (x%y <=0)
        {
            System.out.println("the number is even"); 
        }
        else {
            System.out.println("the number is odd");
        }
    }
    public static void main (String args[]){
        Evennumber E1=new Evennumber();
        E1.test();
    }

}
