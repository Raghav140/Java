import java.io.*;
class Arrayinitializations
{
     public static void main(String[]args) {
        int marks[]=new int[5];
        int total=0;
        double average =0;
        int n = marks.length;

        DataInputStream r=new DataInputStream(System.in);
    
    try {
        System.out.println("Enter marks of 5 subjects");
        for(int index=0; index<marks.length; index++)
        {
            marks[index]=Integer.parseInt(r.readLine())
        }
      
         System.out.println("\n------------MARKS ARE-------------");

         for(int index=0; index<marks.length; index++)
         {
            System.out.println("Marks are : "+marks[index]);
           total=total+marks[index];
         }
         average=total/n;
         System.out.println("\n Total Obtained Marks :" +total);
         System.out.println("Average Obtained Marks  :" +average );
    }
    
     catch (Exception e) {
     
        System.out.println("An Unexpected error has occured!");
    }
}
}

    
