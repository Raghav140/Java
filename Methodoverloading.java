import java.util.Scanner;
class Methodoverloading{
    
    
    int result;
    void perimeter(int side){
        
        
        result=4*side;
        System.out.println("the perimeter of square is--"+result);
    }
    void perimeter(int lenght,int breadth){
        
        result=2*(lenght+breadth);
        System.out.println("the perimeter of rectangle is--"+result);
    }
    void perimeter(int firstside,int secondside,int thirdside){
        
        result=firstside+secondside+thirdside;
        System.out.println("the perimeter of triangle is--"+result);
    }
    public static void main(String args[]){
        Methodoverloading m1=new Methodoverloading();
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the side of square--");
        int side= sc.nextInt();
        m1.perimeter( side);

        System.out.println("enter the lenght and breadth of rectangle-- ");
        int lenght= sc.nextInt();
        int breadth= sc.nextInt();
        m1.perimeter(lenght,breadth);


        System.out.println("enter the three side of triangl--");
        int firstside= sc.nextInt();
        int secondside= sc.nextInt();
        int thirdside= sc.nextInt();
        m1.perimeter(firstside,secondside,thirdside);

        
    }

    
}
