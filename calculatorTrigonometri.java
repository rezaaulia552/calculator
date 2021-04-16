
import java.lang.Math;
/**
 * class calculatorTrigonometri 
 *
 * @author reza aulia
 * @version 0.5
 */
public abstract class calculatorTrigonometri extends Calculator
{
    // instance variables - replace the example below with your own
    public double op=0;
    public abstract void konversi(double op);
    public double menghitungSin()
    {
        return Math.sin(this.op);
    }
     public double menghitungCos()
    {
        return Math.cos(this.op);
    }
     public double menghitungTan()
    {
        return Math.tan(this.op);
    }
}
