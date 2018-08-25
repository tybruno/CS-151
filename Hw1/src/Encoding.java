import java.util.Set;
import java.util.TreeSet;

public class Encoding {


    public static void println(String x) {
        System.out.println(x);
    }

    public static void print(String x) {
        System.out.print(x);
    }


    public static Set<String> morseCodes(int dots, int dashes) {
        /**
         * Morse code function
         *Implement the method Encoding.morseCodes(int m, int n)
         * that yields a set of all Morse code strings with m dots and n dashes.
         * For example, morseCodes(2, 1) yields a set with ..- .-. ..- -.. in some order.
         */
        Set<String> result = new TreeSet<String>();
//        System.out.println(dots);

        //If both dashes and dots are equal
        if (dashes == 0 && dots == 0)
        {
            result.add("");
        }
        //if dashes is 0
        else if (dashes == 0)
        {
            //loop through every value in the result string from morseCodes
            for (String value : morseCodes(dots - 1, dashes))
            {
//                System.out.println(dots);
//                System.out.println(dashes);
                result.add(value + '.');
            }
        }
        else if (dots == 0)
        {
            //loop through every value in the result string from morseCodes
            for (String value : morseCodes(dots, dashes - 1))
            {
                result.add(value + '-');
            }
        }

        else
            {
                //loop through every value in the result string from morseCodes
            for (String value : morseCodes(dots, dashes - 1))
            {
                result.add(value + "-");
            }
                //loop through every value in the result string from morseCodes
            for (String value : morseCodes(dots - 1, dashes))
            {
                result.add(value + ".");
            }
        }
        //return the result string treeset
        return result;

    }

    public static void main(String[] args) {

        System.out.println(morseCodes(2, 1));


    }
}
