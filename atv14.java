
import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double vlrDia = 90;
        double vlrKm = 0.20;

       
        System.out.println("Quantos dias ficou com o carro?");
        int dias = s.nextInt();
        System.out.println("Quantos km rodou com o carro?");
        int kms = s.nextInt();

        System.out.println("Deve pagar: R$" + (dias*vlrDia + kms*vlrKm) );

        s.close();
    }

}
