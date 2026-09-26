public class classobject {
    String name;
    int age ;
    classobject(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("name"+name);
        System.out.println("age"+age);
    }
    public static void main(String[] args){
        classobject student1 = new classobject("thamo",26);
        student1.display();
    }
}
