public class Point
{
    protected int x;
    protected int y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public String toString() { return getClass().getName() + "[x=" + x + ",y=" + y + "]"; }
//    public boolean equals(Object otherObject)
//    {
//        if (!(otherObject instanceof Point)) return false;
//        Point other = (Point) otherObject;
//        return x == other.x && y == other.y;
//    }

    public int compareTo(Point that){
        if(this.x == that.x && this.y == that.y)
        {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object o){
        Point that = (Point) o;
        return this.compareTo(that)==0;
    }
}