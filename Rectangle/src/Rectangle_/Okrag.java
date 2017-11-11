
package Rectangle_;

/**
 * 
 * @author michal parciak
 */
class Okrag {
    Punkt wierzcholek;
    double promien;
    Okrag()
    {
        this.promien=0.0;
        this.wierzcholek = new Punkt(0,0);
    }
   /**
    * 
    * @param promien set radius in Circle class
    * @param wierzcholek set peak in Circle class
    */
    Okrag(int promien,Punkt wierzcholek)
    {
        this.promien=promien;
        this.wierzcholek=wierzcholek;
    }
    /**
     * 
     * @return area of Circle
     */
    double pole()
    {
        return Math.PI * Math.pow(promien, 2);
    }
    /**
     * 
     * @param test as Peak with X,Y point to check that Circle contain point
     * @return boolean true or false if Circle contain point
     */
    boolean zawiera(Punkt test){
        double odleglosc;double x2x1;double y2y1;
        double tmp;  double tmp2;
        
        x2x1 = this.wierzcholek.os_x-test.os_x;
        y2y1 = this.wierzcholek.os_y-test.os_y;
        tmp = Math.pow(x2x1,2);
        tmp2 = Math.pow(y2y1,2);
        odleglosc = Math.sqrt(tmp+tmp2);
        if(odleglosc<this.promien){
            return true;
        }
   
        else{
            return false;
        }
    }
    /**
     * 
     * @param testowy Object to check that Circle intersect another Circle object
     * @return boolean value if test Circle intersect or false if it is not
     */
    boolean przecina(Okrag testowy){
        return(Math.abs(promien-testowy.promien)<= Math.sqrt(Math.pow((this.wierzcholek.os_x-testowy.wierzcholek.os_x),2)+
               Math.pow((this.wierzcholek.os_y-testowy.wierzcholek.os_y),2)))
                && (Math.sqrt(Math.pow((this.wierzcholek.os_x-testowy.wierzcholek.os_x),2)
                 + Math.pow((this.wierzcholek.os_y-testowy.wierzcholek.os_y),2))<= (this.promien+testowy.promien));
        
    }
}
      


