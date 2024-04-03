
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static final double fees = 0.3;
    
    public GroundTransportation(String licensePlate)
    {
        super();
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate()
    {
        return licensePlate;
    }
    
    public void setLicensePlate(String newPlate)
    {
        licensePlate = newPlate;
    }
    
    public double getPriceWithFees()
    {
       return super.getPrice() + super.getPrice() * fees;
    }
    
    public String getTransportType()
    {
        return "Groud Transport";
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "License Plate", getLicensePlate()));  
        sb.append(super.toString());
        return sb.toString();
    }

}
