import java.util.ArrayList;
public class Logger {
    public void log(ArrayList<Donor> donors, ArrayList<Campaign> campaigns, ArrayList<Donation> donations ){
        Utils utils = new Utils();
        ArrayList<String> orderedDonors = utils.alphabeticalOrderDonors(donors);
        String output = "Donors: \n";
        for (String donor : orderedDonors) {
            int totalDonations = 0;
            int donationCounter = 0;
            for (Donation donation : donations) {
                if(donation.getDonor().getName().equals(donor)){
                    totalDonations += donation.getAmount();
                    donationCounter += 1;
                }
            }
            if (donationCounter == 0){
                output += donor + " Total: $" + totalDonations + " Average: $0 \n";
            }
            if(donationCounter > 0){
                output += donor + " Total: $" + totalDonations + " Average: $" + totalDonations/donationCounter + "\n";
            }
        }
        output += "\nCampaigns: \n";
        ArrayList<String> orderedCampaigns = utils.alphabeticalOrderCampaigns(campaigns);
        for (String campaign : orderedCampaigns) {
            int total = 0;
            for (Donation donation : donations) {
                if(donation.getCampaign().getName().equals(campaign)){
                    total += donation.getAmount();
                }
            }
            output += campaign + ": Total: $" + total + "\n";
        }
        System.out.println(output);
    }
}
