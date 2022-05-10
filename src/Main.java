import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        int n= input.nextInt();

        for (int i = 1; i <= n; i++){

            for (int k=1; k<=( n - i); k++){
                System.out.print(" ");
            }

            for (int i = 1; i<= (2*i) - 1; i++){
                System.out.print("*");
            }
            System.out.print();
        }

    }
}
