import java.util.Scanner;
class Table{
    Scanner sc=new Scanner(System.in);
    int i=1;
    int f;
    int result;
    void multiplication(){
        System.out.println("enetr the value of f");
        f=sc.nextInt();

        while(i<=10){
             result = f*i;
            i++;
            System.out.println(+result);
        }
    }
public static void main(String args[]){
    Table t1=new Table();
    t1.multiplication();
}
}