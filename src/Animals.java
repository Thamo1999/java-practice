public class Animals {
    int noLegs = 4;
    public static void eat(){
        System.out.println("iam eating");
    }
    public static void walk(){
        System.out.println("iam walk");
    }
}
class dog extends Animals{
    boolean canbark = true;
}
class call{
    public static void main(String[] arg) {
        dog obj = new dog();
        System.out.println(obj.noLegs);
        System.out.println(obj.canbark);
        obj.eat();
        obj.walk();
    }
}