public class Polymorphism {
   int add(int a, int b){
       return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
    double add(double a, double b){
       return a+b;
    }
    public static void main(String[] args){
       Polymorphism cal = new Polymorphism();
       System.out.println(cal.add(2,3));
        System.out.println(cal.add(2,3,6));
        System.out.println(cal.add(2.5,2.8));
    }
}
