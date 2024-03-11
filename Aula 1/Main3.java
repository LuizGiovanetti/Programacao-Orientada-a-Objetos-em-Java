/*
Leia um número do teclado e informe se este é um número perfeito.
*/
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero para verificar se eh perfeito: ");
        int num = teclado.nextInt();

        int soma = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                soma = soma + i;

        if (soma == num)
            System.out.println("O numero " + num + " eh perfeito.");
        else
            System.out.println("O numero " + num + " nao eh perfeito.");
    }
}
