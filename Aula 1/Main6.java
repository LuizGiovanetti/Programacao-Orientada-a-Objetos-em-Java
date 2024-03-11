/*
Leia um número inteiro, positivo e ímpar n e imprima uma matriz com 2 * n - 1 colunas, onde a última linha tem um 1 no centro com 0's em volta, 
a penúltima linha tem três 1's no centro com 0's em volta, a antepenúltima linha tem cinco 1's, e assim por diante
(os 1's formarão um triângulo com a base para cima), até a primeira linha ser composta apenas por 1's.
A condição de parada do programa é n igual a -1. A leitura de n deve ser validada de forma que o programa apenas aceite
números ímpares positivos como entrada válida para produzir a matriz.
*/
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um numero impar positivo: ");
            num = teclado.nextInt();
        } while ((num <= 0) || (num % 2 == 0));

        piramide(0, (num * 2) - 1, num);
    }

    public static void piramide(int ini, int fim, int num) {
        if (ini + 1 > num)
            return;

        for (int i = 0; i < ini; i++)
            System.out.print("0 ");

        for (int i = 0; i < fim; i++)
            System.out.print("1 ");

        for (int i = 0; i < ini; i++)
            System.out.print("0 ");

        System.out.println();

        piramide(ini + 1, fim - 2, num);
    }
}
