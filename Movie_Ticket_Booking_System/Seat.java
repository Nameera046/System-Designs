class Seat{
    private int seatNo;
    private char seatType;
    private boolean isBooked;

    Seat(int seatNo, char seatType)
    {
        this.seatNo=seatNo;
        this.seatType=seatType;
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
}