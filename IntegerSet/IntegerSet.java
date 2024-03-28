public class IntegerSet{
    private boolean[] a;
    
    public IntegerSet(){
        a = new boolean[101];
        
        for(int i = 0; i < 101; i++)
            a[i] = false;
        
    }
    
    public void insertElement(int k){
        a[k] = true; 
    }
    
    public void deleteElement(int k){
        a[k] = false;
    }
    
    public String toSetString(){
        String aux = "";
        
        for(int i = 0; i < 101; i++)
            if(a[i] == true)
                aux += i + " ";
        
        if(aux.equals("") == true)
            return "--";
        else
            return aux;
    }
    
    public IntegerSet union(IntegerSet x){
        IntegerSet u = new IntegerSet();
        
        for(int i = 0; i < 101; i ++){
            if((a[i] == true) || (x.a[i] == true))
                u.a[i] = true;
        }
        
        return u;
    }
    
    public IntegerSet intersection(IntegerSet x){
        IntegerSet inter = new IntegerSet();
        
        for(int i = 0; i < 101; i ++)
            if(a[i] && x.a[i])
                inter.a[i] = true;
        
        return inter;
    }
    
    public Boolean isEqualTo(IntegerSet x){
        for(int i = 0; i < 101; i++)
            if(x.a[i] != a[i])
                return false;
        
        return true;
    }
    
}
