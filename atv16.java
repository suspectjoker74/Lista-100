import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int mPC = 10; 

        System.out.println("Quantos cigarros voce fuma por dia?");
        int cgrrDia = s.nextInt();

        System.out.println("A quantos anos voce fuma?");
        int anos = s.nextInt();

        int dias = (anos*365);

        int cigarros = cgrrDia*dias;

        System.out.println(dias);
        System.out.println(cigarros);
        

        s.close();
    }

}
