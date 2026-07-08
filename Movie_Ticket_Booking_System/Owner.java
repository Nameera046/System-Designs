class Owner
{
    private int ownerId;
    private String ownerName;
    private String ownerMobileNo;

    Owner(int ownerId, String ownerName, String ownerMobileNo)
    {
        this.ownerId=ownerId;
        this.ownerName=ownerName;
        this.ownerMobileNo=ownerMobileNo;
    }
     
    public int getownerId()
    {
        return ownerId;
    }
    public String getownerName()
    {
        return ownerName;
    }
    public String getownerMobileNo()
    {
        return ownerMobileNo;
    }
    ///salesInfo function;
    public void getSalesInfo(Theatre theatre, String from, String to)
    {
        Booking bookings[]=theatre.getBookings();
        int total=0;
        for(int i=0;i<theatre.getBookingCount();i++)
        {
            if(bookings[i].getbookingDate().compareTo(from)>=0 && bookings[i].getbookingDate().compareTo(to)<=0)
            {
                total+=bookings[i].calculateCharges('A',1);
            }
        }
        System.out.println("Sales From "+from+" to "+to );
        System.out.println("Total Sales : "+total);
    }
}