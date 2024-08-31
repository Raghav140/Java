import java.util.Scanner;
class logical {
    Scanner sc=new Scanner(System.in);
    int a;
    int b;
void display(){
System.out.println("enter the value for a");
a=sc.nextInt();
System.out.println("enter the value for b ");
b=sc.nextInt();
if (a>10 && b>10){
    System.out.println("both variables are greater than 10");
}
else if (a>10 || b>10){
    System.out.println("one of the variable is greater than 10");
}
else  {
    System.out.println("neither of the variables is greater than 10");
}
}
public static void main(String args[]){
    logical l1=new logical();
    l1.display();
}
    
}