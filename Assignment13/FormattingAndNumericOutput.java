import java.text.*;

class FormattingAndNumericOutput {
    public static void main(String[] args) {
        
        DecimalFormat numberformat = new DecimalFormat("0.00"); 
        System.out.println("numberformat = " + numberformat.format(71));
        
        DecimalFormat anotherformat = new DecimalFormat("00.00"); 
        System.out.println("anotherformat = " + anotherformat.format(19));
        
        DecimalFormat yetanotherformat = new DecimalFormat("00.000"); 
        System.out.println("yetanotherformat = " + yetanotherformat.format(13.22915));
        
        DecimalFormat yetanotherformatagain = new DecimalFormat("000.000"); 
        System.out.println("yetanotherformatagain = " + yetanotherformatagain.format(26.14515));
        
        DecimalFormat format5 = new DecimalFormat("0000.000"); 
        System.out.println("format5 = " + format5.format(12.1314));
    }
}