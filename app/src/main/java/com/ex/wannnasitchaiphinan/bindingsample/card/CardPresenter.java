package com.ex.wannnasitchaiphinan.bindingsample.card;

import android.util.Log;

import com.ex.wannnasitchaiphinan.bindingsample.card.data.CardApi;
import com.ex.wannnasitchaiphinan.bindingsample.card.model.Card;
import com.ex.wannnasitchaiphinan.bindingsample.card.data.CardResponse;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class CardPresenter implements CardContract.Action {
    private CardContract.View view;
    private List<Card> cards;
    private CardApi cardApi;

    public CardPresenter(CardContract.View view, List<Card> cards, CardApi cardApi) {
        this.view = view;
        this.cards = cards;
        this.cardApi = cardApi;
    }

    @Override
    public void loadCard() {
        cardApi.getCard(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(this::processCardResponse)
                .doOnError(throwable -> logError("LoadCard", throwable))
                .subscribe();
    }

    private void logError(String tag, Throwable throwable) {
        Log.e(tag, "" + throwable);
    }

    private void processCardResponse(CardResponse cardResponse) {
        cards.addAll(cardResponse.getCards());
        view.updateList();
    }
}
