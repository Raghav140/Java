import java.util.Scanner;
class India{
    Scanner sc=new Scanner(System.in);
    int i;
    void map(){
        System.out.println("enter the value for i");
        i=sc.nextInt();
        System.out.println("now you will get the information about indian states and their capital");
try {
        switch( i ){
            case 1:
            System.out.println(" state= ANDHRA PRADESH :  capital= AMARAVATI");
            break;
            
            case 2:
            System.out.println(" state= ARUNACHAL PRADESH :  capital =ITANAGAR");
            break;

            case 3:
            System.out.println(" state= ASSAM :  capital= DISPUR");
            break;

            case 4:
            System.out.println(" state= BIHAR : capital= PATNA");
            break;

            case 5:
            System.out.println(" state= CHHATISGARH  : capital= RAIPUR");
            break;

            case 6:
            System.out.println(" state= GOA  : capital= PANAJI");
            break;

            case 7:
            System.out.println(" state= GUJARAT : capital= GANDHINAGAR");
            break;

            case 8:
            System.out.println(" state= HARYANA  :  capital= CHANDIGARH");
            break;

            case 9:
            System.out.println("state= HIMACHAL PRADESH  :  capital= SHIMLA");
            break;

            case 10:
            System.out.println("state= JHARKHAND : capital= RANCHI");
            break;

            case 11:
            System.out.println(" state= KARANATAKA : capital= BENGALURU");
            break;

            case 12:
            System.out.println(" state= KERELA :  capital= DISPUR");
            break;

            case 13 :
            System.out.println(" state= MADHYA PRADESH :  capital= BHOPAL");
            break;

            case 14:
            System.out.println(" state= MAHARASHTRA :  capital= MUMBAI");
            break;

            case 15:
            System.out.println(" state= MANIPUR :  capital= IMPHAL");
            break;

            case 16:
            System.out.println(" state= MEGHALAYA :  capital= SHILLONG");
            break;

            case 17:
            System.out.println(" state= MIZORAM :  capital= AIZWAL");
            break;

            case 18:
            System.out.println(" state= NAGALAND :  capital= KOHIMA");
            break;

            case 19:
            System.out.println(" state= ODISSA :  capital= BHUBANESHWAR");
            break;

            case 20:
            System.out.println(" state= PANJAB :  capital= CHANDIGARH");
            break;

            case 21:
            System.out.println(" state= RAJASTHAN :  capital= JAIPUR");
            break;

            case 22:
            System.out.println(" state= SIKKIM :  capital= GANGKOT");
            break;

            case 23:
            System.out.println(" state= TAMIL NADU :  capital= CHENNAI");
            break;

            case 24:
            System.out.println(" state= TELANGANA :  capital= HYDERABAD");
            break;

            case 25:
            System.out.println(" state= TRIPURA  :  capital= AGARTALA");
            break;

            case 26:
            System.out.println(" state= UTTAR PRADESH :  capital= LUCKNOW");
            break;

            case 27:
            System.out.println(" state= UTTARAKHAND :  capital= DEHRADUN");
            break;

            case 28:
            System.out.println(" state= WEST BENGAL :  capital= KOLKATA");
            break;

            default: System.out.println("there are only 28 states");
        }
    }
    catch (Exception e){
        System.out.println("you have countered a error, please try again ");
    }

    }
    public static void main(String args[]){
        India I1=new India();
        I1.map();
}
}