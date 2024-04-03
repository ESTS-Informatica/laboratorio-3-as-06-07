
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    
    ShippingCompany comp;
    public main()
    {
        GroundTransportation g1 = new GroundTransportation("22-34-on");
        GroundTransportation g2 = new GroundTransportation("62-44-fn");
        AirTransportation a1 = new AirTransportation("Boing", 10);
        AirTransportation a2 = new AirTransportation("tap", 20);
        Van v1 = new Van("33-21-rt", 34);
        Lorry l1 = new Lorry(3, 7, "33-11-tv");
        comp = new ShippingCompany("lol");
        comp.addTransport(g1);
        comp.addTransport(g2);
        comp.addTransport(a1);
        comp.addTransport(a2);
        comp.addTransport(v1);
        comp.addTransport(l1);
        System.out.println(comp.toString());
    }

}
