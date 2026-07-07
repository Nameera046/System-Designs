class Customer
{
    private int customerId;
    private char pickup;
    private char drop;
    private int pickuptime;

    Customer(int customerId, char pickup, char drop, int pickuptime)
    {
        this.customerId=customerId;
        this.pickup=pickup;
        this.drop=drop;
        this.pickuptime=pickuptime;
    }

    public int getCustomerId()
    {
        return customerId;
    }
    public char getpickupplace()
    {
        return pickup;
    }
    public char getdropplace()
    {
        return drop;
    }
    public int getpickuptime()
    {
        return pickuptime;
    }
}