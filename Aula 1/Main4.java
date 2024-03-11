/*
Leia um número do teclado e informe todos os números primos entre 0 e este número.
*/
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero para validar os numeros primos ate ele: ");
        int num = teclado.nextInt();

        for (int i = 2; i <= num; i++) {
            int soma = 0;
            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    soma++;
                    break;
                }

            if (soma == 0)
                System.out.println(i);
        }
    }
}
