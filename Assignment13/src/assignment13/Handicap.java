
package assignment13;

public class Handicap extends Ticket
{
    private int fine;
    
    public Handicap(String tag , String make, String model , String color)
    {
        super(tag, make, model , color);
        this.fine = 100;
    }
    
    public int getFine()
    {
        return fine;
    }
}
