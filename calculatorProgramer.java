
/**
 * Write a description of class calculatorProgramer here.
 *
 * @author reza aulia
 * @version 0.5
 */
public class calculatorProgramer extends Calculator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class calculatorProgramer
     */
    public calculatorProgramer()
    {
    }    
    /**
     * Konversi desimal ke biner dan hexa
     *
     * @param int opA
     * @return hasil marupakan biner dari desimal opA
     */
    public int Konversi(int opA)
    {
        int hasil;
        int dec = opA;
        System.out.println(Integer.toBinaryString(opA));
        System.out.println(Integer.toHexString(dec));
        hasil = opA;
        return hasil;
    }
}
