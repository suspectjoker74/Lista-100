import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Insira valor do produto:");
        double preco = s.nextFloat();
        
        System.out.println("Preco final: R$" + (preco - (preco * 0.05)));

        s.close();
    }

}
