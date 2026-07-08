class Theatre
{
    private Booking bookings[]=new Booking[100];
    private int count=0;
    private String theatreName;
    private Seat[] seats;

    Theatre(String theatreName, int classASeats, int classBSeats)
    {
        this.theatreName=theatreName;
        seats=new Seat[classASeats + classBSeats];
        int index=0;
        for(int i=1;i<=classASeats;i++)
        {
            seats[index++]=new Seat(i,'A');
        }
        for(int i=1;i<=classBSeats;i++)
        {
            seats[index++]=new Seat(i,'B');
        }
    }
    public void addBooking(Booking booking)
    {
        bookings[count++]=booking;
    }
    public Booking[] getBookings()
    {
        return bookings;
    }
    public String getTheatreName()
    {
        return theatreName;
    }
    public int getBookingCount()
    {
        return count;
    }
    //function for getSeats
    public int getSeats(char seatType)
    {
        int count=0;
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i].getseatType()==seatType)
            {
                count++;
            }
        }
        return count;
    }
    //function for the bookeSeat
    public Seat bookSeat(char seatType)
    {
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i].getseatType()==seatType)
            {
                return seats[i];
            }
        }
        return null;
    }
}