class Booking
{
    private Customer customer;
    private Seat seat;
    private String bookingDate;
    private int amount;

    Booking(Customer customer, Seat seat,String bookingDate, int amount)
    {
        this.customer=customer;
        this.seat=seat;
        this.bookingDate=bookingDate;
        amount=0;
    }
    // public String getCustomerName()
    // {
    //     return customer.getcustomerName();
    // }
    // public char getseatClassType()
    // {
    //     return seat.getseatType();
    // }
    // public int getnoOfSeats()
    // {
    //     return seat.getnoOfSeats();
    // }
    public String getbookingDate()
    {
        return bookingDate;
    }
    // calculate Amount()
    public int calculateCharges(char seatClassType, int noOfSeats)
    {
        return amount;
    }
    public void bookedDetails(String customerName,Theatre theatre, Show show, String bookingDate, char seatClassType, int noOfSeats, int amount)
    {
        System.out.println("Customer Name\tTheatre Name\tShow Name\tBooking Date\t Seat Class\t No of Seats \t Amount");
        System.out.println(customerName+"\t\t"+theatre.getTheatreName()+"\t\t"+show.getShowName()+"\t\t"+bookingDate+"\t\t"+calculateCharges(seatClassType, noOfSeats));
    }
    //booking details;
    //printing function()
}