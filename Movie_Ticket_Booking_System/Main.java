class Main{
public static void main(String[] args)
{
    Owner owner = new Owner(1,"Arun","9876543210");

    Theatre theatre = new Theatre("PVR",5,5);

    Show show = new Show("Bahubali","20-07-2026");

    Customer customer = new Customer(101,"Nameera");

    Seat seat = theatre.bookSeat('A');

    Booking booking = new Booking(customer, theatre,seat,show, "20-07-2026",0,4);
    
    theatre.addBooking(booking);

    booking.bookedDetails(customer.getcustomerName(), theatre.getTheatreName(), show.getShowName(),booking.getbookingDate(),'A',2,booking.calculateCharges('A',2));
    owner.getSalesInfo(theatre,"01-07-2026","31-07-2026");
}
}