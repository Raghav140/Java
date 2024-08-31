class Akshit{
    void display1(){
        System.out.println("TANVEER SINGH JASWAL IS SON OF AKSHIT BHARDWAJ");
    }
}
class Tanveer extends Akshit{
    void display2(){
       System.out.println("TARANPREET SINGH MEHRA IS SON OF TANVEER SINGH JASWAL");
    }
}
class Taran extends Tanveer{
    void display3(){
        System.out.println("HARPREET SINGH MAND[MACCHIWARA WALA] IS SON OF TARANPREET SINGH MEHRA");
    }
}
class multiinheritance{
    public static void main(String args[]){
        Taran t1=new Taran();
        t1.display1();
        t1.display2();
        t1.display3();

    }
}



