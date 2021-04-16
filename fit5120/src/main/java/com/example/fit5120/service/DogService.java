package com.example.fit5120.service;


import com.example.fit5120.entity.Dog;
import org.springframework.stereotype.Service;

@Service
public class DogService {
   public Dog getDog(){
     Dog dog = new Dog();
     //add data
     dog.setCommonName("Dingo");
     dog.setScientificName("Canis lupus");
     dog.setTaxonomyClass("Mammalia");
     dog.setTaxonomyFamily("Canidae");
     dog.setTaxonomyGenus("Canis");
     dog.setDiet("Wild dogs eat a variety of domestic animals including sheep, cattle and goats. The main diet of wild dogs consists of – kangaroo, rabbit, wallaby, rodents, birds, brushtail possum, common wombat.");
     dog.setHabits("Wild dogs live in a range of habitats provided there is adequate water, food and shelter. Forests, woodlands, grazing land, rural residential areas and the urban fringe are all inhabited by wild dogs and dingoes.");
     dog.setAppearance("Dingoes have short bristled tails and generally have a ginger coat with white points (on the ears, feet and tail). "+
                       "Dingoes can also have coats that are cream, black and tan or black and white. "+
                      "Other coat colours, such as sable, brindle, patchy ginger and white and patchy black and white indicate domestic or hybrid wild dogs.");
     dog.setOriginPlace("Europe. " + "Asia.");
     dog.setSpread("It was introduced to Australia by Asian seafarers about 4000 years ago. " +
                   "Domestic dogs arrived with European settlers in 1788. " +
                   "Hybridisation of these two sub-species has led to a smaller proportion of pure dingoes in Australia.");

     //additional data
     dog.setAppearanceImage("https://i.loli.net/2021/04/01/hfgPvKC3eOpQ82Z.jpg");
     dog.setBehaviour("Generally wild dogs are most active at dawn and dusk however activity can occur day or night. The majority of this activity occurs within the wild dog's home range.");
     dog.setPrey("Adult wild dogs have no major predators in Victoria, although foxes and wedge tailed eagles may prey upon wild dog pups when they are small.");
     dog.setEcosystemIcon("https://i.loli.net/2021/04/01/kHiAWcfvduMU4hj.png");
     dog.setEcosystemImpact("Predation by dogs can have an impact on remnant populations of endangered animal species.");
     dog.setEconomicIcon("https://i.loli.net/2021/04/01/N8nXfEmlRxG4p7H.png");
     dog.setEconomicImpact("Sometimes dogs will chase an animal without killing it, which can stress the animal resulting in mismothering and the loss of production. Total economic impact must also take into account the loss of potential genetic gain, the redirection of resources away from farm activities to control effort and land values.");
     dog.setSocialIcon("https://i.loli.net/2021/04/01/6IGSbyhVazLpTfo.png");
     dog.setAgricultureIcon("https://i.loli.net/2021/04/01/jfBiJl1K4Rmu8kh.png");
     dog.setHealthImpact("Wild dogs can have significant impacts on farming communities. They also have the potential to impact human health. All dogs can carry a parasite called the hydatid tapeworm (Echinococcus granulosus), which has the potential to cause fatality in humans.");
     dog.setAgricultureImpact("The primary agricultural impact of wild dogs is stock losses. Wild dog attacks cause an average 1900 sheep deaths annually. Sheep are not the only livestock attacked by wild dogs, often cattle and goats are also targeted.");

     dog.setDistribution("In the east of the state, wild dogs are present in the heavily timbered areas of the eastern highlands from the NSW border in the north and to the Healesville and Gembrook areas in the south." +
             "The north-west of the state has another population of wild dogs in the big desert region.");

     return dog;
   }


}
