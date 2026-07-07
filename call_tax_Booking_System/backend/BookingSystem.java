import java.util.*;

public class BookingSystem 
{
    private List<Taxi> taxis;
    BookingSystem(int taxicount)
    {
        taxis=new ArrayList<>();
        for(int i=1;i<=taxicount;i++)
        {
            taxis.add(new Taxi(i));
        }
    }
    void bookTaxi(Customer c)
    {
        
    }
}
