/**
 * Class Main
 *
 * @author reza aulia
 * @version 0.5
 */
public class main
{
   public static void main(String args[])
   {
  int hasil ;
    
   Calculator calculator1 = new Calculator();
   System.out.println(calculator1.opA);
   System.out.println(calculator1.opB);
   System.out.println(calculator1.info);
   
   Calculator calculator2 = new Calculator(2,3);
   System.out.println(calculator2.opA);
   System.out.println(calculator2.opB);
   System.out.println(calculator2.info);
    System.out.println(calculator2.penjumlahan(8,4));
    System.out.println(calculator2.pengurangan(8,4));
    System.out.println(calculator2.Perkalian(8,4));
    System.out.println(calculator2.pembagian(8,4));
    
    calculatorAdvanced calculator3 = new calculatorAdvanced();
    System.out.println(calculator3.info);
    System.out.println(calculator3.opA);
    System.out.println(calculator3.opB);
    System.out.println(calculator3.penjumlahan(8,4));
    System.out.println(calculator3.pengurangan(8,4));
    System.out.println(calculator3.Perkalian(8,4));
    System.out.println(calculator3.pembagian(8,4));
    hasil= calculator3.Faktorial(7);
    System.out.println(hasil);
    
    
        double hasilSin = 0;
        double hasilCos = 0;
        double hasilTan = 0;
        int hasiljumlah=0;
        double der = 30;
        double rad = 0.5235987755982988;
        
        calculatorTrigonometri ct1 = new calculatorTriDeg();
        //CalculatorTrigonometri ct1 = new CalculatorTrigonometri();
        hasiljumlah = ct1.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct1.op);
        ct1.konversi(der);
        System.out.println("Nilai derajat = "+der+ " setelah konversi = "+ ct1.op);
        hasilSin = ct1.menghitungSin();
        System.out.println("Nilai sin = "+der+ " derajat adalah = "+ hasilSin);
        hasilCos = ct1.menghitungCos();
        System.out.println("Nilai Cos = "+der+ " derajat adalah = "+ hasilCos);
        hasilTan = ct1.menghitungTan();
        System.out.println("Nilai Tan = "+der+ " derajat adalah = "+ hasilTan);
        
        System.out.println("");
        System.out.println("");
        
        calculatorTrigonometri ct2 = new calculatorTriRad();
        //CalculatorTrigonometri ct1 = new CalculatorTrigonometri();
        hasiljumlah = ct2.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct2.op);
        ct2.konversi(rad);
        System.out.println("Nilai rad = "+rad+ " setelah konversi = "+ ct2.op);
        hasilSin = ct2.menghitungSin();
        System.out.println("Nilai sin = "+rad+ " radian  adalah = "+ hasilSin);
        hasilCos = ct2.menghitungCos();
        System.out.println("Nilai Cos = "+rad+ " radian adalah = "+ hasilCos);
        hasilTan = ct2.menghitungTan();
        System.out.println("Nilai Tan = "+rad+ " radian adalah = "+ hasilTan);
        
    }
}