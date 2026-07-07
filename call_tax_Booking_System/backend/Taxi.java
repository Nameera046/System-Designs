import java.util.*;
class Taxi
{
    private int taxiId;
    private int freetime;
    private char currentspot;
    private int earnings;
    private List<Booking> bookings;

    Taxi(int id)
    {
        this.taxiId=id;
        this.freetime=0;
        this.currentspot='A';
        this.earnings=0;
        bookings=new ArrayList<>();
    }
    public boolean isFree(char pickup,int pickuptime)
    {
        int traveltime=Math.abs(pickup-currentspot);
        if(freetime+traveltime<=pickuptime)
        {
            return false;
        }
        return true;
    }
    public void assignbooking(Booking b)
    {
        bookings.add(b);
    }
    public int taxiId()
    {
        return taxiId;
    }
    public int freetime()
    {
        return freetime;
    }
    public char currentspot()
    {
        return currentspot;
    }
    public int earnings()
    {
        return earnings;
    }
    public List<Booking> getBookings()
    {
        return bookings;
    }
}