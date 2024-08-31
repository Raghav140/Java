 m1.macchiwara(5;)
{
    void macchiwara(int a){
        System.out.println(a);
    }
    void macchiwara (int a,int b){
        System.out.println(a*b);
    }
    void macchiwara(int a,int b,int c){
        System.out.println(a*b*c);
    }

public static void main(String args[]){

    Method m1=new Method();
    m1.macchiwara(5);
     m1.macchiwara(5,5);
      m1.macchiwara(5,5,5);
   }
}



