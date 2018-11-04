import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Prog2
{
    public static void main(String[] args) throws Exception
    {
        Person fred = new Person("Fred", "https://upload.wikimedia.org/wikipedia/en/thumb/a/ad/Fred_Flintstone.png/165px-Fred_Flintstone.png");
        fred.show();
//        Person fred = new Person("Fred");
        Person barney = new Person("Barney");
        fred.befriend(barney);
        barney.befriend(fred);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("people.ser"));
        out.writeObject(fred);
        out.close();
        fred = null;
        barney = null;

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("people.ser"));
        Person p = (Person) in.readObject();
        System.out.println(p);
        System.out.println(p.getFriend(0));
//        p.show();
    }
}