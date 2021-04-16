package com.example.fit5120.service;


import com.example.fit5120.entity.pig;
import org.springframework.stereotype.Service;

@Service
public class PigService {
    public pig getPig(){

    pig Pig = new pig();
    Pig.setCommonName("Feral Pig");
    Pig.setScientificName("Sus Scrofa");
    Pig.setTaxonomyClass("Mammalia");
    Pig.setTaxonomyFamily("Suidae");
    Pig.setTaxonomyGenus("Sus");
    Pig.setDiet("Feral pigs will feed on almost anything and will switch food preferences depending on availability. Succulent green vegetation is the food item of choice, however feral pigs will eat fruit, grain, and a wide variety of animal material such as frogs, fish, reptiles, birds, small mammals and carrion.");
    Pig.setHabits("Shelter is important for feral pigs as it provides them with shade and protection from predators. Feral pigs typically prefer to live in moist environments that can provide a reliable and adequate food and water supply.");
    Pig.setAppearance("They also have well developed shoulders and necks and smaller, shorter hindquarters than domestic pigs. " +
                       "Feral pig hair is more sparse, longer and coarser than domestic pigs and black is the most common colour though they can also be rusty red and of mixed colours including white, light ginger, brown and white, brown with black spots, brindle and agouti (brown or black with a lighter tip). " +
                       "Sometimes piglets are marked with dark longitudinal stripes, which disappear as they grow older. Feral pigs also have longer, larger snouts and tusks, smaller ears and much narrower backs. " +
                      "The tails of feral pigs are usually straight with a bushy tip rather than curly as is the case with domestic pigs.");
    Pig.setOriginPlace("Europe. "+"Asia.");
    Pig.setSpread("Pigs were brought from Europe to Australia by the First Fleet in 1788. Imported as livestock, pigs soon escaped and established wild populations that have expanded over time.");

    //additional information
     Pig.setAppearanceImage("https://i.loli.net/2021/04/01/ukUYMyd6fotSKDX.jpg");
        Pig.setAgricultureIcon("https://i.loli.net/2021/04/01/jfBiJl1K4Rmu8kh.png");
        Pig.setEconomicIcon("https://i.loli.net/2021/04/01/N8nXfEmlRxG4p7H.png");
        Pig.setEcosystemIcon("https://i.loli.net/2021/04/01/kHiAWcfvduMU4hj.png");
        Pig.setSocialIcon("https://i.loli.net/2021/04/01/6IGSbyhVazLpTfo.png");
        Pig.setBehaviour("Feral pigs restrict their activity to the cooler parts of the day at dawn and dusk and are primarily nocturnal. Feral pigs are shy animals and will avoid humans, making it easy to overlook their presence or drastically underestimate their numbers.");
        Pig.setPrey("The piglets of feral pigs are prone to predation by dingoes, wild dogs, large birds of prey.");
        Pig.setEcosystemImpact("Feral pigs are considered an environmental pest due to their selective feeding, trampling and rooting for underground parts of plants and invertebrates.");
        Pig.setEconomicImpact("Feral pigs can reduce yields in grain, sugarcane, fruit and vegetable crops, through uprooting and consuming or trampling of plants, and their wallowing and defecation foul dams and waterholes. Feral pigs can also transport weeds and their diggings provide ideal conditions for weed establishment.");
        Pig.setAgricultureImpact("Feral pigs cause significant damage in agricultural areas. They prey on newborn lambs, compete with livestock for pasture and can damage infrastructure such as fencing and water facilities.");
        Pig.setHealthImpact("Feral pigs can be seen as a food and a valuable hunting resource to some members of the community.");

        Pig.setDistribution("Feral pigs are widespread throughout Victoria.");

        return Pig;

    }

}
