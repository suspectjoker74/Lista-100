import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Insira valor do salário:");
        double salario = s.nextFloat();
        
        System.out.println("Preco final: R$" + (salario  * 1.15));

        s.close();
    }

}
