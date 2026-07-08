class Seat{
    private int seatNo;
    private char seatType;
    public int noOfSeats;
    private boolean isBooked;

    Seat(int seatNo, char seatType,int noOfSeats)
    {
        this.seatNo=seatNo;
        this.seatType=seatType;
        this.noOfSeats=noOfSeats;
        isBooked=false;
    }

    public int getSeatNo()
    {
        return seatNo;
    }
    public char getseatType()
    {
        return seatType;
    }
    public int getnoOfSeats()
    {
        return noOfSeats;
    }
}