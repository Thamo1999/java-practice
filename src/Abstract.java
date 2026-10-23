abstract class Abstract {
    void turnon(){
        System.out.println("System On");
    }
}
 class HP extends Abstract{
     @Override
     void turnon() {
       System.out.println("Hp laptop on");
     }
 }
 class Dell extends Abstract{

 }
 class maine{
    public static void main(){
        HP ob1 = new HP();
        ob1.turnon();
        Dell ob2 = new Dell();
        ob2.turnon();
    }
 }