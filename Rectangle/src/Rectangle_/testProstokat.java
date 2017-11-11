
package Rectangle_;

/**
 * 
 * @author michal parciak
 */
public class testProstokat {
/**
 * 
 * @param args create objects of rectangle , circle , point
 */
    public static void main(String[] args) {
        Prostokat obj; Punkt obj1; Punkt test;
        test = new Punkt(1,2);
        obj1 = new Punkt(3,4);
        obj = new Prostokat(2,5,obj1);
        
        
        System.out.println(obj);
        
        boolean z = obj.zawiera(test);
        System.out.println("Czy punkt znajduje sie w prostokacie : "+z);
       
        Okrag obj2;
        obj2 = new Okrag(6,obj1);
        boolean zz = obj2.zawiera(test);
        System.out.println("Czy punkt znajduje sie w okregu :"+zz);
        
        
        Okrag testowy;
        testowy = new Okrag(2,test);
        boolean ww = obj2.przecina(testowy);
        System.out.println("Czy Podany okrag przecina testowy: "+ww);
        
    }   
    
}
