public class Rational{
    private int numerador;
    private int denominador;
    
    public Rational(){
        numerador = 0;
        denominador = 1;
    }
    
    private int mmc(int a, int b){
        return (b == 0 ? a : mmc(b, a % b));
    }
    
    public void inicializarRational(int numerador, int denominador){
        if(denominador != 0){
            int mmc = mmc(numerador, denominador);
            
            this.numerador = numerador / mmc;
            this.denominador = denominador / mmc;
        }
    }
    
    public Rational soma(Rational num){
        Rational r = new Rational();
        
        if(this.denominador != num.denominador){
            r.numerador = ((this.numerador * num.denominador) + (this.denominador * num.numerador));
            
            r.denominador = (this.denominador * num.denominador);
        }
        else{
            r.numerador = (this.numerador + num.numerador);
            
            r.denominador = this.denominador;
        }
        
        int mmc = mmc(r.numerador, r.denominador);
        
        r.numerador = r.numerador / mmc;
        r.denominador = r.denominador / mmc;
        
        return r;
    }
    
    public Rational subtrair(Rational num){
        Rational r = new Rational();
        
        if(this.denominador != num.denominador){
            r.numerador = ((this.numerador * num.denominador) - (this.denominador * num.numerador));
            
            r.denominador = (this.denominador * num.denominador);
        }
        else{
            r.numerador = (this.numerador - num.numerador);
            
            r.denominador = this.denominador;
        }
        
        int mmc= mmc(r.numerador, r.denominador);
        
        r.numerador = r.numerador / mmc;
        r.denominador = r.denominador / mmc;
        
        return r;
    }
    
    public Rational multiplicar(Rational num){
        Rational r = new Rational();
        
        r.numerador = (this.numerador * num.numerador);
        r.denominador = (this.denominador * num.denominador);
        
        int mmc = mmc(r.numerador, r.denominador);
        
        r.numerador = r.numerador / mmc;
        r.denominador = r.denominador / mmc;
        
        return r;
    }
    
    public Rational dividir(Rational num){
        Rational r = new Rational();
        
        r.numerador = (this.numerador * num.denominador);
        r.denominador = (this.denominador * num.numerador);
        
        int mmc = mmc(r.numerador, r.denominador);
        
        r.numerador = r.numerador / mmc;
        r.denominador = r.denominador / mmc;
        
        return r;
    }
    
    public void imprimeRational(){
        System.out.println(numerador +  " / " + denominador); 
    }
    
    public void imprimeRationalFloat(int n){
        float valor = (float)numerador / (float)denominador;
        
        System.out.printf("%." + n +"f\n", valor);
    }
}
