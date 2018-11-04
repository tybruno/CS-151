public class LabeledPoint extends Point implements Comparable<LabeledPoint>
{
//    private int x, y;
    private String label;
    public LabeledPoint(int x, int y, String label) { super(x, y); this.label = label; }
    public boolean equals(Object o){
        Point that = (Point) o;
        return this.compareTo(that) ==0;
    }

    public int compareTo(LabeledPoint that){
        if(this.label.compareTo(that.label) != 0)
        {
            if(this.x == that.x && this.y == that.y){
                return 0;
            }

            return 1;
        }
        else{
            return 0;
        }


    }


    public String toString() { return super.toString() + "[label=" + label + "]"; }
}