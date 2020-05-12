import org.omg.PortableInterceptor.INACTIVE;

public class Program {


    public static void main(String[] args) {
        int IntegerNumber = 15;
        float FloatNumber = 56.25f;
        double DoubleNumber = 34.34d;
        String StringNumber = String.valueOf(IntegerNumber);
        String StringFLoat =  String.valueOf(FloatNumber);
        String StringDouble = String.valueOf(DoubleNumber);
        System.out.println("All the Strings = " + StringDouble + "  " + StringFLoat + "  " + StringNumber );
    }
    public static void main33(String[] args) {
        int IntegerNumber = 15;
        float FloatNumber = 56.25f;
        double DoubleNumber = 34.34d;
        String StringNumber = Integer.toString(IntegerNumber);
        String StringFLoat = Float.toString(FloatNumber);
        String StringDouble = Double.toString(DoubleNumber);
        System.out.println("All the Strings = " + StringDouble + "  " + StringFLoat + "  " + StringNumber );
    }
    public static void main55(String[] args) {
        System.out.println("This Program is to get the command line arguments");
        int agr1 = Integer.parseInt(args[0]) ;
        float agr2 = Float.parseFloat(args[1]) ;
        String agr3 = args[2];
        System.out.println("The Given arguments are :: " + agr1 + "   " + agr2 + "   " +agr3);

    }
    
}