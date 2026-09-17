import java.util.Scanner;
public class Main{
    public static void main(){
        Scanner inupts = new Scanner(System.in);
        System.out.print("enter marks");
        int marks = inupts.nextInt();
        if (marks == 35){
            System.out.print("c");
        } else if (marks > 80) {
            System.out.print("A");
        } else if (marks >70) {
            System.out.print("A+");
        }
         else if (marks > 50) {
            System.out.print("b");
        }
        else if(marks < 35){
            System.out.print("F");
        }
    }
}