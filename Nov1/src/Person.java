import java.util.ArrayList;

public class Person implements Cloneable
{
    public Person(String name) { this.name = name; }

    public void befriend(Person p) { friends.add(p); }
    public Person getFriend(int i)
    {
        return 0 <= i && i < friends.size() ? friends.get(i) : null;
    }

    public String toString()
    {
        String result = name + ", friends =";
        for (Person f : friends) result += " " + f.name;
        return result;
    }


    public Person clone() throws CloneNotSupportedException
    {
        Person cloned = (Person) super.clone();
        cloned.friends = new ArrayList<>();
        for (Person f : friends) cloned.friends.add(f.clone());
        return cloned;
    }

    private String name;
    private ArrayList<Person> friends = new ArrayList<>();
}