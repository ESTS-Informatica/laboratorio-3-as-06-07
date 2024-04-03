
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;
    private String plate;
    public Lorry(int numberOfPallets, int trailers, String plate)
    {
        super(plate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    public int getNumberOfPallets()
    {
        return numberOfPallets;
    }
    
    public int getTrailers()
    {
        return trailers;
    }
    
    public void setTrailers(int newNumber)
    {
        trailers = newNumber;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "Trailers", getTrailers()));
                sb.append(String.format("\n%15s: %s\n", "Number Of Pallets", getNumberOfPallets()));  

        sb.append(super.toString());
        return sb.toString();
    }

    
    
}
