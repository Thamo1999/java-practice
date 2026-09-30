public class Schoolstudent {
    String name;
    int age;
    int mark;
    Schoolstudent(String name,int age,int mark){
        this.name=name;
        this.age=age;
        this.mark=mark;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(mark);
    }
    public static void main(String []arg){
        Schoolstudent s1 = new Schoolstudent("thamo",26,80);
        s1.display();
    }
}
