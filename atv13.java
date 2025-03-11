import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Insira valor do salário:");
        double salario = s.nextFloat();
        
        System.out.println("Insira valor da porcentagem aumento:");
        double aumento = s.nextFloat();

        aumento = Math.abs(((aumento-100)/100)+1);

        System.out.println("Preco final: R$" + salario*(aumento+1) );

        s.close();
    }

}
