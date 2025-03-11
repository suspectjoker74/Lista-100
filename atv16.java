import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int mPC = 10; 

        System.out.println("Quantos cigarros voce fuma por dia?");
        int cgrrDia = s.nextInt();

        System.out.println("A quantos anos voce fuma?");
        int anos = s.nextInt();

        int diasFumados;
        if (anos%4 == 0) diasFumados = (anos*365) + (anos/4); 
        else diasFumados = (anos*365);

        int cigarrosFumados = cgrrDia*diasFumados;

        System.out.println(diasFumados);
        System.out.println(cigarrosFumados);
        

        s.close();
    }

}
