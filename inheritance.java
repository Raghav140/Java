 class Animal{
    void sound(){
        System.out.println("following are the sound of different animals-----");
    }
}
    class dog extends Animal {

    void sound(){
       System.out.println("bhau bhau bhau");
    }

}
class cat extends Animal {
    void sound(){
        System.out.println("meow meow meow ");
    }
}
 class cock extends Animal{
    void sound(){
        System.out.println("kuckdukoo kuckdukoo");
    }
}
 public class inheritance extends Animal {
public static void main(String args[]){
dog d1=new dog();
cat c1=new cat();
cock k1=new cock();

d1.sound();
c1.sound();
k1.sound();
}



}