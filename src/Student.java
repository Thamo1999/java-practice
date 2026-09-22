public class Student {
    String name;
    int mark;
    int age;
    char grade;
    public static void main(){
        Student student1 = new Student();
            student1.name = "thamo";
            student1.age = 26;
            student1.mark = 80;
            student1.grade = 'A';
            Student student2 = new Student();
            student2.name = "dharan";
            student2.age = 26;
            student2.mark = 70;
            student2.grade = 'A';
            System.out.println(student1.name);
            System.out.println(student2.mark);
    }

}
