
package assignment13;

public class FireLane extends Ticket
{
    private int fine;
    
    public FireLane(String tag , String make, String model , String color)
    {
        super(tag, make, model , color);
        this.fine = 150;
    }
    
    public int getFine()
    {
        return fine;
    }
}
