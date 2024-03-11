/*
Preencha um vetor com 10 números pseudo-aleatórios e imprima este vetor de forma ordenada.
Faça uso do algoritmo de ordenação bolha.
*/
import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        int[] vet = new int[10];

        Random aleatorio = new Random();
        for (int i = 0; i < 10; i++)
            vet[i] = aleatorio.nextInt(100);

        int aux;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }

        for (int i = 0; i < 10; i++)
            System.out.println(vet[i]);
    }
}
