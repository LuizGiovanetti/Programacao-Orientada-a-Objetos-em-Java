class A{
    int valorA;

    public A(int valor){
        valorA = valor;
    }
}

class B{
    String valorB;

    public B(String valor){
        valorB = valor;
    }
}

class C extends A{
    B objetoB;

    public C(int num, String str){
        super(num); // Chama o construtor de A com o valor fornecido
        objetoB = new B(str); // Cria um objeto de B com o valor fornecido
    }
}

public class ComposicaoHerancaDois{
    public static void main(String[] args){
        C objetoC = new C(25, "Mundo"); // Passa valores para os construtores de A e B
        System.out.println("valorA em C: " + objetoC.valorA);
        System.out.println("valorB em C: " + objetoC.objetoB.valorB);
    }
}
