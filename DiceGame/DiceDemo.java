public class DiceDemo{
 public static void main(String[] args){
    Dice dado1 = new Dice();
    Dice dado2 = new Dice();
    
    dado1.roll();
    dado2.roll();
    
    int soma = dado1.getSideUp() + dado2.getSideUp();
    
    System.out.println("Dado 1: "+ dado1.getSideUp() +"\nDado 2: " + dado2.getSideUp() + "\nSoma: " + soma);
     
 }
 
}
