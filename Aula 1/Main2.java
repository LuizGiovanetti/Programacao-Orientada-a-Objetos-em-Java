/*
Leia um número do teclado e informe se este número é primo ou não.
*/
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero para verificar se eh primo: ");
        int num = teclado.nextInt();

        int soma = 0;
        for (int i = 2; i < num; i++)
            if (num % i == 0) {
                soma++;
                break;
            }

        if (soma == 0)
            System.out.println("O numero " + num + " eh primo.");
        else
            System.out.println("O numero " + num + " nao eh primo.");
    }
}
