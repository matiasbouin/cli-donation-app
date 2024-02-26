import java.util.ArrayList;
import java.util.Collections;
public class Utils {
    public Donor getDonor(String donorName, ArrayList<Donor> donors){
        Donor result = new Donor();
        for (Donor donor : donors) {
            if (donor.getName().equals(donorName)) {
                result = donor;
            }
        }
        return result;
    }
    public Campaign getCampaign(String campaignName, ArrayList<Campaign> campaigns){
        Campaign result = new Campaign();
        for (Campaign campaign : campaigns) {
            if (campaign.getName().equals(campaignName)) {
                result = campaign;
            }
        }
        return result;
    }
    public ArrayList<String> alphabeticalOrderDonors(ArrayList<Donor> donors){
        ArrayList<String> orderedDonors = new ArrayList<>();
        for (Donor donor : donors) {
            orderedDonors.add(donor.getName());
        }
        Collections.sort(orderedDonors);
        return orderedDonors;
    }
    public ArrayList<String> alphabeticalOrderCampaigns(ArrayList<Campaign> campaigns){
        ArrayList<String> orderedCampaigns = new ArrayList<>();
        for (Campaign campaign : campaigns) {
            orderedCampaigns.add(campaign.getName());
        }
        Collections.sort(orderedCampaigns);
        return orderedCampaigns;
    }
}


