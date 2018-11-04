//public class Point2
//{
//    private int x;
//    private int y;
//    public Point2(int x, int y) { this.x = x; this.y = y; }
//    public String toString() { return getClass().getName() + "[x=" + x + ",y=" + y + "]"; }
//
//    @Override
//    public boolean equals(final Object o){
//        if(o instanceof Point2){
//            return(0 == this.compareTo(((Point2) o)));
//        }
//        return false;
//    }
//    public int compareTo(final Point2 o){
//        return this.hashCode() - o.hashCode();
//    }
////    public boolean equals(Point2 obj){
////        if(this.x == obj.getX()){
////            return true;
////        }
////        else if(this.y == obj.getY()){
////            return true;
////        }
////        return false;
////    }
//
//    @Override
//    public int hashCode()
//    {
//        int z = x + y;
//        System.out.println(x + y);
//        return x + y;
//    }
//
////    private static String getKeyValuePairs(final Map<S>)
//}
public class Point2 implements Comparable<Point2>
{
    private int x;
    private int y;
    public Point2(int x, int y) { this.x = x; this.y = y; }
    public String toString() { return getClass().getName() + "[x=" + x + ",y=" + y + "]"; }
    public int hashCode()
    {
        return x + y;
    }

    public int compareTo(Point2 that){
        if(this.x == that.x && this.y == that.y)
        {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object o){
        Point2 that = (Point2) o;
        return this.compareTo(that)==0;
    }
}