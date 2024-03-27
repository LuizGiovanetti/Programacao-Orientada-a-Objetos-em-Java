import java.util.Random;

public class Dice{
    //Atributos:
    private int sideUp;
    
    public Dice(){
        sideUp = 1;
    }
    
    public int getSideUp(){
        return sideUp;
    }
    
    public void roll(){
        Random r = new Random();
        sideUp = r.nextInt(6) + 1;
    }
    
}
