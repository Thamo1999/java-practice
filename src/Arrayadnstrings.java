import java.util.Scanner;
public class Arrayadnstrings {
    public  static void main(){
        Reversestring();
        palindrom();
        Reversearray();
    }
   static void Reversestring(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string");
        String str = sc.nextLine();
        String reverse = "";
        for (int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.print("Reverse  "+reverse);
    }
    static void palindrom(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your palnidrom scentance");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.print("this is palindrom");
        }
        else {
            System.out.print("this is not plaindrom");
        }
    }
    static void Reversearray(){
        int[] numbers = {1,2,3,4,5,6};
        for (int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]+"");
        }
    }
}