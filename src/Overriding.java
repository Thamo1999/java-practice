public class Overriding {
    void sound(){
        System.out.println("animal make sound");
    }
}
class Dog extends Overriding{

    void sound(){
        System.out.println("Dogs barks");
    }
}
class Cat extends Overriding{
    void sound(){
        System.out.println("Cat mewos");
    }
}
class main{
    public static void main(){
        Dog obj = new Dog();
        Cat obj1 = new Cat();
        obj.sound();
        obj1.sound();
    }
}