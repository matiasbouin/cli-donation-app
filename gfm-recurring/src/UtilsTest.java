import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void getDonorTest(){
        ArrayList<Donor> donors = new ArrayList<>();
        String donorName0 = "Marina";
        String donorName1 = "Pedro";
        String donorName2 = "Matias";
        String donorName3 = "Mia";
        donors.add(new Donor(donorName0, 900));
        donors.add(new Donor(donorName1, 11000));
        donors.add(new Donor(donorName2, 130000));
        donors.add(new Donor(donorName3, 1500000));
        Donor pedro = donors.get(1);
        Utils utils = new Utils();
        assertEquals(pedro, utils.getDonor("Pedro", donors));
    }

    @Test
    void getCampaignTest(){
        ArrayList<Campaign> campaigns = new ArrayList<>();
        String campaign0 = "SaveWilly";
        String campaign1 = "MyKneeOperation";
        String campaign2 = "PlantNewTrees";
        String campaign3 = "TakeMeToAntarctica";
        campaigns.add(new Campaign(campaign0));
        campaigns.add(new Campaign(campaign1));
        campaigns.add(new Campaign(campaign2));
        campaigns.add(new Campaign(campaign3));
        Campaign PlantNewTrees = campaigns.get(2);
        Utils utils = new Utils();
        assertEquals(PlantNewTrees, utils.getCampaign("PlantNewTrees", campaigns));
    }

}