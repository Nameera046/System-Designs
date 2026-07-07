class Booking
{
    private int bookingId;
    private int droptime;
    private int amount;
    private Customer customer;

    Booking(int bookingId, int droptime,int amount, Customer customer)
    {
        this.bookingId=bookingId;
        this.droptime=droptime;
        this.amount=amount;
        this.customer=customer;
    }
    public int getbookingId()
    {
        return bookingId;
    }
    public int getdroptime()
    {
        return droptime;
    }
    public int getamount()
    {
        return amount;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public int getCustomerId()
    {
        return customer.getCustomerId();
    }
    public char getpickuplace()
    {
        return customer.getpickupplace();
    }
    public char getdropplace()
    {
        return customer.getdropplace();
    }
    public int getpickuptime()
    {
        return customer.getpickuptime();
    }
}