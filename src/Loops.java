public class Loops {
    public static void main(){
      loop3();
      loop4();
      loop5();
    }
    static void loop1(){
        for(int i=1; i<=20; i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
    static void loop2(){
        for (int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
    static void  loop3(){
        for (int i=1; i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void loop4(){
        int i=1;
        while (i<=5){
            System.out.print(i);
            i++;
        }
    }
    static void loop5(){
        int i=1;
        do{
            System.out.print(i);
            i++;
        }while (i<=5);
    }
}
