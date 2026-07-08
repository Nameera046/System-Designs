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
            return true;
        }
        return false;
    }
    public void assignbooking(Booking b)
    {
        bookings.add(b);
    }
    public int gettaxiId()
    {
        return taxiId;
    }
    public int getfreetime()
    {
        return freetime;
    }
    public char getcurrentspot()
    {
        return currentspot;
    }

    public int getearnings()
    {
        return earnings;
    }
    public List<Booking> getBookings()
    {
        return bookings;
    }
    public void setearnings(int earnings)
    {
        this.earnings=earnings;
    }
    public void setfreetime(int freetime)
    {
        this.freetime=freetime;
    }
    public void setcurrentspot(char currentspot)
    {
        this.currentspot=currentspot;
    }
}