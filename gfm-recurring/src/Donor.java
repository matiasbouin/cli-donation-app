public class Donor{
    private String name;
    public int donationLimit;
    public int getDonationLimit() {
        return donationLimit;
    }
    public Donor(){
    }
    public Donor(String donorName, int donationLimit){
        this.name = donorName;
        this.donationLimit = donationLimit;
    }
    public String getName() {
        return name;
    }
}
