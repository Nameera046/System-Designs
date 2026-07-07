import java.util.*;

public class BookingSystem 
{
    private List<Taxi> taxis;
    private int bookingId=1;
    BookingSystem(int taxicount)
    {
        taxis=new ArrayList<>();
        for(int i=1;i<=taxicount;i++)
        {
            taxis.add(new Taxi(i));
        }
    }
    public int calculatecharges(char pickup,char drop)
    {
        int distance=Math.abs(pickup-drop)*15;
        int charges=100;
        distance-=5;
        charges+=distance*10;
        return charges;
    }
    Taxi findTaxi(char pickup, int pickuptime)
    {
        List<Taxi> freetaxis=new ArrayList<>();
        for(Taxi t:taxis)
        {
            if(t.isFree(pickup, pickuptime))
            {
                freetaxis.add(t);
            }
        }
        if(freetaxis.isEmpty())
        {
            return null;
        }
        int mindistance=Integer.MAX_VALUE;
        for(Taxi t:freetaxis)
        {
            int distance=Math.abs(pickup-t.getcurrentspot());
            if(distance<mindistance)
            {
                mindistance=distance;
            }
        }
        List<Taxi> closet=new ArrayList<>();
        for(Taxi t:freetaxis)
        {
            int distance=Math.abs(pickup-t.getcurrentspot());
            if(distance==mindistance)
            {
                closet.add(t);
            }
        }
        Taxi selected=closet.get(0);
        for(Taxi t: closet)
        {
            if(t.getearnings()<selected.getearnings())
            {
                selected=t;
            }
        }
        return selected;
    }
    void bookTaxi(Customer c)
    {
        Taxi selected=findTaxi(c.getpickupplace(), c.getpickuptime());
        if(selected==null)
        {
            System.out.println("No Taxi is Available");
            return;
        }
        int traveltime=Math.abs(c.getpickupplace()-c.getdropplace());
        int droptime=c.getpickuptime()+traveltime;
        int charges=calculatecharges(c.getpickupplace(),c.getdropplace());
        Booking booking=new Booking(bookingId, droptime,charges,c);
        bookingId++;
        selected.assignbooking(booking);
        selected.setearnings(selected.getearnings()+charges);
        selected.setfreetime(droptime);
        selected.setcurrentspot(c.getdropplace());
        System.out.println("Taxi can be allocated");
        System.out.println("Taxi - "+selected.gettaxiId() +" is allocated.");
    }
    void printdetails()
    {
        System.out.println();
        System.out.println();
        for(Taxi t: taxis)
        {
            System.out.println("Taxi - "+t.gettaxiId() + "Earnings : "+t.getearnings());
            System.out.println("Booking Id\tCustomerId\tFrom\tTo\tPickupTime\tDropTime\tAmount");        
            for(Booking b:t.getBookings())
            {
                System.out.println( b.getbookingId() + "\t\t" + b.getCustomerId() + "\t\t" +b.getpickuplace() + "\t" +b.getdropplace() + "\t" +b.getpickuptime() + "\t\t" +b.getdroptime() + "\t\t" +b.getamount());
            }
        }
    }
}
