import java.util.*;
import javax.swing.event.*;

/**
 An invoice for a sale, consisting of line items.
 */
public class Invoice
{
    /**
     Constructs a blank invoice.
     */
    public Invoice()
    {
        items = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    /**
     Adds an item to the invoice.
     @param item the item to add
     */
    public void addItem(LineItem item)
    {
        items.add(item);
        // Notify all observers of the change to the invoice
        ChangeEvent event = new ChangeEvent(this);
        for (ChangeListener listener : listeners)
            listener.stateChanged(event);
    }

    /**
     Adds a change listener to the invoice.
     @param listener the change listener to add
     */
    public void addChangeListener(ChangeListener listener)
    {
        listeners.add(listener);
    }

    /**
     Gets an iterator that iterates through the items.
     @return an iterator for the items
     */
    public Iterator<LineItem> getItems()
    {
        return new
                Iterator<LineItem>()
                {
                    public boolean hasNext()
                    {
                        return current < items.size();
                    }

                    public LineItem next()
                    {
                        return items.get(current++);
                    }

                    public void remove()
                    {
                        items.remove(current--);
//                        throw new UnsupportedOperationException();
                    }


                    public int current = 0;
                };
    }

    public String format(InvoiceFormatter formatter)
    {
        String header = formatter.formatHeader();
        Iterator<LineItem> iter = getItems();

        String r = "";
//        System.out.println(items);
        while (iter.hasNext())
            //This seems to iterate more then it should

//            System.out.println(formatter.formatLineItem(iter.next()));
            r = formatter.formatLineItem(iter.next());

        String footer = formatter.formatFooter();

        return header + r + footer;
    }

    private ArrayList<LineItem> items;
    private ArrayList<ChangeListener> listeners;
}
