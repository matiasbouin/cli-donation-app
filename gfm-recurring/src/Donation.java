public class Donation {
    private Donor donor;
    private Campaign campaign;
    private int amount;
    public Donation(Donor donor, Campaign campaign, int amount){
        this.donor = donor;
        this.campaign = campaign;
        this.amount = amount;
    }
    public Donor getDonor() {
        return donor;
    }
    public Campaign getCampaign() {
        return campaign;
    }
    public int getAmount() {
        return amount;
    }
}
