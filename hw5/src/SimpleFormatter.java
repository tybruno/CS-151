import java.util.ArrayList;
import java.util.HashMap;

/**
 A simple invoice formatter.
 */

public class SimpleFormatter implements InvoiceFormatter
{
    private HashMap<LineItem,Integer> items = new HashMap<>();

    public String formatHeader()
    {
        total = 0;
        return "     I N V O I C E\n\n\n";
    }

    public String formatLineItem(LineItem item)
    {
        total += item.getPrice();



        if(!this.items.containsKey(item)){
            this.items.put(item,0);

            return (String.format(
                    "%s: $%.2f\n",item.toString(),item.getPrice()));
        }

        System.out.println(items.get(item) + " Before");
        this.items.put(item,this.items.get(item)+1);
        System.out.println(items.get(item )+ " After add");
        return (String.format(
                "%s: $%.2f x %d\n",item.toString(),item.getPrice(),items.get(item)));

    }

    public String formatFooter()
    {
        return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
    }

    private double total;
}
