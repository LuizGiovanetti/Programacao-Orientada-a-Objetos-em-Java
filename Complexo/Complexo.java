public class Complexo{
    private double real, imaginario;
    
    public Complexo(double r){ //metodo construtor
        real = r;
        imaginario = 0; //por padrao ja iria ficar 0
    }
    
    public Complexo(double r, double i){ //metodo construtor
        real = r;
        imaginario = i;
    }
    
    public void inicializaNumero(double r, double i){
        real = r;
        imaginario = i;
    }
    
    public void imprimeNumero(){
        System.out.print(real + " + " + imaginario + "i");
    }
    
    public boolean eIgual(Complexo x){
        if((real == x.real) && (imaginario == x.imaginario))
            return true;
            
        return false;
    }
    
    public double soma(Complexo x){
        double r = real + x.real;
        double i = imaginario + x.imaginario;
        
        return r + i;
    }
    
    public void imprimeSoma(Complexo x){
        System.out.print("\nA soma dos numeros complexos: ("); imprimeNumero(); 
        System.out.print(") + ("); x.imprimeNumero(); 
        System.out.print(") = (" + real + " + " + x.real + ") + (" + imaginario + " + " + x.imaginario + ")i = ");
        System.out.println(soma(x));
    }
    
    public double subtrair(Complexo x){
        double r = real - x.real;
        double i = imaginario - x.imaginario;
        
        return r + i;
    }
    
    public void imprimeSubtrair(Complexo x){
        System.out.print("\nA subtracao dos numeros complexos: ("); imprimeNumero(); 
        System.out.print(") - ("); x.imprimeNumero(); 
        System.out.print(") = (" + real + " - " + x.real + ") + (" + imaginario + " - " + x.imaginario + ")i = ");
        System.out.println(subtrair(x));
    }
    
    public double multiplica(Complexo x){
        double r = ((real * x.real) - (imaginario * x.imaginario));
        double i = ((real * x.imaginario) + (imaginario * x.real));
        
        return r + i;
    }
    
    public void imprimeMultiplicar(Complexo x){
        System.out.print("\nA multiplicacao dos numeros complexos: ("); imprimeNumero(); 
        System.out.print(") * ("); x.imprimeNumero(); 
        System.out.print(") = (" + real + " * " + x.real + ") - (" + imaginario + " + " + x.imaginario + ")i = ");
        System.out.println(multiplica(x));
    }
    
    public double divide(Complexo x){
        double r = (((real * x.real) + (imaginario * x.imaginario)) / ((x.real * x.real) + (x.imaginario * x.imaginario)));
        double i = (((imaginario * x.real) - (real * x.imaginario)) / ((x.real * x.real) + (x.imaginario * x.imaginario)));
        
        return r + i;
    }
    
    public void imprimeDividir(Complexo x){
        System.out.print("\nA divisao dos numeros complexos: ("); imprimeNumero(); 
        System.out.print(") / ("); x.imprimeNumero(); 
        System.out.print(") = ((" + real + " * " + x.real + " + " + imaginario + " * " + x.imaginario + ") / (" + x.real + " * " + x.real);
        System.out.print(" + "+ x.imaginario + " * " + x.imaginario + ")) + ((");
        System.out.print(imaginario + " * " + x.real + " - " + real + " * " + x.imaginario + ") / (" + x.real + " * " + x.real);
        System.out.print(" + "+ x.imaginario + " * " + x.imaginario + "))i = ");
        System.out.println(divide(x));
    }
}
