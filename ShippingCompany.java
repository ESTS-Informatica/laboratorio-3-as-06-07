import java.util.HashSet;
import java.util.ArrayList;

/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany extends  HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;
    private ArrayList<Transport> transports;
    public ShippingCompany(String name)
    {
        this.name = name;
        inService = new ArrayList();
        transports = new ArrayList();
    }

    public String getName()
    {
        return name;
    }
    
    public void addTransport(Transport t)
    {
        transports.add(t);
    }
    
    public void makeTransportation(String id, String origin, String dest, int price)
    {
        for(Transport t: transports)
        {
            if(t.getId().equals(id) && t.isAvailable())
            {
                t.setOrigin(origin);
                t.setDestination(dest);
                t.setPrice(price);
                t.setAvailable(false);
                inService.add(t);
                transports.remove(t);
            }
        }
    }
    
    public void finalizeTransportation(String id)
    {
        for(Transport t: inService)
        {
            if(t.getId().equals(id))
            {
                t.resetValues();
            }
        }
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Transport t: transports) {
          sb.append(t.toString());
        }
        return sb.toString();
    }
}
