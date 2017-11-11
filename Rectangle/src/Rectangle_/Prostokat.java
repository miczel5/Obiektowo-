
package Rectangle_;


/**
 * Class to build object rectangle with set height and width
 * @author michal parciak
 */
class Prostokat {
    double wysokosc;
    double szerokosc;
    Punkt wierzcholek;
    Prostokat()
    {
        this.wysokosc=0.0;
        this.szerokosc=0.0;
        this.wierzcholek = new Punkt(0,0);
    }
    /**
     * 
     * @param wysokosc set height of rectangle
     * @param szerokosc set width of rectangle
     * @param wierzcholek set peak of rectangle
     */
    Prostokat(double wysokosc,double szerokosc,Punkt wierzcholek)
    {
        this.wysokosc=wysokosc;
        this.szerokosc=szerokosc;
        this.wierzcholek=wierzcholek;
    }
    /**
     * 
     * @return value of rectangle area
     */
    double pole()
    {
        return wysokosc * szerokosc;
    }
    /**
     * 
     * @return circuit of rectangle 
     */
    double obwod()
    {
        return 2* wysokosc + 2* szerokosc;
    }
    /**
     * 
     * @param dx move axis X of value
     * @param dy move axis Y of value
     */
    void przesun(double dx,double dy)
    {
        this.wierzcholek.przesun(dx+wierzcholek.os_x,dy+wierzcholek.os_y);
      
    }
    /**
     * 
     * @return string method with value of height and width of rectangle
     */
    public String toString()                                                   
   {                                                                          
      return "[wysokosc: "+wysokosc+", szerokosc: "+szerokosc+"]"+wierzcholek.toString(); 
   }
   /**
    * 
    * @param test to check that rectangle contain Point inside
    * @return boolean value if rectangle contain or false if its not
    */
    boolean zawiera(Punkt test){
        return(this.wierzcholek.os_x<=test.os_x)&& (test.os_x<this.wierzcholek.os_x+this.szerokosc && 
        (this.wierzcholek.os_y<= test.os_y)&& (test.os_y <= this.wierzcholek.os_y+this.wysokosc));
    }
    }
    


