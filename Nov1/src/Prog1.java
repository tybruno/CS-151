public class Prog1
{
    public static void main(String[] args) throws Exception
    {
        Person fred = new Person("Fred");
        Person barney = new Person("Barney");
        Person cloneOfFred = fred.clone();
        fred.befriend(barney);
        barney.befriend(fred);
        System.out.println(cloneOfFred);
    }
}
