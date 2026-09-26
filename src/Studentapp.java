import java.util.Scanner;
public class Studentapp {
    static String name;
    static int age;
    static  int mark;

    static void addstudent(Scanner sc){
        System.out.print("enter your name");
        name = sc.nextLine();
        System.out.print("enter your age");
        age = sc.nextInt();
        System.out.print("enter your mark");
        mark = sc.nextInt();
        System.out.println("student add suscessfully");
    }
   static void viewstudent(){
        System.out.print("student deatils");
            System.out.println("student name"+name);
            System.out.println("student age"+age);
            System.out.println("Student mark"+mark);
   }
   static char calculatemark(int mark){
        if (mark >=90){
            return 'A';
        } else if (mark >= 80) {
            return 'B';
        } else if (mark >= 70) {
            return 'C';
        } else if (mark >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
   }
   public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int choice;
        do{
            System.out.println("Student management app");
            System.out.println("1.Add student");
            System.out.println("2.view student");
            System.out.println("3.calculate grade");
            System.out.println("4.exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addstudent(sc);
                    break;
                case 2:
                    viewstudent();
                    break;
                case 3:
                    char grade = calculatemark(mark);
                    System.out.println("garde"+ grade);
                    break;
                case 4:
                    System.out.println("thank you");
                    break;
                default:
                    System.out.println("invalide choice");
            }
        }
        while (choice!=4);
        sc.close();
   }
}
