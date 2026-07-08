class Customer
{
    private int customerId;
    private String customerName;

    Customer(int customerId, String customerName)
    {
        this.customerId=customerId;
        this.customerName=customerName;
    }
    public String getcustomerName()
    {
        return customerName;
    }
}