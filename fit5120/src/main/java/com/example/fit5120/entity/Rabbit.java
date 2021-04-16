package com.example.fit5120.entity;


import javax.persistence.*;

@Entity
@Table
public class Rabbit {

    @Id
    @SequenceGenerator(
            name = "rabbit_sequence",
            sequenceName = "rabbit_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rabbit_sequence"
    )
    private int id;
    private String commonName;
    private String scientificName;
    private String taxonomyClass;
    private String taxonomyFamily;
    private String taxonomyGenus;
    private String diet;
    private String habitat;

    private String appearance;
    private String originPlace;
    private String spread;

    //additional information
    private String appearanceImage;
    private String ecosystemIcon;
    private String economicIcon;
    private String socialIcon;
    private String agricultureIcon;


    private String prey;
    private String behaviour;

    private String ecosystemImpact;
    private String economicImpact;
    private String healthImpact;
    private String agricultureImpact;

    private String distribution;

    public Rabbit() {

    }

    public Rabbit(int id, String commonName, String scientificName, String taxonomyClass, String taxonomyFamily, String taxonomyGenus, String diet, String habits, String appearance, String originPlace, String spread, String appearanceImage, String ecosystemIcon, String economicIcon, String socialIcon, String agricultureIcon, String prey, String behaviour, String ecosystemImpact, String economicImpact, String healthImpact, String agricultureImpact, String distribution) {
        this.id = id;
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.taxonomyClass = taxonomyClass;
        this.taxonomyFamily = taxonomyFamily;
        this.taxonomyGenus = taxonomyGenus;
        this.diet = diet;
        this.habitat = habits;
        this.appearance = appearance;
        this.originPlace = originPlace;
        this.spread = spread;
        this.appearanceImage = appearanceImage;
        this.ecosystemIcon = ecosystemIcon;
        this.economicIcon = economicIcon;
        this.socialIcon = socialIcon;
        this.agricultureIcon = agricultureIcon;
        this.prey = prey;
        this.behaviour = behaviour;
        this.ecosystemImpact = ecosystemImpact;
        this.economicImpact = economicImpact;
        this.healthImpact = healthImpact;
        this.agricultureImpact = agricultureImpact;
        this.distribution = distribution;
    }

    public int getId() {
        return id;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getTaxonomyClass() {
        return taxonomyClass;
    }

    public String getTaxonomyFamily() {
        return taxonomyFamily;
    }

    public String getTaxonomyGenus() {
        return taxonomyGenus;
    }

    public String getDiet() {
        return diet;
    }

    public String getHabits() {
        return habitat;
    }

    public String getAppearance() {
        return appearance;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public String getSpread() {
        return spread;
    }

    public String getAppearanceImage() {
        return appearanceImage;
    }

    public String getEcosystemIcon() {
        return ecosystemIcon;
    }

    public String getEconomicIcon() {
        return economicIcon;
    }

    public String getSocialIcon() {
        return socialIcon;
    }

    public String getAgricultureIcon() {
        return agricultureIcon;
    }

    public String getPrey() {
        return prey;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public String getEcosystemImpact() {
        return ecosystemImpact;
    }

    public String getEconomicImpact() {
        return economicImpact;
    }

    public String getHealthImpact() {
        return healthImpact;
    }

    public String getAgricultureImpact() {
        return agricultureImpact;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public void setTaxonomyClass(String taxonomyClass) {
        this.taxonomyClass = taxonomyClass;
    }

    public void setTaxonomyFamily(String taxonomyFamily) {
        this.taxonomyFamily = taxonomyFamily;
    }

    public void setTaxonomyGenus(String taxonomyGenus) {
        this.taxonomyGenus = taxonomyGenus;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void setHabits(String habits) {
        this.habitat = habits;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public void setAppearanceImage(String appearanceImage) {
        this.appearanceImage = appearanceImage;
    }

    public void setEcosystemIcon(String ecosystemIcon) {
        this.ecosystemIcon = ecosystemIcon;
    }

    public void setEconomicIcon(String economicIcon) {
        this.economicIcon = economicIcon;
    }

    public void setSocialIcon(String socialIcon) {
        this.socialIcon = socialIcon;
    }

    public void setAgricultureIcon(String agricultureIcon) {
        this.agricultureIcon = agricultureIcon;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public void setEcosystemImpact(String ecosystemImpact) {
        this.ecosystemImpact = ecosystemImpact;
    }

    public void setEconomicImpact(String economicImpact) {
        this.economicImpact = economicImpact;
    }

    public void setHealthImpact(String healthImpact) {
        this.healthImpact = healthImpact;
    }

    public void setAgricultureImpact(String agricultureImpact) {
        this.agricultureImpact = agricultureImpact;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "id=" + id +
                ", commonName='" + commonName + '\'' +
                ", scientificName='" + scientificName + '\'' +
                ", taxonomyClass='" + taxonomyClass + '\'' +
                ", taxonomyFamily='" + taxonomyFamily + '\'' +
                ", taxonomyGenus='" + taxonomyGenus + '\'' +
                ", diet='" + diet + '\'' +
                ", habits='" + habitat + '\'' +
                ", appearance='" + appearance + '\'' +
                ", originPlace='" + originPlace + '\'' +
                ", spread='" + spread + '\'' +
                '}';
    }
}
