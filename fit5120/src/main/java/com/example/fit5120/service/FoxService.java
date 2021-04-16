package com.example.fit5120.service;

import com.example.fit5120.entity.Fox;
import org.springframework.stereotype.Service;


@Service
public class FoxService {

    public Fox getFox(){
        Fox fox = new Fox();
        fox.setCommonName("Red Fox");
        fox.setScientificName("Vulpes Vulpes");
        fox.setTaxonomyClass("Mammalia");
        fox.setTaxonomyFamily("Canidae");
        fox.setTaxonomyGenus("Vulpes");
        fox.setDiet("Where present, rabbits make up a large part of fox diet. Other common food items include carrion (domestic livestock and native fauna), house mice, insects, reptiles and amphibians, birds, grain, vegetable matter (including crops), fruit crops such as grapes, apples and blackberries.");
        fox.setHabits("Foxes inhabit many urban areas, especially where there is cover provided by parklands and reserves and food is easy to find.");
        //appearance
        fox.setAppearance("Red foxes are medium-sized canids with a skull similar to that of a domestic dog, but narrower with a slender, whiskered muzzle and large pointed, erect ears. " +
                        "The fox has an elongated body with slender limbs and a long bushy tail (accounting for about 40% total length) up to about 13cm (5 in.) in diameter. " +
                        "The nose is typically black, although individuals do occasionally present with depigmentation, resulting in a pink or blotched nose (“dudley nose”)."
                      );
        // origin place
        fox.setOriginPlace("Europe. " + "Asia. " + "North America ");
        // spread
        fox.setSpread("The European red fox was deliberately introduced to Australia for recreational hunting in 1855 and fox populations became established in the wild in the early 1870s. " +
                "Within 100 years, the fox had spread across most of Australia, although it currently does not occur in the tropical north and some off-shore islands remain fox-free.");

        // additional data
        fox.setAppearanceImage("https://i.loli.net/2021/04/01/PjevDq7KHnXSO4V.jpg");
        fox.setAgricultureIcon("https://i.loli.net/2021/04/01/jfBiJl1K4Rmu8kh.png");
        fox.setEconomicIcon("https://i.loli.net/2021/04/01/N8nXfEmlRxG4p7H.png");
        fox.setEcosystemIcon("https://i.loli.net/2021/04/01/kHiAWcfvduMU4hj.png");
        fox.setSocialIcon("https://i.loli.net/2021/04/01/6IGSbyhVazLpTfo.png");

        fox.setPrey("Primary predation by foxes on domestic livestock is common and those susceptible to fox predation include poultry, newborn lambs, goat kids, deer fawns, domestic emu and ostrich chicks.");
        fox.setBehaviour("Foxes are primarily nocturnal (night-time) hunters, being most active in the evenings and early mornings");
        fox.setAgricultureImpact("Foxes cause significant distress and hardship when they kill livestock such as poultry and lambs. They can spread parasites and diseases such as mange and distemper to domestic animals ,pets and human.");
        fox.setEconomicImpact("The economic impact of foxes in Australia has been estimated at around $227.5 million per annum. This includes: $17.5 million in sheep production losses $190 million in environmental impacts $16 million in management costs $4 million in research costs.");
        fox.setEcosystemImpact("Foxes are considered a threat to 14 species of birds, 48 mammals, 12 reptiles and two amphibians. Almost any animal up to 5.5 kilograms in weight is at risk from foxes. Decline small to medium sized mammals and harm the biodiversity. A single fox is estimated to eat about 400 grams of food each night.");
        fox.setHealthImpact("Foxes carry diseases that are transmissible to domestic dogs and humans such as: sarcoptic mange, hydatids and leptospirosis.");

        fox.setDistribution("In Victoria, foxes have established populations in all terrestrial environments including urban areas, alpine heaths, rainforests, coasts and the Mallee. Victorian habitats are highly favourable for the red fox.");

        return fox;
    }
}
