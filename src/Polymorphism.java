public class Polymorphism {
    public static void main(){
        methods obj = new methods();
        obj.display();
        obj.display(5);
    }
}
class methods{
    void display(){
        System.out.println("hi");
    }
    void display(int a){
        System.out.println(a);
    }
}
