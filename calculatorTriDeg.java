
import java.lang.Math;

/**
 * class calculatorTriDeg
 *
 * @author reza aulia
 * @version 0.5
 */
public class calculatorTriDeg extends calculatorTrigonometri
{
   public void konversi(double deg)
   {
       super.op = Math.toRadians(deg);
   }
}
