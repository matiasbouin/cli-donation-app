import java.util.ArrayList;
public class Processor {
    public void process(ArrayList<String[]> commands, ArrayList<Donor> donors, ArrayList<Campaign> campaigns, ArrayList<Donation> donations){
        Utils utils = new Utils();
        for (String[] command:commands) {
            if (command[0].equals("Add")) {
                if(command[1].equals("Donor")){
                    String donorName = command[2];
                    String donationLimitString = command[3].replace("$", "");
                    int donationLimit = Integer.valueOf(donationLimitString);
                    donors.add(new Donor(donorName, donationLimit));
                }
                if(command[1].equals("Campaign")){
                    String campaignName = command[2];
                    campaigns.add(new Campaign(campaignName));
                }
            }
            if (command[0].equals("Donate")) {
                String donorName = command[1];
                Donor donor = utils.getDonor(donorName, donors);
                String campaignName = command[2];
                Campaign campaign = utils.getCampaign(campaignName, campaigns);
                String amountString = command[3].replace("$", "");
                int amount = Integer.valueOf(amountString);
                if(amount < donor.getDonationLimit()) {
                    donations.add(new Donation(donor, campaign, amount));
                }
            }
        }
    }
}
