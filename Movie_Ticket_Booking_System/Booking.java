class Booking
{
    private Customer customer;
    private Theatre theatre;
    private Seat seat;
    private Show show;
    private String bookingDate;
    private int amount;
    private int noOfSeats;

    Booking(Customer customer,Theatre theatre, Seat seat,Show show,String bookingDate, int amount,int noOfSeats)
    {
        this.customer=customer;
        this.theatre=theatre;
        this.seat=seat;
        this.show=show;
        this.bookingDate=bookingDate;
        this.amount=amount;
        this.noOfSeats=noOfSeats;
    }

    public String getbookingDate()
    {
        return bookingDate;
    }
    public int getnoOfDates()
    {
        return noOfSeats;
    }
    // calculate Amount()
    public int calculateCharges(char seatClassType, int noOfSeats)
    {
        if(seatClassType=='A')
        {
            amount=noOfSeats*300;
        }
        else
        {
            amount=noOfSeats*200;
        }
        return amount;
    }
    //booking details;
    public void bookedDetails(String customerName,String theatreName, String showName, String bookingDate, char seatClassType, int noOfSeats, int amount)
    {
        System.out.println("Customer Name\tTheatre Name\tShow Name\tBooking Date\t Seat Class\t No of Seats \t Amount");
        System.out.println(customer.getcustomerName()+"\t\t"+theatre.getTheatreName()+"\t\t"+show.getShowName()+"\t"+bookingDate+"\t "+seatClassType+"\t\t "+ noOfSeats+"\t\t "+amount);
    }
    //printing function()
}