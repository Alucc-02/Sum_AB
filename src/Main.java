import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Valor de 'a' = ");
        int a = t.nextInt();
        System.out.print("Valor de 'b' = ");
        int b = t.nextInt();
        System.out.println("A soma de 'a' + 'b' = "+ Integer.sum(a,b));


    }
}