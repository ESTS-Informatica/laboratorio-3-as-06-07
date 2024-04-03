
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport
{
    // instance variables - replace the example below with your own
    private String name;
    private int numberOfContainers;
    private final double time = 0.4;
    public AirTransportation(String name, int numberOfContainers)
    {
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumberOfContainers()
    {
        return numberOfContainers;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setNumberOfContainers(int newNumber)
    {
        numberOfContainers = newNumber;
    }

    
}
