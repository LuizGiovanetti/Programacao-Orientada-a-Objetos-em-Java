public class UsaRational{
    public static void main(String[] args){
        Rational num1 = new Rational();
        Rational num2 = new Rational();
        
        Rational soma = new Rational();
        Rational subtrair = new Rational();
        Rational dividir = new Rational();
        Rational multiplicar = new Rational();
        
        num1.inicializarRational(5, 5);
        num2.inicializarRational(2, 3);
        
        System.out.println("Fracao 1: ");
        num1.imprimeRational();
        num1.imprimeRationalFloat(2);
        
        System.out.println("\nFracao 2: ");
        num2.imprimeRational();
        num2.imprimeRationalFloat(2);
        
        System.out.println("\nSoma das fracoes: ");
        soma = num1.soma(num2);
        soma.imprimeRational();
        soma.imprimeRationalFloat(2);
        
        System.out.println("\nSubtracao das fracoes: ");
        subtrair = num1.subtrair(num2);
        subtrair.imprimeRational();
        subtrair.imprimeRationalFloat(2);
        
        System.out.println("\nMultiplicacao das fracoes: ");
        multiplicar = num1.multiplicar(num2);
        multiplicar.imprimeRational();
        multiplicar.imprimeRationalFloat(2);
        
        System.out.println("\nDivisao das fracoes: ");
        dividir = num1.dividir(num2);
        dividir.imprimeRational();
        dividir.imprimeRationalFloat(2);
    } 
}
