package com.example.wannnasitchaiphinan.bindingsample.card.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Card {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("nationalPokedexNumber")
    private int nationalPokedexNumber;
    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("imageUrlHiRes")
    private String imageUrlHiRes;
    @SerializedName("supertype")
    private String supertype;
    @SerializedName("subtype")
    private String subtype;
    @SerializedName("ability")
    private Ability ability;
    @SerializedName("hp")
    private String hp;
    @SerializedName("convertedRetreatCost")
    private int convertedRetreatCost;
    @SerializedName("number")
    private String number;
    @SerializedName("artist")
    private String artist;
    @SerializedName("rarity")
    private String rarity;
    @SerializedName("series")
    private String series;
    @SerializedName("set")
    private String set;
    @SerializedName("setCode")
    private String setCode;
    @SerializedName("evolvesFrom")
    private String evolvesFrom;
    @SerializedName("types")
    private List<String> types;
    @SerializedName("retreatCost")
    private List<String> retreatCost;
    @SerializedName("text")
    private List<String> text;
    @SerializedName("attacks")
    private List<Attack> attacks;
    @SerializedName("weaknesses")
    private List<Weakness> weaknesses;
    @SerializedName("resistances")
    private List<Weakness> resistances;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationalPokedexNumber() {
        return nationalPokedexNumber;
    }

    public void setNationalPokedexNumber(int nationalPokedexNumber) {
        this.nationalPokedexNumber = nationalPokedexNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrlHiRes() {
        return imageUrlHiRes;
    }

    public void setImageUrlHiRes(String imageUrlHiRes) {
        this.imageUrlHiRes = imageUrlHiRes;
    }

    public String getSupertype() {
        return supertype;
    }

    public void setSupertype(String supertype) {
        this.supertype = supertype;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public int getConvertedRetreatCost() {
        return convertedRetreatCost;
    }

    public void setConvertedRetreatCost(int convertedRetreatCost) {
        this.convertedRetreatCost = convertedRetreatCost;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getSetCode() {
        return setCode;
    }

    public void setSetCode(String setCode) {
        this.setCode = setCode;
    }

    public String getEvolvesFrom() {
        return evolvesFrom;
    }

    public void setEvolvesFrom(String evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getRetreatCost() {
        return retreatCost;
    }

    public void setRetreatCost(List<String> retreatCost) {
        this.retreatCost = retreatCost;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public List<Weakness> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<Weakness> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public List<Weakness> getResistances() {
        return resistances;
    }

    public void setResistances(List<Weakness> resistances) {
        this.resistances = resistances;
    }

}
