import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número para saber qual é o seu sucessor e antecessor");

        int num = s.nextInt();

        System.out.println("Anterior: " + (num-1));
        System.out.println("Posterior: " + (num+1));

    }
}
