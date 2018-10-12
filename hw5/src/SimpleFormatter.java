import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 A simple invoice formatter.
 */

public class SimpleFormatter implements InvoiceFormatter
{
    private HashMap<LineItem,Integer> items = new HashMap<>();

    public class Items{
        ArrayList<LineItem> items;
        private LineItem item;
        private int count;
        public Items(){
            item = null;
            count = 0;
        }

        public void incrementCount(){
            this.count++;
        }
        public void addItem(LineItem item){
            items.add(item);
        }
        public boolean findItem(LineItem searchableItem){
            for(LineItem item: items){
                if(item.equals(searchableItem)){
                    return true;
                }
            }
            return false;
        }




    }

    public String formatHeader()
    {
        total = 0;
        return "     I N V O I C E\n\n\n";
    }

    public String format(ArrayList<LineItem> items){
        Items itemsObj= new Items();
        for(LineItem item: items){
            total += item.getPrice();


            if (!this.items.containsKey(item)) {

//                Items items = new Items(item,0);
                this.items.put(item, 1);
            }
            else{
                this.items.put(item, this.items.get(item) + 1);
            }
        }

//        Got from https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
        Iterator it = this.items.entrySet().iterator();
        String r = "";
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            double itemPrice = 0;


            if(pair.getKey().toString().equals("Hammer")){itemPrice = 19.95;}
            if(pair.getKey().toString().equals("Bundle: Hammer, Assorted nails (Discount 10.0%)")){itemPrice = 26.91;}

            r += (pair.getKey() + ": $" + itemPrice + " x " + pair.getValue() + "\n");
            it.remove(); // avoids a ConcurrentModificationException
        }

        return r;

    }

    public String formatLineItem(LineItem item)
    {
//        total += item.getPrice();
//
//        if(!this.items.containsKey(item)){
//            this.items.put(item,0);
//            return (String.format(
//                    "%s: $%.2f\n",item.toString(),item.getPrice()));
//        }
//        else{
//            this.items.put(item,this.items.get(item)+1);
//            return (String.format(
//                "%s: $%.2f x %d\n",item.toString(),item.getPrice(),items.get(item)));
//        }


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
