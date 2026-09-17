import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("1.+");
        System.out.println("2.-");
        System.out.println("3.*");
        System.out.println("4./");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
              int reuslt = num1+num2;
              System.out.print(reuslt);
              break;
            case 2:
                reuslt = num1-num2;
                System.out.print(reuslt);
                break;
            case 3:
                 reuslt = num1 * num2;
                System.out.print(reuslt);
                break;
            case 4:
                 reuslt = num1/num2;
                System.out.print(reuslt);
                break;
        }
    }

}
