package com.example.wannnasitchaiphinan.bindingsample.card.data;

import com.example.wannnasitchaiphinan.bindingsample.card.model.Card;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CardResponse {

    @SerializedName("cards")
    private List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }

}
