public class UsaComplexo{
    public static void main(String[] args){
        Complexo c1 = new Complexo(4, 4);
        Complexo c2 = new Complexo(1, 1);
        
        c2.inicializaNumero(2, 2);
        
        c1.imprimeNumero();
        System.out.print("\n");
        c2.imprimeNumero();
        
        System.out.println("\n\n" + c1.eIgual(c2));
        
        c1.imprimeSoma(c2);
        
        c1.imprimeSubtrair(c2);
        
        c1.imprimeMultiplicar(c2);
        
        c1.imprimeDividir(c2);
    }    
}
