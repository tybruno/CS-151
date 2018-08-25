import java.lang.String;

public class hw1 {

    public static void println(String x)
    {
        System.out.println(x);
    }
    public static void print(String x)
    {
        System.out.print(x);
    }


    public static String uniqueLetters(String str)
    {

        String seen = "";
        String unique = "";
        for(int i = 0; i < str.length();i++)
        {
            String leftLetter = str.substring(i,i+1);

            if(seen.contains(leftLetter))
                continue;

            for(int j =i+1; j < str.length();j++)
            {
                String rightLetter = str.substring(j,j+1);

                if(leftLetter.equals(rightLetter))
                {
                    seen += rightLetter;
                }


            }

            if(!seen.contains(leftLetter))
            {
                unique += leftLetter;
            }

            seen += leftLetter;


        }


        return unique;
    }



    public static void main(String [ ] args)
    {

        String test = "harrasses";

        System.out.println(uniqueLetters(test));


    }
}
