
package lingkaran;


public class Lingkaran {
   
    
    private double r;
    private double luas;
    private final double PHI = 3.14;
    public void luas(double r){
        r = 7;
        luas = PHI *r*r;
        System.out.println("Luas lingkaran dengan jara="+r+"adalah : "+luas);
    }
}
