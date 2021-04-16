package com.example.fit5120.service;

import com.example.fit5120.entity.Goat;
import org.springframework.stereotype.Service;

@Service
public class GoatService {

    public Goat getGoat(){

       Goat goat = new Goat();
       goat.setCommonName("Feral Goat");
       goat.setScientificName("Capra Hircus");
       goat.setTaxonomyClass("Mammalia");
       goat.setTaxonomyFamily("Bovidae");
       goat.setTaxonomyGenus("Capra");
       goat.setDiet("Despite their tendency to select high quality foods, they are capable of eating most plant species in Australia including many plants which are toxic, spiny and bitter, which sheep and cattle are likely to avoid. Availability of water limits feral goat distribution to where water occurs or is artificially provided, for example by stock watering points.");
       goat.setHabits("Feral goats will establish in any area where food, water and protection from predators is available. In mountain regions feral goats can live at high altitudes where there is food and water available. Goats are skilled rock and log climbers and regularly use caves and rock overhangs for shelter.");
       goat.setAppearance("Both male and female goats have distinctive curved or corkscrew shaped horns, although some breeds of goats may be hornless. " +
               "The coats of feral goats vary widely depending on breed including many colours and patterns. " +
               "Again, depending on breed, the hair of the goat may be short, long, curled, silky or coarse. Goats may have wattles (hanging fleshy lobes) on the neck and beards. Goats may have straight or rounded noses.");
       goat.setOriginPlace("Europe. Asia.");
       goat.setSpread("Goats arrived in Australia with the First Fleet in 1788. They were a convenient livestock animal for early European settlers, being relatively small, eating a wide range of plants and providing both meat and milk. " +
                 "During the 19th Century, sailors released many goats onto islands and the mainland for emergency food supplies.");

       //additional information
       goat.setAppearanceImage("https://i.loli.net/2021/04/01/DqsuOoYZKSUEjkc.jpg");
       goat.setAgricultureIcon("https://i.loli.net/2021/04/01/jfBiJl1K4Rmu8kh.png");
       goat.setEconomicIcon("https://i.loli.net/2021/04/01/N8nXfEmlRxG4p7H.png");
       goat.setEcosystemIcon("https://i.loli.net/2021/04/01/kHiAWcfvduMU4hj.png");
       goat.setSocialIcon("https://i.loli.net/2021/04/01/6IGSbyhVazLpTfo.png");

       goat.setBehaviour("Feral goats are highly sociable animals that form family units consisting of an adult female goat and her recent offspring.");
       goat.setPrey("Wild dogs and dingoes are the most significant predators of feral goats in Australia. Feral pigs, crocodiles, foxes and large eagles may also prey upon feral goats, in particular feral goat kids.");
       goat.setEcosystemImpact("Feral goats cause considerable environmental impacts in Victoria through soil damage, over grazing and strip browsing.");
       goat.setEconomicImpact("Economic losses as a result of the impact of feral goats can be split into four areas of costs: 1. to primary production.  2. associated with exotic diseases. 3. of land degradation caused by goats. 3. to the public to manage goats.");
       goat.setHealthImpact("Feral goats also negatively affect conservation values and biological diversity by damaging the vegetation and competing with native animals.");
       goat.setAgricultureImpact("Feral goats are a major agricultural pest throughout Australia. In Australia, feral goats have been estimated to cause losses to livestock farming of $25 million per year.");

       goat.setDistribution("Feral goats have been sighted in many state and regional parks and forests throughout Victoria.");
       return goat;
    }

}
