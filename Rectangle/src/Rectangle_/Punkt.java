
package Rectangle_;


/**
 * 
 * @author michal parciak
 */
class Punkt {
    double os_x;
    double os_y;
    /**
     * 
     * @param os_x set axis X
     * @param os_y set axis Y
     */
    Punkt(double os_x,double os_y)
    {
        this.os_x=os_x;
        this.os_y=os_y;
    }
    /**
     * 
     * @param dx move axis X by value
     * @param dy move axis Y by value 
     */
    void przesun(double dx,double dy)
    {
        this.os_x = dx;
        this.os_y =dy;
    }
    /**
     * 
     * @return string method with axis X,Y value
     */
    public String toString()
    {
        return"[punkt x: "+os_x+",punkt y: "+os_y+"]";
    }
    
}
