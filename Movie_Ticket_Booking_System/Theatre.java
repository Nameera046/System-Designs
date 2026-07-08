class Theatre
{
    private String theatreName;
    private Seat[] seats;

    Theatre(String theatrename, int classASeats, int classBSeats)
    {
        this.theatreName=theatreName;
        seats=new Seat[classASeats + classBSeats];
        int index=0;
        for(int i=1;i<=classASeats;i++)
        {
            seats[index++]=new Seat(i,'A',50);
        }
        for(int i=1;i<=classBSeats;i++)
        {
            seats[index++]=new Seat(i,'B',50);
        }
    }
    public String getTheatreName()
    {
        return theatreName;
    }
    //function for getSeats

    //function for the bookeSeat
}