import java.util.HashSet;
import java.util.Set;

public class Prog2Chap20
{
    public static void main(String[] args)
    {
        Set<Point2> set = new HashSet<>();
        int n = 10;
        int counter = 0;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++) {
                Point2 newObj = new Point2(i % 2, j % 2);
                set.add(newObj);
//                System.out.println(newObj.toString());
                counter++;
            }
        }

        for(Point2 obj: set){
            System.out.println(obj.toString());
        }
        System.out.println(set.size());
        System.out.println(counter);
    }
}