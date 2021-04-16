package com.example.fit5120.service;

import com.example.fit5120.entity.Rabbit;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {

    public Rabbit getRabbit(){
        Rabbit rabbit = new Rabbit();
        rabbit.setCommonName("European Rabbit");
        rabbit.setScientificName("Oryctolagus Cuniculus");
        rabbit.setTaxonomyClass("Mammalia");
        rabbit.setTaxonomyFamily("Leporidae");
        rabbit.setTaxonomyGenus("Oryctolagus");
        rabbit.setDiet("Rabbits are highly selective grazers, with a preference for plants or parts of plants with the highest nutritional content");
        rabbit.setHabits("Soils have a strong influence on rabbit density. Rabbits prefer deep, well-drained soils (sands and light loams) which are often found on the most productive agricultural land.");
        rabbit.setAppearance("Rabbits have long hind legs and short front legs. " +
                "They have long ears and large slightly protruding eyes placed to the sides of the head that gives them panoramic vision. " +
                " Rabbits have 16 teeth in the upper jaw and 12 in the lower, including 2 pairs of upper incisors that grow continuously. ");
        rabbit.setOriginPlace("Southern France. " +  "Spain. ");
        rabbit.setSpread("European rabbits were brought over to Australia in the 1800s." +
                        "In 1859, approximately 7 rabbits were released at Barwon Park near Geelong. Just 7 years later, 14,253 rabbits were shot on Barwon Park.");

        //additional information
        rabbit.setAppearanceImage("https://i.loli.net/2021/04/01/CO7oN5nEqbt9JvM.jpg");
        rabbit.setAgricultureIcon("https://i.loli.net/2021/04/01/jfBiJl1K4Rmu8kh.png");
        rabbit.setEconomicIcon("https://i.loli.net/2021/04/01/N8nXfEmlRxG4p7H.png");
        rabbit.setEcosystemIcon("https://i.loli.net/2021/04/01/kHiAWcfvduMU4hj.png");
        rabbit.setSocialIcon("https://i.loli.net/2021/04/01/6IGSbyhVazLpTfo.png");

        rabbit.setBehaviour("Rabbits are mostly active from late afternoon to the early morning. Typically emerging about 1 to 3 hours before sunset, rabbits graze and socialise on or near the warren until dusk where they move further away.");
        rabbit.setPrey("In Australia, the most significant predators of European rabbits are -  red fox, feral cat, wild dogs and dingoes, goannas, large birds of prey such as wedge-tailed eagle.");

        rabbit.setEcosystemImpact("The impact of rabbits on the Australian environment has been disastrous and currently there are at least 304 Australian threatened species that may be adversely affected by competition and land degradation by rabbits.");
        rabbit.setEconomicImpact("In 2013/14 the national impact of rabbits through lost agricultural production was estimated at $216 million per annum. In combined data for Tasmania and Victoria rabbits are estimated to have cost approximately $30 million in lost production for the beef, lamb and wool industries per year.");
        rabbit.setHealthImpact("Feral rabbits carry Tularemia to human causing several symptoms including: Ulceroglandular tularemia, Glandular tularemia, Oculoglandular tularemia, Oropharyngeal tularemia, Pneumonic tularemia, and Typhoidal tularemia. Feral rabbits also carry disease spreading amount animals: Myxomatosis, Viral hemorrhagic disease, Encephalitozoonosis, and Pasteurellosis. ");
        rabbit.setAgricultureImpact("Excessive grazing pressure by rabbits contributes to loss of land through soil erosion which lead to off-site problems, such as reduced water quality, increased soil movement which may incur expensive repair measures. A rabbit grazes more closely to the ground than domestic stock weakening perennial grasses during summer, potentially eliminating them from established pastures. Causing compete with domestic livestock and extinction of pastures. The high rate of reproduction can cause excessive grazing, threat food supply of livestock and switch their food supply to crops instead of pastures. ");

        rabbit.setDistribution("European rabbits occur throughout Victoria except in alpine and closed forest environments.");

        return rabbit;
    }
}
