
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{
    private int packages;
    public Van(String plate, int packages)
    {
       super(plate);
       this.packages = packages;
    }

    public int getPacakges()
    {
        return packages;
    }
    
    public void setPackages(int newNumber)
    {
        packages = newNumber;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "Packages", getPacakges()));  
        sb.append(super.toString());
        return sb.toString();
    }
}
