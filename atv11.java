import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Calculadora de bhaskara!\n Insira o valor de A, B e C. Respectivamente.");

        double numA = s.nextFloat();
        double numB = s.nextFloat();
        double numC = s.nextFloat();

        double delta = (numB*numB - 4*numA*numC);

        System.out.println("Δ=" + delta);
        
        s.close();
    }

}
