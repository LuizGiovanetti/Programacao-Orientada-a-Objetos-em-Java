public class UsaIntegerSet{
    public static void main(String[] args){
        IntegerSet c1 = new IntegerSet();
        
        c1.insertElement(13);
        c1.insertElement(84);
        c1.insertElement(22);
        
        IntegerSet c2 = new IntegerSet();
        
        c2.insertElement(13);
        c2.insertElement(84);
        
        c1.deleteElement(22);
        
        System.out.println("c1: " + c1.toSetString());
        System.out.println("c2: " + c2.toSetString());
        
        IntegerSet c3 = c1.union(c2);
        
        System.out.println("\nUnion: " + c3.toSetString());
 
        IntegerSet c4 = c1.intersection(c2);
        
        System.out.println("\nIntersection: " + c4.toSetString());
        
        System.out.print("\nTeste de igualdade de conjuntos: ");
        System.out.println(c1.isEqualTo(c2));
    }
    
}
