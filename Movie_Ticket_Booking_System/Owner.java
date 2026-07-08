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
}