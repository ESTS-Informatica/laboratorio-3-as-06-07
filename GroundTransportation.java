
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private final double time = 0.3;
    
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

}
