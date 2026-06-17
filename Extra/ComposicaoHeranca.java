class A{
    int valorA;

    public A(){
        valorA = 10; // Valor default para A
    }
}

class B{
    String valorB;

    public B() {
        valorB = "Olá"; // Valor default para B
    }
}

class C extends A{
    B objetoB = new B(); // Cria um membro de B dentro de C
}

public class ComposicaoHeranca{
    public static void main(String[] args){
        C objetoC = new C();
        System.out.println("valorA em C: " + objetoC.valorA);
        System.out.println("valorB em C: " + objetoC.objetoB.valorB);
    }
}