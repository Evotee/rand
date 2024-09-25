import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int a, b=0, c, d=7, n;
        System.out.println("Choose your level:" +
                "\n\t0 - [0, 100] + 7 tries" +
                "\n\t1 - [0, 1000] + 10 tries" +
                "\n\t2 - Exit");
        a = sc.nextInt();
        if (a!=2) {
            if (a == 0) {
                b = 100;
                System.out.println("[0, 100] + 7 tries");
            } else if (a == 1) {
                b = 1000;
                d = 10;
                System.out.println("[0, 1000] + 10 tries");
            }
            c = rand.nextInt(b);
            outer:
            for (int i=0; i<d; ++i){
                n = sc.nextInt();
                if (n==c) {
                    System.out.println("You Won!");
                    break outer;
                } else if (n<c) {
                    System.out.println(">");
                }else {
                    System.out.println("<");
                }
                System.out.println("You have " + (d-i-1) + " tries left");
                if (d-i-1==0) {
                    System.out.println("You lose, " + c + "!");
                }
            }
        }
    }
}